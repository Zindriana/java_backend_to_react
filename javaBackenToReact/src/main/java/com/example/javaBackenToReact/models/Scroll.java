package com.example.javaBackenToReact.models;

public class Scroll {

    private String name;
    private String textContent;
    private String language;


    public Scroll(String name, String content, String language) {
        this.name = name;
        this.textContent = content;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return textContent;
    }

    public void setContent(String content) {
        this.textContent = content;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
