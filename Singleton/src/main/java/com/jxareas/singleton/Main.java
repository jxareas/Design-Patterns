package com.jxareas.singleton;

import com.jxareas.singleton.data.DataStore;

public class Main {

    public static void main(String... args) {
        DataStore instance = DataStore.getInstance();
        System.out.println(instance);
        DataStore anotherInstance = DataStore.getInstance();
        System.out.println(anotherInstance);

        if (instance == anotherInstance) {
            System.out.println("Same instance");
        }

    }

}
