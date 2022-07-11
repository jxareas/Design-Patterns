package com.jxareas.builder;

import com.jxareas.builder.model.Hamburger;

public class Main {
    public static void main(String... args) {
        Hamburger hamburger = new Hamburger.Builder()
                .bread("Baguette")
                .dressing("Thousand Island Dressing")
                .meat("Red Meat")
                .build();

        System.out.println(hamburger);
    }
}
