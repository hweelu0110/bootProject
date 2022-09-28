package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String hello(Model model) {
        model.addAttribute("username","jisun");
        return "greetings"; //templates/greetings.mustache
    }

    @GetMapping("/bye")
    public String seeYou(Model model) {
        model.addAttribute("nickname","홍길동");
        return "goodbye";
    }
}
