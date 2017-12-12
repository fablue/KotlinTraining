package com.quickbirdstudios.kotlintrainingexercises.hybrid_app_exercise.convert_to_kotlin;

/**
 * Created by Malte Bucksch on 12/12/2017.
 */

public class Chicken extends Animal {
    public Chicken(String name) {
        super(name);
    }

    @Override
    public void eat(String food) {
        if (food == null) {
            System.out.println(name + " isst Körner am Boden");
            return;
        }

        System.out.println(name + " isst " + food + "...");
    }

    public void giveEgg() {
        System.out.println("Das Huhn brütet ein Ei.");
    }
}
