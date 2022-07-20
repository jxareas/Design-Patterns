package com.jxareas.bridge.model.shapes;

import com.jxareas.bridge.model.color.Color;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
