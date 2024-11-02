package com.example.javaBackenToReact.models;

public class Character {

    private String name;
    private int mental;
    private int physical;
    private int social;
    private int spirit;

    public Character(String name, int mental, int physical, int social, int spirit) {
        this.name = name;
        this.mental = mental;
        this.physical = physical;
        this.spirit = spirit;
        this.social = social;
    }
}
