package com.quickbirdstudios.kotlintrainingexercises.hybrid_app_exercise;

import com.quickbirdstudios.kotlintrainingexercises.hybrid_app_exercise.convert_to_kotlin.Animal;
import com.quickbirdstudios.kotlintrainingexercises.hybrid_app_exercise.convert_to_kotlin.AnimalRanch;
import com.quickbirdstudios.kotlintrainingexercises.hybrid_app_exercise.convert_to_kotlin.Chicken;
import com.quickbirdstudios.kotlintrainingexercises.hybrid_app_exercise.convert_to_kotlin.Farmer;
import com.quickbirdstudios.kotlintrainingexercises.hybrid_app_exercise.convert_to_kotlin.Horse;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Malte Bucksch on 10/12/2017.
 */

public class AnimalRanchTest {


    @Before
    public void setUp() {

    }

    @Test
    public void runAnimalRanchExample() throws Exception {
        Farmer farmer = new Farmer();
        AnimalRanch animalRanch = new AnimalRanch();

        animalRanch.addAnimal(new Horse("Ginger"));
        animalRanch.addAnimal(new Horse("Nacho"));
        animalRanch.addAnimal(new Horse("Amigo"));
        animalRanch.addAnimal(new Chicken("Rudi"));

        Animal animal = animalRanch.getAnimalAtBox(1);

        farmer.callForAnimal(animal);

        animal.eat();
        animal.eat(null);
        animal.eat(Farmer.FOOD_HAY);

        if (animal instanceof Horse) {
            Horse horse = (Horse) animal;

            farmer.feedHorse(horse);
            farmer.feedHorse(null);

            farmer.ride(horse);
            farmer.ride(null);
        }
    }
}
