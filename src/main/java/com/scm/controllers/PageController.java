package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(){
        return "home"; 
    }

    @RequestMapping("/about")
    public String about(){
        return "about";
    }


    @RequestMapping("/services")
    public String services(){
        return "services";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/contact")
    public String contact(){
        return "contact";
    }

    @RequestMapping("/register")
    public String signup(){
        return "register";
    }
}
