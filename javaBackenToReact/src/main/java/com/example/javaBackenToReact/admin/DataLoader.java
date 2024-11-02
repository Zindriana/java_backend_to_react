package com.example.javaBackenToReact.admin;
import com.example.javaBackenToReact.HeroList;
import com.example.javaBackenToReact.models.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Component
public class DataLoader {

    private final HeroList heroList;

    @Autowired
    public DataLoader(HeroList heroList) {
        this.heroList = heroList;
    }

    public void loadHeroesFromTxt(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Förutsatt att du har en metod för att skapa en Hero från en sträng
                Hero hero = Hero.fromString(line);
                heroList.addHero(hero);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
