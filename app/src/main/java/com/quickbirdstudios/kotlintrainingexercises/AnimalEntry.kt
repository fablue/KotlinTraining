package com.quickbirdstudios.kotlintrainingexercises


/**
 * Created by Malte Bucksch on 11/12/2017.
 */
class AnimalEntry(val german: String, val english: String) {
    //    TODO TASK 1 override "toString" for displaying an AnimalEntry in the list (put both English and German in the string)
//    HINT the "$" operator is useful here
    override fun toString(): String {
        return "$english (Deutsch: $german)"
    }

    //    TODO TASK 2 return true if the "german" contains the searchTerm
//    HINT for case-insensitive search: the function "toLowerCase()" is useful
    fun matchesSearchTerm(searchTerm: String): Boolean {
        return german.toLowerCase().contains(searchTerm.toLowerCase());
    }

    //    TODO TASK 3 return the number of characters in the "english" word
    fun getEnglishWordLength(): Int {
        return english.count()
    }
}