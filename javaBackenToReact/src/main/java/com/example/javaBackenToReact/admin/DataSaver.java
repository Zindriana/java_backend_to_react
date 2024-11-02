package com.example.javaBackenToReact.admin;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.javaBackenToReact.models.Character;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class DataSaver {

    private final ObjectMapper objectMapper = new ObjectMapper();

    public void saveCharactersToJson(List<Character> characters, String filePath) {
        try {
            objectMapper.writeValue(new File(filePath), characters);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
