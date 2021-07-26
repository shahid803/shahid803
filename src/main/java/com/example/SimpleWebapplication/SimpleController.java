package com.example.SimpleWebapplication;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @RequestMapping("/")
    public String index(){
        return "Hello World....";
    }
}

@Component
@Scope("prototype")
class BeanClass{
}
