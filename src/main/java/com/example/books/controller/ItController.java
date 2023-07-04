package com.example.books.controller;

import com.example.books.service.ItTestService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItController {

    @Autowired
    private ItTestService itServiceImpl;

    private final Logger logger = LoggerFactory.getLogger(ItController.class);

    @GetMapping("/")
    public String viewHomePage(Model model) {
        logger.info("Viewing home page, getting all IT books");
        model.addAttribute("allit", itServiceImpl.getAll());
        return "index";
    }

}
