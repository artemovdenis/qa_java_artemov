package com.example;

import java.util.List;

public class Animal {

    public List<String> getFood(String animalKind) throws Exception {
        switch (animalKind) {
            case AnimalHelper.HERBIVORE:
                return List.of(AnimalHelper.GRASS, AnimalHelper.VARIOUS_PLANTS);
            case AnimalHelper.GRASS:
                return List.of(AnimalHelper.ANIMALS, AnimalHelper.BIRDS, AnimalHelper.FISH);
            default:
                throw new Exception(AnimalHelper.ANIMAL_NOT_FOUND_ERROR_MESSAGE);
        }

    }

    public String getFamily() {
        return AnimalHelper.FAMILY;
    }
}