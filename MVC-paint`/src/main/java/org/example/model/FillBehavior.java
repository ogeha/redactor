package org.example.model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.RectangularShape;

public interface FillBehavior {
    void draw(Graphics2D g);

    void setColor(Color c);

    void setShape(RectangularShape s);
}