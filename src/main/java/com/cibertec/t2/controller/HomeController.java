package com.cibertec.t2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String home() {
        return "redirect:/alquileres";
    }
    
    @GetMapping("/home")
    public String homeView() {
        return "redirect:/alquileres";
    }
} 