package com.example.projectb.controllers;

import com.example.projectb.entities.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {


    @GetMapping("/")
    public String home(){return "home";}

    @GetMapping("/list")
    public String getLocalModel(Model model){
        List<String> listOfStrings = new ArrayList<>(Arrays.asList("first","second"));
        model.addAttribute("name", "Michal");
        model.addAttribute("localList",listOfStrings);
        return "list";
    }



}
