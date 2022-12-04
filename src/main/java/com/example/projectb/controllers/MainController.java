package com.example.projectb.controllers;

import com.example.projectb.entities.Worker;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {
    private List<Worker> listOfWorkers;
    public MainController() {

        Worker firstWorker = new Worker("Zambrowski", "Wojciech");
        Worker secondWorker = new Worker("Ciechowski", "Arkadiusz");
        listOfWorkers = new ArrayList<>(Arrays.asList(firstWorker, secondWorker));
    }


    @GetMapping("/")
    public String home(){return "home";}


    @GetMapping("/list")
    public String getLocalModel(Model model){

        model.addAttribute("name", "Lista pracowników");
        model.addAttribute("localList",listOfWorkers);
        model.addAttribute("addedLocalWorker",new Worker());

        return "list";
    }
    @PostMapping("/add-local-worker")
    public String addLocalModel(@ModelAttribute Worker addedLocalWorker){
        listOfWorkers.add(addedLocalWorker);
        return "redirect:/list";
    }

}
