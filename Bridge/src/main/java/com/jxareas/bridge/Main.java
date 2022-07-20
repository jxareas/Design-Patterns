package com.jxareas.bridge;

import com.jxareas.bridge.model.color.Blue;
import com.jxareas.bridge.model.color.Color;
import com.jxareas.bridge.model.color.Red;
import com.jxareas.bridge.model.shapes.Circle;
import com.jxareas.bridge.model.shapes.Shape;
import com.jxareas.bridge.model.shapes.Square;

public class Main {
    public static void main(String... args) {

        Color blue = new Blue();
        Shape blueSquare = new Square(blue);

        Color red = new Red();
        Shape redCircle = new Circle(red);

        blueSquare.applyColor();
        redCircle.applyColor();


    }
}
