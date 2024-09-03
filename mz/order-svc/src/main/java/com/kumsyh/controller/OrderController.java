package com.kumsyh.controller;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequiredArgsConstructor
public class OrderController {

    @GetMapping("/orders")
    public String get() {
        return "hi";
    }

}
