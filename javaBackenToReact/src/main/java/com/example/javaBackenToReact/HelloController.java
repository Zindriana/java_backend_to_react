package com.example.javaBackenToReact;
import com.example.javaBackenToReact.lists.HeroList;
import com.example.javaBackenToReact.models.Hero;
import com.example.javaBackenToReact.models.Randomizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {
    private final HeroList heroList;

    @Autowired
    public HelloController(HeroList heroList) {
        this.heroList = heroList;
    }

    @CrossOrigin(origins = "https://zindriana.github.io/")
    //@CrossOrigin(origins = "http://localhost:5173/")
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/rolldie")
    public int dieRoll(@RequestParam(value = "amount", defaultValue = "1") int amount) {
        Randomizer rand  = new Randomizer();
        return rand.rollDice(amount);
    }

    @PostMapping("/newcharacter")
    public void newCharacter(@RequestBody Hero hero) {
        heroList.addHero(hero);
    }

    @GetMapping("/getcharacters")
    public List<Hero> getCharacters() {
        return heroList.getHeroes();
    }
}