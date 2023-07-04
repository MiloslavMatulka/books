package com.example.books.controller;

import com.example.books.model.It;
import com.example.books.service.ItTestService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/test")
public class ItTestController {

    @Autowired
    private ItTestService itTestServiceImpl;

    private final Logger logger =
            LoggerFactory.getLogger(ItTestController.class);

    @GetMapping(value = "/get-all")
    public List<It> getAll() {
        logger.info("Getting all IT books");
        return itTestServiceImpl.getAll();
    }

}
