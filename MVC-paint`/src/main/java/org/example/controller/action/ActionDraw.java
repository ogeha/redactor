package org.example.controller.action;

import org.example.model.Model;
import org.example.model.MyShape;

import java.awt.*;
import java.awt.geom.Point2D;

public class ActionDraw {
    private  MyShape sampleShape;
    private MyShape shape;
    private Model model;
    private Point2D firstPoint;
    private Point2D secondPoint;

    public ActionDraw(Model model) {
        this.model = model;
    }

    public void setSampleShape(MyShape sampleShape) {
        this.sampleShape = sampleShape;
    }

    public void setFirstPoint(Point2D firstPoint) {
        this.firstPoint = firstPoint;
    }

    public void setSecondPoint(Point2D secondPoint) {
        this.secondPoint = secondPoint;
    }

    public Point2D getFirstPoint() {
        return firstPoint;
    }

    public Point2D getSecondPoint() {
        return secondPoint;
    }

    public void stretchShape(Point point){
        firstPoint = (Point2D) point;
        shape.setFrame(firstPoint, secondPoint);
    }
    public void createShape(Point point){
        secondPoint = (Point2D) point;
        shape = sampleShape.clone();
        model.createCurrentShape(shape);
    }
}
