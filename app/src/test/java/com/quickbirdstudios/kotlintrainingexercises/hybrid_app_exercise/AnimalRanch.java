package com.quickbirdstudios.kotlintrainingexercises.hybrid_app_exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Malte Bucksch on 10/12/2017.
 */

public class AnimalRanch {
    private List<Horse> animals = new ArrayList<>();

    public void addAnimal(Horse horse) {
        animals.add(horse);
    }

    public void removeAnimal(Horse horse) {
        animals.remove(horse);
    }

    public Horse searchForAnimalInStall(int stallNumber) {
        return animals.size() >= stallNumber && stallNumber > 0 ? animals.get(stallNumber - 1) : null;
    }
}
