package com.quickbirdstudios.kotlintrainingexercises.hybrid_app_exercise.convert_to_kotlin;

/**
 * Created by Malte Bucksch on 10/12/2017.
 */

public final class StringUtils {
    private StringUtils() {
        //no instance
    }

    public static String screamify(String text){
        return text.toUpperCase() + "!!!";
    }
}
