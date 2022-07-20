package com.jxareas.bridge.model.shapes;

import com.jxareas.bridge.model.color.Color;

public abstract class Shape {

    protected Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    public abstract void applyColor();


}
