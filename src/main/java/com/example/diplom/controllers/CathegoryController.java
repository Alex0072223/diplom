package com.example.diplom.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/category")
public class CathegoryController {


    @GetMapping()
    public String homePage(){
        return "cathegory/theCategoryPage";
    }
    @GetMapping("/id")
    public String cathIdPage(){
        return "cathegory/theCategoryPageID";
    }
    @GetMapping("/idtwo")
    public String cathIdPageTwo(){
        return "cathegory/theCategoryPageIDtwo";
    }
    @GetMapping("/idthree")
    public String cathIdPageThree(){
        return "cathegory/theCategoryPageIDthree";
    }

}
