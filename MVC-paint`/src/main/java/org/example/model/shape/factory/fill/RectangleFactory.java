package org.example.model.shape.factory.fill;

public class RectangleFactory extends MyShapeFactory {
    @Override
    protected MyShapeInterface createMyShapeInterface() {
        return new RectangleCreate();
    }
}
