package org.example.model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.*;

public class MyShape implements Cloneable {
    private Color color;
    private RectangularShape shape;
    private FillBehavior fb;

    public MyShape(RectangularShape shape) {
        this.shape = shape;
        color = Color.GRAY;
        fb = new Fill();
        fb.setColor(color);
        fb.setShape(shape);
    }

    // TODO: 25.10.2024  Попробовать вызовы через разные конструкторы, затем переделать создание через фабрику
    public MyShape() {
        color = Color.BLUE;
        shape = new Rectangle2D.Double();
        fb = new Fill();
        fb.setColor(color);
        fb.setShape(shape);
    }

    // TODO: 25.10.2024  Попробовать вызовы через разные конструкторы, затем переделать создание через фабрику
    public MyShape(Color color, RectangularShape shape, FillBehavior fb) {
        this.color = color;
        this.shape = shape;
        this.fb = fb;
        this.fb.setShape(shape);
        this.fb.setColor(color);
    }

    public void setFb(FillBehavior fb) {
        this.fb = fb;
        fb.setShape(shape);
        fb.setColor(color);
    }

    public void setShape(RectangularShape shape) {
        this.shape = shape;
    }

    public void setFrame(Point2D x, Point2D y) {
        shape.setFrameFromDiagonal(x, y);
    }

    void draw(Graphics2D g) {
        fb.draw(g);

    }

    @Override
    public MyShape clone() throws CloneNotSupportedException {
        try {
            MyShape newShape = (MyShape) super.clone(); //Корректное приведение к типу MyShape
            if(newShape.shape != null) { //Проверка на null, чтобы избежать NullPointerException
                newShape.shape = this.shape; // Глубокое клонирование shape
            }
            return newShape;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error cloning MyShape", e);
        }
    }
}

