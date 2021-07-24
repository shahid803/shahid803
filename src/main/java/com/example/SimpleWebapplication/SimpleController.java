package com.example.SimpleWebapplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @RequestMapping("/")
    public String index(){
        return "Hello My First Web";
    }
}
