package org.yascode.palywithjenkins.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/greeting")
    public String greeting() {
        String name = "Hello, Spring Boot!";
        return name;
    }

}
