package com.killoranrivers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/results")
public class ResultsController {
    @GetMapping
    public String viewResults() {
        return "results";
    }
}
