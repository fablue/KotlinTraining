package com.quickbirdstudios.kotlintrainingexercises.hybrid_app_exercise;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Malte Bucksch on 10/12/2017.
 */

public class AnimalRanchTest {
    private Farmer farmer = new Farmer();
    private AnimalRanch animalRanch = new AnimalRanch();

    @Before
    public void setUp() {
        animalRanch.addAnimal(new Horse("Ginger"));
        animalRanch.addAnimal(new Horse("Nacho"));
        animalRanch.addAnimal(new Horse("Amigo"));
    }

    @Test
    public void testKotlinCowCreation() throws Exception {
        KotlinCow kotlinCow = new KotlinCow();
        kotlinCow.eat("Getreide");

//      DOES NOT COMPILE WITHOUT ANNOTATION
//      kotlinCow.eat();
        throw new RuntimeException("Uncomment this and make it compile using @JvmOverloads");
    }

    @Test
    public void testFeedingOfAnimals() throws Exception {
        Horse horse1 = animalRanch.searchForAnimalInStall(1);
        farmer.feed(horse1);

        Horse horse2 = animalRanch.searchForAnimalInStall(2);
        farmer.feed(horse2);

        Horse horse3 = animalRanch.searchForAnimalInStall(3);
        farmer.feed(horse3);

        Horse horse4 = animalRanch.searchForAnimalInStall(4);
        farmer.feed(horse4);
    }

    @Test
    public void testRideHorse() throws Exception {
        farmer.ride(animalRanch.searchForAnimalInStall(1));
        farmer.ride(null);
    }
}