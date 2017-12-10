package com.quickbirdstudios.kotlintrainingexercises.hybrid;

/**
 * Created by Malte Bucksch on 10/12/2017.
 */

public final class StringUtils {
    private StringUtils() {
        //no instance
    }

    //    TODO TASK 1 after conversion of StringUtils to Kotlin, first try the annotation @JvmStatic
    //    TODO TASK 2 after conversion of StringUtils AND Farmer to Kotlin, convert this to a top-level extension function
    public static String screamify(String text){
        return text.toUpperCase() + "!!!";
    }
}
