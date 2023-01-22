package org.yascode.palywithjenkins.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/greetingS")
    public String greetingS() {
        String name = "Hello, Spring Boot!";
        return name;
    }

    @GetMapping("/greetingJ")
    public String greetingJ() {
        String name = "Hello, Jenkins!";
        return name;
    }

}
