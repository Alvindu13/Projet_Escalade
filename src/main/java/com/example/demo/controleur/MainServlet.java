package com.example.demo.controleur;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainServlet {

    @GetMapping("/accueil")
    public String home(){
        return "index";
    }
}