package org.example.controller;

import org.example.controller.action.ActionDraw;
import org.example.model.Model;
import org.example.model.MyShape;
import org.example.model.NoFill;
import org.example.model.shape.factory.fill.RectangleCreate;
import org.example.model.shape.factory.fill.RectangleFactory;
import org.example.view.MyFrame;
import org.example.view.MyPanel;

import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

// TODO: 24.10.2024 Сделать singleton класс
public class Controller {
    private Model model;
    private MyFrame frame;
    private MyPanel panel;
    private Point2D firstPoint;
    private Point2D secondPoint;
    private static  Controller ins;

    public static synchronized Controller getInstance() {
        if (ins == null) {
            ins = new Controller();
        }
        return ins;
    }

    private Controller() {
        model = new Model();
        MyShape shape = new MyShape(new Rectangle2D.Double());
        shape.setFb(new NoFill());
        model.setMyShape(shape);
        ActionDraw actionDraw = new ActionDraw(model);
        actionDraw.setSampleShape(shape);

        panel = new MyPanel(this);
        // TODO: 25.10.2024 Поменять наблюдатель на более современную реализацию
        model.addObserver(panel);

        frame = new MyFrame();
        frame.setPanel(panel);
    }
    public void getPointOne(Point2D p){
        firstPoint = p;
    }
    public void getPointTwo(Point2D p){
        secondPoint = p;
        model.changeShape(firstPoint, secondPoint);
    }

    public void draw(Graphics2D g2) {
            model.draw(g2);
    }

    public void mousePressed(Point p){
        ActionDraw actionDraw = new ActionDraw(model);
        actionDraw.stretchShape(p);
    }
    public void mouseDragged(Point p){
        ActionDraw actionDraw = new ActionDraw(model);
        actionDraw.createShape(p);
    }



}
