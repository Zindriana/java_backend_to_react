package com.example.javaBackenToReact;

import com.example.javaBackenToReact.admin.DataSaver;
import com.example.javaBackenToReact.models.Character;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class CharacterList {
    DataSaver dataSaver;

    private List<Character> characters = new ArrayList<>();

    public List<Character> getCharacters() {
        return characters;
    }

    public void addCharacter(Character character) {
        characters.add(character);
        dataSaver.saveCharactersToJson(getCharacters(), "save.json");
    }
}
