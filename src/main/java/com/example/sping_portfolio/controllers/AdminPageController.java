package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class AdminPageController {
    @GetMapping("/adminPage")
    // CONTROLLER handles GET request for /binary, maps it to binary() and does variable bindings
    public String adminPage() {
        return "adminPage"; // returns HTML VIEW (binary)
    }
}

