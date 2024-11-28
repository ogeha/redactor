package org.example.model;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Observable;

// TODO: 25.10.2024 Сделать singleton класс
public class Model extends Observable {
    private MyShape currentShape;
    public static ArrayList<MyShape> models = new ArrayList<MyShape>();

    public void setMyShape(MyShape myShape) {
        this.currentShape = myShape;
    }

    public void changeShape(Point2D x, Point2D y) {
        currentShape.setFrame(x, y);
        this.setChanged();
        this.notifyObservers();
    }

    public void draw(Graphics2D g) {
        currentShape.draw(g);
    }
    public void createCurrentShape(MyShape myShape){
        setMyShape(myShape);
        models.add(myShape);
    }

    public  static ArrayList<MyShape> getModels() {
        return models;
    }
}
