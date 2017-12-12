package com.quickbirdstudios.kotlintrainingexercises.hybrid_app_exercise.convert_to_kotlin;

/**
 * Created by Malte Bucksch on 10/12/2017.
 */

public class Horse extends Animal {
    public Horse(String name) {
        super(name);
    }

    @Override
    public void eat(String food) {
        if (food == null) {
            System.out.println(name + " isst Gras auf der Weide");
            return;
        }

        System.out.println(name + " isst " + food + "...");
    }
}