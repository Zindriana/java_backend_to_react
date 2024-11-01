package com.example.javaBackenToReact;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @CrossOrigin(origins = "https://zindriana.github.io/react_to_java")
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}