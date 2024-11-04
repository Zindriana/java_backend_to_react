package com.example.javaBackenToReact.models;

public class Language {

    public String encryptHuman(String text){
        StringBuilder encryptString = new StringBuilder(text);
        encryptString.reverse();
        return encryptString.toString();
    }

    public String decryptHuman(String text){
        StringBuilder decryptString = new StringBuilder(text);
        decryptString.reverse();
        return decryptString.toString();
    }
}
