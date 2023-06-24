package com.example.diplom.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/premium")
public class PremiumController {

    @GetMapping()
    public String homePage(){
        return "premium/thePremiumPage";
    }


}
