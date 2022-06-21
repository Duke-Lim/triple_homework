package com.triple.homework.controller;

import org.springframework.web.bind.annotation.RestController;

import com.triple.homework.domain.ReviewEventParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class EventController {
    
    @PostMapping(value="/events")
    public boolean events(@RequestParam ReviewEventParam param) {

        if ()








        return true;
    }
}
