package com.example.javaBackenToReact.admin;

import com.example.javaBackenToReact.CharacterList;
import com.example.javaBackenToReact.models.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;

@Component
public class DataLoader {

    private final CharacterList characterList;

    @Autowired
    public DataLoader(CharacterList characterList) {
        this.characterList = characterList;
    }

    public void loadCharactersFromFile(String filePath) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            for (String line : lines) {
                String[] parts = line.split(","); // Anta att varje attribut är separerat med ett kommatecken
                if (parts.length == 5) {
                    String name = parts[0];
                    int mental = Integer.parseInt(parts[1]);
                    int physical = Integer.parseInt(parts[2]);
                    int social = Integer.parseInt(parts[3]);
                    int spirit = Integer.parseInt(parts[4]);
                    Character character = new Character(name, mental, physical, social, spirit);
                    characterList.addCharacter(character);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public CharacterList getCharacterList() {
        return characterList;
    }
}
