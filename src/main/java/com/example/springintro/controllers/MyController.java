package com.example.springintro.controllers;

import com.example.springintro.services.CalculateDay;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

    @RestController
public class MyController {
        @GetMapping("/")
        public String index(){
            return "Hello World!";
        }

        @GetMapping("/write")
        public String write(@RequestParam String udskriv){
            return "Your input is: " + udskriv;
        }
        @GetMapping("/day")
        public String findDay(@RequestParam int day, int month, int year){
            CalculateDay calculator = new CalculateDay();
            return "Det er: " + calculator.zellercongruence(day, month, year);
        }
    }
