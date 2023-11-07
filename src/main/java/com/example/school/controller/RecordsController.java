package com.example.school.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecordsController {

    @GetMapping("/records/test")
    public String test() {
        return "error.html";
    }
}
