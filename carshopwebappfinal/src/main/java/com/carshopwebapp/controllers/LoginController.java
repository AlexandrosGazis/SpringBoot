package com.carshopwebapp.controllers;


import com.carshopwebapp.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

//public class LoginController implements AuthenticationSuccessHandler {
    public class LoginController {

    @Autowired
    OwnerService service;


    @RequestMapping("/welcomeUser")
    public ModelAndView helloUser() {
        return new ModelAndView("welcomeUser");
    }


    @RequestMapping("/welcomeAdmin")
    public ModelAndView helloAdmin() {
        return new ModelAndView("welcomeAdmin");
    }

    }


