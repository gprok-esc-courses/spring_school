package com.example.school.controller;

import com.example.school.dto.UserDto;
import com.example.school.model.Major;
import com.example.school.model.User;
import com.example.school.repository.MajorRepository;
import com.example.school.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class MainController {

    @Autowired
    private MajorRepository majorRepository;

    @Autowired
    private UserRepository userRepository;

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

    @GetMapping("/register")
    public String register(Model model) {
        UserDto userDto = new UserDto();
        model.addAttribute("userDto", userDto);
        return "auth/register";
    }

    @PostMapping("/register")
    public String register_save(@ModelAttribute UserDto userDto) {
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        userRepository.save(user);
        return "auth/register";
    }

    @GetMapping("/login")
    public String login() {
        return "auth/login";
    }
}
