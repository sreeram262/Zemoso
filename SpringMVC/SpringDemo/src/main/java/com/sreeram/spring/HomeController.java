package com.sreeram.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping("/main-menu")
    public String showPage()
    {
        return "main-menu";
    }

}
