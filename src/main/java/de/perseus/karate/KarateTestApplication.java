package de.perseus.karate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KarateTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(KarateTestApplication.class, args);
	}

    @GetMapping("/greetings")
    public String greetings() {
        return "Hello World!";
    }

}
