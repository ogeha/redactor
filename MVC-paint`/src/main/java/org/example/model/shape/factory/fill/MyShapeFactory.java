package org.example.model.shape.factory.fill;
import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;

public abstract class MyShapeFactory {
        public MyShapeInterface create(){
            MyShapeInterface shape = createMyShapeInterface();
            shape.createShape();
            return shape;
        }
        protected abstract MyShapeInterface createMyShapeInterface();
    }

