package com.example.javaBackenToReact;
import java.util.Random;

public class Randomizer {
    Random rand = new Random();

    private int rollD6() {
        return rand.nextInt(6)+1;
    }

    public int rollDice(int amountOfDice) {
        int totalValue = 0;
        for (int i = 0; i < amountOfDice; i++) {
            totalValue+= rollD6();
        }
        return totalValue;

    }

}
