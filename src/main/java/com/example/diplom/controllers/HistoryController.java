package com.example.diplom.controllers;

import com.example.diplom.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/history")
public class HistoryController {

    private final UserService userService;

    @Autowired
    public HistoryController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String historyPage(){
        userService.doHistoryStuff();
        return "history/theHistoryPage";
    }

    @GetMapping("/theHistoryPageID")
    public String historyIdPage(){
        userService.doHistoryStuff();
        return "history/theHistoryPageID";
    }
    @GetMapping("/theHistoryPageIDtwo")
    public String historyIdPageTwo(){
        userService.doHistoryStuff();
        return "history/theHistoryPageIDtwo";
    }

}
