package com.quickbirdstudios.kotlintrainingexercises.basics

import org.junit.Test


/**
 * Created by Malte Bucksch on 11/12/2017.
 */
//TODO TASK 1 create an -abstract- Animal class with a property "size" (Int)
//TODO TASK 2 add an abstract method "makeSound"
//TODO TASK 3 add a companion object with a property "MAX_SIZE" (=10)
//TODO TASK 4 add a method "grow" which increases the "size" of the animal IF the size is smaller than "MAX_SIZE"
//TODO NOW solution
abstract class Animal(var size: Int) {
    abstract fun makeSound();

    fun grow() {
        if (size < MAX_SIZE) size++
    }

    companion object {
        val MAX_SIZE = 10
    }
}

//TODO TASK 5 create a sub class "bird" with a constructor for the bird "size"
//TODO TASK 6 override the method "makeSound" and print the sound of a bird (which is "fiep" of course)
//TODO TASK 7 add a method "fly" which prints "flying... /^v^\"
//TODO NOW solution
class Bird(size: Int): Animal(size){
    override fun makeSound() {
        println("fiep")
    }

    fun fly(){
        println("flying... /^v^\\")
    }
}

//TODO NOW rename others to Tests as well
class InheritanceTests {
    @Test
    fun testBird() {
        //TODO TASK 8 create a Bird instance
        //TODO TASK 9 let the bird "grow", let him "fly", and let him "makeSound"

        val bird = Bird(1)
        bird.grow()
        bird.fly()
        bird.makeSound()
    }
}
