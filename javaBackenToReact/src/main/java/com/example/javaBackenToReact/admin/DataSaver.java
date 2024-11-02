package com.example.javaBackenToReact.admin;

import com.example.javaBackenToReact.models.Hero;
import org.springframework.stereotype.Component;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@Component
public class DataSaver {

    public void saveHeroesToFile(List<Hero> heroes, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Hero hero : heroes) {
                // Anta att du har en metod i Character som konverterar objektet till en sträng
                writer.write(hero.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
