package com.quickbirdstudios.kotlintrainingexercises.hybrid;

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
