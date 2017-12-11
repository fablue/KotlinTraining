package com.quickbirdstudios.kotlintrainingexercises.hybrid;

/**
 * Created by Malte Bucksch on 10/12/2017.
 */

public class Farmer {
    private final static String FOOD_GRASS = "Gras";
    private final static String FOOD_CARROTS = "Karroten";
    private final static String FOOD_APPLE = "Äpfel";

    public void feed(Horse horse) {
        if (horse == null) {
            System.out.println("Ein nicht-vorhandenes Pferd kann ich nicht füttern.");
            return;
        }

        horse.eat(FOOD_GRASS);
        horse.eat(FOOD_CARROTS);
        horse.eat(FOOD_APPLE);
    }

    public void ride(Horse horse) {
        // Nobody checks for null here

        System.out.println("Farmer reitet auf einem Pferd");
    }

    public void callForHorse(Horse horse) {
        if (horse == null) {
            System.out.println("Ein nicht-vorhandenes Pferd kann ich nicht rufen.");
            return;
        }

        String callPhrase = horse.getName() + ", wo bist du?";
        System.out.println(StringUtils.screamify(callPhrase));
    }
}