package com.quickbirdstudios.kotlintrainingexercises.hybrid_app_exercise.convert_to_kotlin;

/**
 * Created by Malte Bucksch on 10/12/2017.
 */

public class Horse extends Animal {
    private int maxRunningSpeed;

    public Horse(String name, int maxRunningSpeed) {
        super(name);

        this.maxRunningSpeed = maxRunningSpeed;
    }

    public Horse(String name) {
        this(name,10);
    }

    public int getMaxRunningSpeed() {
        return maxRunningSpeed;
    }

    public void setMaxRunningSpeed(int maxRunningSpeed) {
        this.maxRunningSpeed = maxRunningSpeed;
    }
}
