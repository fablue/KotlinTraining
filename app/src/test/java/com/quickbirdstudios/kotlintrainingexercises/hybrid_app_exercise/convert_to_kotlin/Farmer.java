package com.quickbirdstudios.kotlintrainingexercises.hybrid_app_exercise.convert_to_kotlin;

/**
 * Created by Malte Bucksch on 10/12/2017.
 */

public class Farmer {
    public final static String FOOD_HAY = "Heu";
    public final static String FOOD_APPLE = "Äpfel";
    public final static String FOOD_WORM = "Würmer";

    public void feedHorse(Horse horse) {
        horse.eat(FOOD_HAY);
        horse.eat(FOOD_APPLE);
    }

    public void feedChicken(Chicken chicken) {
        chicken.eat(FOOD_WORM);
    }

    public void ride(Horse horse) {
        System.out.println("Farmer reitet auf "+horse);
    }

    public void callForAnimal(Animal animal) {
        String callPhrase = animal.getName() + ", wo bist du?";
        System.out.println(StringUtils.screamify(callPhrase));
    }
}