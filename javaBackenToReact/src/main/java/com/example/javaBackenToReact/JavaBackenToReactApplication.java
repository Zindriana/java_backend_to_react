package com.example.javaBackenToReact;

import com.example.javaBackenToReact.admin.DataLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaBackenToReactApplication implements CommandLineRunner {

	private final DataLoader dataLoader;

	@Autowired
	public JavaBackenToReactApplication(DataLoader dataLoader) {
		this.dataLoader = dataLoader;
	}

	public static void main(String[] args) {
		SpringApplication.run(JavaBackenToReactApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		dataLoader.loadCharactersFromJson("save.json");
	}
}
