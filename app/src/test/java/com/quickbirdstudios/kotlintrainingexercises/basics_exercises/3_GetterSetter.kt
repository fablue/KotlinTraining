package com.quickbirdstudios.kotlinintro.exercises

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by Malte Bucksch on 05/11/2017.
 */

class KotlinDog(name: String, val type: String = "Labrador", var age: Int = 5) {
    //    TODO TASK 1 create getter for "name" which returns the name as upperCase/all-caps (HINT: myText.toUpperCase())
    //    TODO TASK 2 create setter for name: Throw an "IllegalArgumentException" if the new name is empty
    //    HINT: throwing exceptions happens like in java with `throw IllegalArgumentException(...)`
    var name = name





}













/*
  Do not worry about the part below!
   */
class DogGetterSetter {
    private val dog = KotlinDog("bruno", "Labrador");

    @Test
    fun testDogNameIsCapitalized() {
        assertEquals("BRUNO", dog.name)
    }

    @Test(expected = IllegalArgumentException::class)
    fun testEmptyDogNameNotAllowed() {
        dog.name = ""
    }
}

