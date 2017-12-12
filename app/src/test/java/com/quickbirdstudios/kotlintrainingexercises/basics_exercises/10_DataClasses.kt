package com.quickbirdstudios.kotlintrainingexercises.basics_exercises

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Test

/**
 * Created by Malte Bucksch on 11/12/2017.
 */

//TODO TASK 1 make this class a "data" class
class Apple(val size: Int, val color: String)

fun getCopyOf(apple: Apple): Apple {
    //TODO TASK 2 return a copy of the apple

    TODO("Please implement the task :-)")
}

fun getBiggerApple(originalApple: Apple): Apple {
    //TODO TASK 3 return a copy of the apple which is slightly bigger (size + 1)

    TODO("Please implement the task :-)")
}










/*
   Do not worry about the part below!
    */

class DataClassTests {
    @Test
    fun testCopy() {
        val apple = Apple(1, "grün")
        assertEquals(apple, getCopyOf(apple))
        assertFalse(apple === getCopyOf(apple))
    }

    @Test
    fun testGetBiggerApple() {
        val apple = Apple(1, "grün")

        val biggerAppleCopy = getBiggerApple(apple)

        assertEquals(1,apple.size)
        assertEquals(2,biggerAppleCopy.size)
    }
}