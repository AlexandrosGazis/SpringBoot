package com.carshopwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {


    @RequestMapping("/showCreate")
    public String createNewOwner(){
        return "createOwner";
    }

}
