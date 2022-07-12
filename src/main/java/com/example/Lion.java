package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    private Feline feline;

    public Lion(String sex, Feline feline) throws Exception {
        switch (sex) {
            case AnimalHelper.MALE:
                hasMane = true;
                break;
            case AnimalHelper.FEMALE:
                hasMane = false;
                break;
            default:
                throw new Exception(AnimalHelper.UNSUPPORTED_CHOICE_ERROR_MESSAGE);
        }
        this.feline = feline;
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood(AnimalHelper.PREDATOR);
    }
}