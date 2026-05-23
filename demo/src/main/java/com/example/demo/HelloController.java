package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController{
    @GetMapping("/")
    public String home() {
        return "Acessando um sistema web em java";
    }
    

	
}
