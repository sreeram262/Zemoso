package com.example.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coach;
    @Value("${team.name}")
    private String team;
    @GetMapping("/")
    public String sayHello()
    {
        return "Hello the date is "+ LocalDate.now();
    }

    @GetMapping("/workout")
    public String getDailyWorkout()
    {
        return "run 1K everyday";
    }

    @GetMapping("/teaminfo")
    public String teaminfo()
    {
        return "Coach name: "+coach+"\n Team name: "+team;
    }

}
