package com.example;//package org.example;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping("/hello_world")
    public String printHelloWorld(){

        // add attribute to load modelMap
//        modelMap.addAttribute("message",
//                "Hello World and Welcome to Spring MVC!");

        // return the name of the file to be loaded "hello_world.jsp"
        return "hello_world";
    }

}