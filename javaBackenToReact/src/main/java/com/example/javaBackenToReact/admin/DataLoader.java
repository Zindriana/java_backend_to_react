package com.example.javaBackenToReact.admin;
import com.example.javaBackenToReact.CharacterList;
import com.example.javaBackenToReact.models.Character;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Component
public class DataLoader {

    private final CharacterList characterList;
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    public DataLoader(CharacterList characterList) {
        this.characterList = characterList;
    }

    public void loadCharactersFromJson(String filePath) {
        try {
            List<Character> characters = objectMapper.readValue(new File(filePath), new TypeReference<List<Character>>(){});
            for (Character character : characters) {
                characterList.addCharacter(character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
