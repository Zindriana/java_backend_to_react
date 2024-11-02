package com.example.javaBackenToReact;
import com.example.javaBackenToReact.models.Character;
import com.example.javaBackenToReact.models.Randomizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {
    private final CharacterList characterList;

    @Autowired
    public HelloController(CharacterList characterList) {
        this.characterList = characterList;
    }

    @CrossOrigin(origins = "http://localhost:5173/")
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
    public void newCharacter(@RequestBody Character character) {
        characterList.addCharacter(character);
        System.out.println("New character added: " + character);
    }

    @GetMapping("/getcharacters")
    public List<Character> getCharacters() {
        return characterList.getCharacters();
    }
}