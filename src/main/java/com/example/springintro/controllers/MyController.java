package com.example.springintro.controllers;

import com.example.springintro.services.CalculateDay;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/")
    public String index() {
        return "Hello World!";
    }

    @GetMapping("/write")
    public String write(@RequestParam String udskriv) {
        return "Your input is: " + udskriv;
    }

    @GetMapping("/isitfriday")
    public String isItFriday(@RequestParam int day, int month, int year) {
        CalculateDay calculator = new CalculateDay();
        String dayFound = calculator.zellercongruence(day, month, year);
        if (dayFound.equals("Friday")) {
            return "It's Friday, YAY! ";
        } else {
            return "Its unfortunately not friday yet. \nToday's day is: " + dayFound;
        }
    }
}
