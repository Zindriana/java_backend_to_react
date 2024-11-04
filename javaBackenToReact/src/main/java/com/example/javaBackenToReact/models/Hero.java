package com.example.javaBackenToReact.models;

public class Hero {

    private String name;
    private int mental;
    private int physical;
    private int social;
    private int spirit;
    private boolean canDwarven;
    private boolean canElven;
    private boolean canHuman;
    private boolean canOrc;
    private boolean active = false;

    public Hero(String name, int mental, int physical, int social, int spirit,
                 boolean canDwarven, boolean canElven, boolean canHuman, boolean canOrc) {
        this.name = name;
        this.mental = mental;
        this.physical = physical;
        this.spirit = spirit;
        this.social = social;
        this.canDwarven = canDwarven;
        this.canElven = canElven;
        this.canHuman = canHuman;
        this.canOrc = canOrc;
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

    public boolean isCanDwarven() {
        return canDwarven;
    }

    public void setCanDwarven(boolean canDwarven) {
        this.canDwarven = canDwarven;
    }

    public boolean isCanElven() {
        return canElven;
    }

    public void setCanElven(boolean canElven) {
        this.canElven = canElven;
    }

    public boolean isCanHuman() {
        return canHuman;
    }

    public void setCanHuman(boolean canHuman) {
        this.canHuman = canHuman;
    }

    public boolean isCanOrc() {
        return canOrc;
    }

    public void setCanOrc(boolean canOrc) {
        this.canOrc = canOrc;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", mental=" + mental +
                ", physical=" + physical +
                ", social=" + social +
                ", spirit=" + spirit +
                ", Dwarven=" + canDwarven +
                ", Elven=" + canElven +
                ", Human=" + canHuman +
                ", Orc=" + canOrc +
                '}';
    }
}
