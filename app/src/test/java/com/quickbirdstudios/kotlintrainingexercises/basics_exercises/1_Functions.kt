package com.quickbirdstudios.kotlintrainingexercises.basics_exercises

import org.junit.Test


/**
 * Created by Malte Bucksch on 11/12/2017.
 */
class Functions {
//    TODO TASK 1 create a function "helloWorld" which prints "helloWorld"

    //TODO NOW solutions
    fun helloWorld() {
        print("Hello world")
    }

    @Test
    fun testHelloWorld() {
        //    TODO TASK 2 execute and run the function "helloWorld" here
        TODO("Please implement the task :-)")
    }

    //    TODO TASK 3 set default value "1" for the "times" parameter
    fun sayMerryChristmas(times: Int){
        println("Merry Christmas".repeat(times))
    }

    @Test
    fun testMerryChristmas() {
        //    TODO TASK 4 execute and run the function "sayMerryChristmas" and pass "3" for "times"
        //    TODO TASK 5 execute and run the function "sayMerryChristmas" and pass nothing for "times"
        TODO("Please implement the task :-)")
    }
}