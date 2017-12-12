package com.quickbirdstudios.kotlintrainingexercises.basics_exercises

import org.junit.Test


/**
 * Created by Malte Bucksch on 11/12/2017.
 */
class FunctionTests {
    // TODO TASK 1 create a function "getHelloWorldString" which RETURNs "Hello World" as a string
    fun getHelloWorldString(): String {
        return "Hello world"
    }

    @Test
    fun testHelloWorld() {
        // TODO TASK 2 print the result of "getHelloWorldString"
        println(getHelloWorldString())
    }

    // TODO TASK 3 set a default value of "1" for the "times" parameter
    fun sayMerryChristmas(times: Int = 1) {
        println("Merry Christmas ".repeat(times))
    }

    @Test
    fun testMerryChristmas() {
        //    TODO TASK 4 execute and run the function "sayMerryChristmas" and pass "3" for "times"
        //    TODO TASK 5 execute and run the function "sayMerryChristmas" and pass nothing for "times"
        sayMerryChristmas(3)
        sayMerryChristmas()
    }
}