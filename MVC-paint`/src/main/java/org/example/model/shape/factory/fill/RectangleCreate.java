package org.example.model.shape.factory.fill;

import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;

public class RectangleCreate implements MyShapeInterface {

    @Override
    public RectangularShape createShape() {
        return new Rectangle2D.Double();
    }
}
