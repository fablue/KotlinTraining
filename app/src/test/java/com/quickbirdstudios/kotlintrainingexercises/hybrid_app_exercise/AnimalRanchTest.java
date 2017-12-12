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
        Animal animal = animalRanch.getAnimalAtBox(1);
        Animal animal2 = animalRanch.getAnimalAtBox(3);

        farmer.callForAnimal(animal);

        if (animal instanceof Horse) {
            Horse horse = (Horse) animal;

            farmer.feedHorse(horse);
            farmer.ride(horse);

            // let's give this java class a null value to handle
            farmer.ride(null);
        }

        if (animal2 instanceof Chicken) {
            Chicken chicken = (Chicken) animal;

            farmer.feedChicken(chicken);
        }
    }
}
