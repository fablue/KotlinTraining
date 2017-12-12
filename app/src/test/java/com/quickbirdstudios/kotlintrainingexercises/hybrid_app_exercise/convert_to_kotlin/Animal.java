package com.quickbirdstudios.kotlintrainingexercises.hybrid_app_exercise.convert_to_kotlin;

/**
 * Created by Malte Bucksch on 12/12/2017.
 */

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat(String food);

    public void eat(){
        eat(null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
