package org.example.controller.action;

import org.example.model.Model;
import org.example.model.MyShape;

import java.awt.*;
import java.awt.geom.Point2D;

public class ActionDraw {
    public static MyShape sampleShape;
    private static MyShape shape;
    private static Model model;
    private static Point2D firstPoint;
    private static Point2D secondPoint;

    public ActionDraw(MyShape shape, Model model, Point2D firstPoint, Point2D secondPoint) {
        this.shape = shape;
        this.model = model;
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public static void stretchShape(Point point){
        firstPoint = (Point2D) point;
        shape.setFrame(firstPoint, secondPoint);
    }
    public static void createShape(Point point) throws CloneNotSupportedException {
        secondPoint = (Point2D) point;
        shape = sampleShape.clone();
        model.createCurrentShape(shape);
    }
}
