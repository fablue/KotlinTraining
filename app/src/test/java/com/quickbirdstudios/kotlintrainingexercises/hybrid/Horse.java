package com.quickbirdstudios.kotlintrainingexercises.hybrid;

/**
 * Created by Malte Bucksch on 10/12/2017.
 */

public class Horse {
    private String name;

    public Horse(String name) {
        this.name = name;
    }

    public void eat(String food) {
//        TODO NOW correct this to kotlin style after converting
        System.out.println(name + " isst " + food + "...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
