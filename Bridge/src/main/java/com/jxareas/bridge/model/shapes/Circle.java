package com.jxareas.bridge.model.shapes;

import com.jxareas.bridge.model.color.Color;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
