package com.example.ksw18cal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class MainController {

    @Autowired
    MainService mainService;

    @GetMapping("/")
    public String hello(){

        return "hello";
    }
}
