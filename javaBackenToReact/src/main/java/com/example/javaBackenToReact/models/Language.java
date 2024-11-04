package com.example.javaBackenToReact.models;

public class Language {
    Randomizer randomizer = new Randomizer();

    public Scroll encryptScroll(Scroll scroll) {
        String language = scroll.getLanguage();
        Scroll encryptedScroll = scroll;
        switch (language) {
            case "dwarven":
                encryptedScroll.setContent(encryptDwarven(scroll.getContent()));
                return encryptedScroll;
            case "elven":
                encryptedScroll.setContent(encryptElven(scroll.getContent()));
                return encryptedScroll;
            case "human":
                encryptedScroll.setContent(encryptHuman(scroll.getContent()));
                return encryptedScroll;
            case "orc":
                encryptedScroll.setContent(encryptOrc(scroll.getContent()));
                return encryptedScroll;
            default:
                break;
        }
        return scroll;
    }

    public Scroll decryptScroll(Scroll scroll) {
        String language = scroll.getLanguage();
        Scroll decryptedScroll = scroll;
        switch (language) {
            case "dwarven":
                decryptedScroll.setContent(decryptDwarven(scroll.getContent()));
                return decryptedScroll;
            case "elven":
                decryptedScroll.setContent(decryptElven(scroll.getContent()));
                return decryptedScroll;
            case "human":
                decryptedScroll.setContent(decryptHuman(scroll.getContent()));
                return decryptedScroll;
            case "orc":
                decryptedScroll.setContent(decryptOrc(scroll.getContent()));
                return decryptedScroll;
            default:
                break;
        }
        return scroll;
    }

    private String encryptHuman(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        String reversedString = stringBuilder.reverse().toString();
        String lowCaseString = reversedString.toLowerCase();
        StringBuilder encryptedString = new StringBuilder();
        for (char c : lowCaseString.toCharArray()) {
            if (c == ' ') {
                encryptedString.append(randomizer.rollDice(1));
            } else {
                encryptedString.append(c);
            }
        }
        return encryptedString.toString();
    }

    private String decryptHuman(String text) {
        // Skapa en StringBuilder för att bygga den dekrypterade strängen
        StringBuilder decryptedString = new StringBuilder();

        // Gå igenom varje tecken i den krypterade strängen
        for (char c : text.toCharArray()) {
            // Förutsatt att vi kan identifiera vilka nummer som representerade mellanslag (detta är hypotetiskt)
            if (Character.isDigit(c)) {
                decryptedString.append(' ');
            } else {
                decryptedString.append(c);
            }
        }

        // Återställ strängen till dess ursprungliga version
        return decryptedString.reverse().toString();
    }

    private String encryptDwarven(String text) {
        StringBuilder encryptString = new StringBuilder();
        for (char c : text.toCharArray()) {
            encryptString.append((int) c).append(" ");
        }
        return encryptString.toString().trim();
    }

    private String decryptDwarven(String encryptedText) {
        StringBuilder decryptString = new StringBuilder();
        String[] asciiValues = encryptedText.split(" ");

        for (String asciiValue : asciiValues) {
            int charCode = Integer.parseInt(asciiValue);
            decryptString.append((char) charCode);
        }

        return decryptString.toString();
    }

    private String encryptElven(String text) {
        StringBuilder encryptString = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char shifted = (char) (c - 1);
                if ((Character.isLowerCase(c) && shifted < 'a') || (Character.isUpperCase(c) && shifted < 'A')) {
                    shifted += 26;
                }
                encryptString.append(shifted);
            } else {
                encryptString.append(c);
            }
        }
        return encryptString.toString();
    }

    public String decryptElven(String text){
        return encryptOrc(text);
    }

    private String encryptOrc(String text) {
        StringBuilder encryptString = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char shifted = (char) (c + 1);
                if ((Character.isLowerCase(c) && shifted > 'z') || (Character.isUpperCase(c) && shifted > 'Z')) {
                    shifted -= 26;
                }
                encryptString.append(shifted);
            } else {
                encryptString.append(c);
            }
        }
        return encryptString.toString();
    }

    public String decryptOrc(String text){
        return encryptElven(text);
    }
}
