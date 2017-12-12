package com.quickbirdstudios.kotlinbasics.exercises

import com.quickbirdstudios.kotlinbasics.Dog
import org.junit.Assert.*
import org.junit.Test

/**
 * Created by Malte Bucksch on 05/11/2017.
 */
class ControlFlow {
    //  TODO TASK 1 use the when operator on the "dog.name":
    //  TODO -> if the name is "Bruno", return the owner name "Hans"
    //  TODO -> if the name is "Ignatz", return the owner name "Peter"
    //  TODO -> otherwise return null
    fun findDogOwnerName(dog: Dog): String? {
        TODO("Please implement the task :-)")
    }

    //  TODO TASK 2 using the "when" operator on the "dog.age", return:
    //  TODO -> "Baby Dog" if dog is 0 or 1 year old
    //  TODO -> "Normal Dog" if dog is 2 to 8 years old (
    //  HINT: use the range oprator "x..y" and "in" keyword
    //  TODO -> "Old Dog" otherwise
    fun ageToString(dog: Dog): String {
        TODO("Please implement the task :-)")
    }

    //  TODO TASK 3 use a "for"-loop to check if any of the dogs in the list is a baby dog
    //  TODO a baby dog is a dog which is younger than 2 years old
    //  TODO return true if a baby dog was found, false otherwise
//    TODO NOW solution, and add to slides
    fun hasAnyBabyDog(dogs: List<Dog>): Boolean {
        TODO("Please implement the task :-)")
    }


    /*
    Do not worry about the part below
     */
    @Test
    fun testOwnerNameIsCorrect() {
        assertEquals("Baby Dog", ageToString(Dog("Bruno", age = 1)))
        assertEquals("Normal Dog", ageToString(Dog("Ignatz", age = 5)))
        assertEquals("Old Dog", ageToString(Dog("Balu", age = 13)))
    }

    @Test
    fun testAgeDescriptionIsCorrect() {
        assertEquals("Hans", findDogOwnerName(Dog("Bruno")))
        assertEquals("Peter", findDogOwnerName(Dog("Ignatz")))
        assertEquals(null, findDogOwnerName(Dog("Balu")))
    }

    @Test
    fun testHasAnyBabyDog() {
        assertTrue(hasAnyBabyDog(listOf(Dog("Tom", age = 5), Dog("Tom", age = 1))))
        assertFalse(hasAnyBabyDog(listOf(Dog("Tom", age = 5), Dog("Tom", age = 7), Dog("Tom", age = 9))))
    }
}