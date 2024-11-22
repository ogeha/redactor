package org.example.model.shape.factory.fill;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;


public class EllipseCreate implements MyShapeInterface {
    @Override
    public RectangularShape createShape() {
        return new Ellipse2D.Double();
    }
}
