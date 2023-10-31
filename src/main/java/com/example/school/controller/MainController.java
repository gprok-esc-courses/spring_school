package com.example.school.controller;

import com.example.school.model.Major;
import com.example.school.repository.MajorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Controller
public class MainController {

    @Autowired
    private MajorRepository majorRepository;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/majors")
    public String majors(Model model) {
        List<Major> majors = majorRepository.findAll();
        model.addAttribute("majors", majors);
        return "majors";
    }

    @GetMapping("/major/{mid}")
    public String major(@PathVariable long mid, Model model) {
        Optional<Major> major = majorRepository.findById(mid);
        if(major.isPresent()) {
            model.addAttribute("major", major.get());
            return "major";
        }
        else {
            return "error";
        }

    }
}
