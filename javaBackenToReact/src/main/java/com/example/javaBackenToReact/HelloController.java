package com.example.javaBackenToReact;
import com.example.javaBackenToReact.models.Character;
import com.example.javaBackenToReact.models.Randomizer;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class HelloController {
    CharacterList characterList = new CharacterList();

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

    @PostMapping("/newCharacter")
    public void newCharacter(@RequestBody Character character) {
        characterList.addCharacter(character);
    }
}