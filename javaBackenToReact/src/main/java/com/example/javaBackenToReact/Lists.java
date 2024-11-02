package com.example.javaBackenToReact;

import com.example.javaBackenToReact.models.Character;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    private List<Character> characters = new ArrayList<>();

    public List<Character> getCharacters() {
        return characters;
    }

    public void addCharacter(Character character) {
        characters.add(character);
    }
}
