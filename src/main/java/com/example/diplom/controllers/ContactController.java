package com.example.diplom.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contact")
public class ContactController {
    //TODO: ROAD TO REST
    @GetMapping()
    public String homePage(){
        return "contact/theContactPage";
    }
}
