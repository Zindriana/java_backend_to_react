package com.example.javaBackenToReact.models;

public class Language {

    public void encryptScroll(Scroll scroll) {
        String language = scroll.getLanguage();
        switch (language) {
            case "dwarven":
                scroll.setContent(encryptDwarven(scroll.getContent()));
                break;
            case "elven":
                scroll.setContent(encryptElven(scroll.getContent()));
                break;
            case "human":
                scroll.setContent(encryptHuman(scroll.getContent()));
                break;
            case "orc":
                scroll.setContent(encryptOrc(scroll.getContent()));
                break;
            default:
                break;
        }
    }

    private String encryptHuman(String text){
        StringBuilder encryptString = new StringBuilder(text);
        encryptString.reverse();
        return encryptString.toString();
    }

    public String decryptHuman(String text){
        StringBuilder decryptString = new StringBuilder(text);
        decryptString.reverse();
        return decryptString.toString();
    }

    private String encryptDwarven(String text){
        StringBuilder encryptString = new StringBuilder(text);
        encryptString.reverse();
        return encryptString.toString();
    }

    public String decryptDwarven(String text){
        StringBuilder decryptString = new StringBuilder(text);
        decryptString.reverse();
        return decryptString.toString();
    }

    private String encryptElven(String text){
        StringBuilder encryptString = new StringBuilder(text);
        encryptString.reverse();
        return encryptString.toString();
    }

    public String decryptElven(String text){
        StringBuilder decryptString = new StringBuilder(text);
        decryptString.reverse();
        return decryptString.toString();
    }

    private String encryptOrc(String text){
        StringBuilder encryptString = new StringBuilder(text);
        encryptString.reverse();
        return encryptString.toString();
    }

    public String decryptOrc(String text){
        StringBuilder decryptString = new StringBuilder(text);
        decryptString.reverse();
        return decryptString.toString();
    }
}
