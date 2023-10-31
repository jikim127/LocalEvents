package com.example.localevents.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalendarController {

    @GetMapping({"/index", "/about-us", "/blog", "/blog-details", "/contact", "/main", "/schedule", "/speaker"})
    public void main() {
    }

    @GetMapping("/calendar")
    public String calendar(Model model) {
        model.addAttribute("data","hello!!");
        return "calendar";
    }
}
