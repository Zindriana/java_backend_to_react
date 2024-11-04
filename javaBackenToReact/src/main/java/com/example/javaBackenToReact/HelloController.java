package com.example.javaBackenToReact;
import com.example.javaBackenToReact.lists.HeroList;
import com.example.javaBackenToReact.lists.ScrollList;
import com.example.javaBackenToReact.models.Hero;
import com.example.javaBackenToReact.models.Randomizer;
import com.example.javaBackenToReact.models.Scroll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {
    private final HeroList heroList;
    private final ScrollList scrollList;

    @Autowired
    public HelloController(HeroList heroList, ScrollList scrollList) {
        this.heroList = heroList;
        this.scrollList = scrollList;
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

    @PostMapping("/newscroll")
    public void newScroll(@RequestBody Scroll scroll) {
        scrollList.addScroll(scroll);
    }

    @GetMapping("/getcharacters")
    public List<Hero> getCharacters() {
        return heroList.getHeroes();
    }

    @GetMapping("/getscrolls")
    public List<Scroll> getScrolls() { return scrollList.getScrolls(); }
}