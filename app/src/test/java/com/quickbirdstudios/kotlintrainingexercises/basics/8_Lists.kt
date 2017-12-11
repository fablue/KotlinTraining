package com.quickbirdstudios.kotlintrainingexercises.basics

import com.quickbirdstudios.kotlinintro.exercises.Dog
import org.junit.Assert.*
import org.junit.Test


/**
 * Created by Malte Bucksch on 11/12/2017.
 */


class DogHospital {
//        TODO TASK 1 create "waitingDogs" list property (private) and initialize it with an emtpy list

    fun getWaitingDogsCount(): Int {
        // TODO TASK 2 return the number of "waitingDogs"
        TODO("Please implement the task :-)")
    }

    fun addToWaitingQueue(dog: Dog) {
//        TODO TASK 3 add dog to "waitingDogs"
        TODO("Please implement the task :-)")
    }

    fun treatNextDog() {
        // TODO TASK 4 remove first dog of "waitingDogs" if there are dogs waiting
        TODO("Please implement the task :-)")
    }

    fun getDogAtPosition(position: Int): Dog? {
        // TODO TASK 5 return the dog at the "position". If no dog is found at the position, return null
        TODO("Please implement the task :-)")
    }

    override fun toString(): String {
        // TODO TASK 6 return a string of the dog queue including the positions and "name" of the dogs
        // example: "(0,Rex),(1,Daisy),(2,Sandra)"
        // HINT use for loop and "withIndex()"
        TODO("Please implement the task :-)")

    }
}


/*
    Do not worry about the part below!
     */
class DogHospitalTests {
    private val dogHospital = DogHospital()

    @Test
    fun testNumberOfWaitingDogs() {
        assertEquals(0, dogHospital.getWaitingDogsCount())
    }

    @Test
    fun testAddToWaitingQueue() {
        assertEquals(0, dogHospital.getWaitingDogsCount())

        dogHospital.addToWaitingQueue(Dog("Tom"))

        assertEquals(1, dogHospital.getWaitingDogsCount())
    }

    @Test
    fun testTreatNextDog() {
        dogHospital.addToWaitingQueue(Dog("Tom"))
        dogHospital.addToWaitingQueue(Dog("Ben"))

        assertEquals(2, dogHospital.getWaitingDogsCount())

        dogHospital.treatNextDog()

        assertEquals(1, dogHospital.getWaitingDogsCount())
        assertEquals("Ben", dogHospital.getDogAtPosition(0)?.name)
    }

    @Test
    fun testGetDogAtPosition() {
        assertNull(dogHospital.getDogAtPosition(0))

        dogHospital.addToWaitingQueue(Dog("Tom"))

        assertNotNull(dogHospital.getDogAtPosition(0))
    }

    @Test
    fun testToString() {
        assertEquals("", dogHospital.toString())

        dogHospital.addToWaitingQueue(Dog("Tom"))
        dogHospital.addToWaitingQueue(Dog("Ben"))

        assertEquals("(0,Tom),(1,Ben)", dogHospital.toString())
    }
}