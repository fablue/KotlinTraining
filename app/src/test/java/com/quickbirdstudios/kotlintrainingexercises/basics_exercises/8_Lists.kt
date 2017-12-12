package com.quickbirdstudios.kotlintrainingexercises.basics_exercises

import com.quickbirdstudios.kotlinbasics.Dog
import org.junit.Assert.*
import org.junit.Test


/**
 * Created by Malte Bucksch on 11/12/2017.
 */


class DogHospital {
    //  TODO TASK 1 create a "waitingDogs" list property (private)
//  TODO TASK initialize it with an emtpy list using "mutableListOf<...>(...)"
    private val waitingDogs = mutableListOf<Dog>()

    fun getWaitingDogsCount(): Int {
        // TODO TASK 2 return the number of "waitingDogs"
        return waitingDogs.size
    }

    fun addToWaitingQueue(dog: Dog) {
//        TODO TASK 3 add dog to "waitingDogs"
//        TODO("Please implement the task :-)")
        waitingDogs.add(dog)
    }

    fun treatNextDog() {
        // TODO TASK 4 remove first dog of "waitingDogs"
        // TODO if "waitingDogs" is empty -> do nothing
//        TODO("Please implement the task :-)")
        if (!waitingDogs.isEmpty()) waitingDogs.removeAt(0)
    }

    fun getDogAtPosition(position: Int): Dog? {
        // TODO TASK 5 return the dog at the "position"
        // TODO If no dog is found at the position, please return null
//        TODO("Please implement the task :-)")
        return waitingDogs.getOrNull(position)
    }

    override fun toString(): String {
        // TODO TASK 6 return a string of the dog queue including the positions and "name" of the dogs
        // TODO result string example: " (0,Rex),(1,Daisy),(2,Sandra) "
        // HINT use for loop and "withIndex()"
        // HINT check the index, to insert the "," only at the correct positions (-> no "," at the end or the beginning)
//        TODO("Please implement the task :-)")
        var resultString = ""
        for ((index, dog) in waitingDogs.withIndex()) {
            resultString += "($index,${dog.name})"
            if (index < waitingDogs.size - 1) resultString += ","
        }
        return resultString;
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