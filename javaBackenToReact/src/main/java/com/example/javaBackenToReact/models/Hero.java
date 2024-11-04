package com.example.javaBackenToReact.models;

public class Hero {

    private String name;
    private int mental;
    private int physical;
    private int social;
    private int spirit;
    private boolean canDwarven = false;
    private boolean canElven = false;
    private boolean canHuman  = false;
    private boolean canOrc = false;

    public Hero(String name, int mental, int physical, int social, int spirit) {
        this.name = name;
        this.mental = mental;
        this.physical = physical;
        this.spirit = spirit;
        this.social = social;
    }

    public static Hero fromString(String line) {
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMental() {
        return mental;
    }

    public void setMental(int mental) {
        this.mental = mental;
    }

    public int getPhysical() {
        return physical;
    }

    public void setPhysical(int physical) {
        this.physical = physical;
    }

    public int getSocial() {
        return social;
    }

    public void setSocial(int social) {
        this.social = social;
    }

    public int getSpirit() {
        return spirit;
    }

    public void setSpirit(int spirit) {
        this.spirit = spirit;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", mental=" + mental +
                ", physical=" + physical +
                ", social=" + social +
                ", spirit=" + spirit +
                '}';
    }
}
