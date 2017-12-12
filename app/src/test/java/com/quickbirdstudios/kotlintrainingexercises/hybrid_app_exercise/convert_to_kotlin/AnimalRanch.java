package com.quickbirdstudios.kotlintrainingexercises.hybrid_app_exercise.convert_to_kotlin;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Malte Bucksch on 10/12/2017.
 */

public class AnimalRanch {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    public Animal getAnimalAtBox(int boxNumber) {
        if (boxNumber > 0 && boxNumber < animals.size()) return animals.get(boxNumber - 1);

        return null;
    }
}
