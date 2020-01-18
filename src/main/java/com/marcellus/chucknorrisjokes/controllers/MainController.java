package com.marcellus.chucknorrisjokes.controllers;

import com.marcellus.chucknorrisjokes.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private JokeService jokeService;

    @Autowired
    public MainController(JokeService jokeService){
        this.jokeService = jokeService;
    }

    @GetMapping("/")
    public String getJoke(Model model){

        model.addAttribute("joke", jokeService.getJoke());
        return "chucknorris";
    }
}
