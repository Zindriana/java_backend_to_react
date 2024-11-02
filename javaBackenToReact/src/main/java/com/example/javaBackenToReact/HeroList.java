package com.example.javaBackenToReact;

import com.example.javaBackenToReact.admin.DataSaver;
import com.example.javaBackenToReact.models.Hero;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class HeroList {
    DataSaver dataSaver;

    private List<Hero> heroes = new ArrayList<>();

    public List<Hero> getHeroes() {
        return heroes;
    }

    public void addHero(Hero hero) {
        this.heroes.add(hero);
        dataSaver.saveHeroesToFile(heroes,"herosave");
    }
}
