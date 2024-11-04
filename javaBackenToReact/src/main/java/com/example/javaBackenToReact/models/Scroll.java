package com.example.javaBackenToReact.models;

public class Scroll {

    private String name;
    private String content;
    private String language;


    public Scroll(String name, String content, String language) {
        this.name = name;
        this.content = content;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
