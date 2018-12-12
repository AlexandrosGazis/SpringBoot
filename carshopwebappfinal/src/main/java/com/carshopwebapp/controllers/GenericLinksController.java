package com.carshopwebapp.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class GenericLinksController {



    @RequestMapping("/")
    public String startPage() {
        return "redirect:/index2.html";
    }

    @RequestMapping("/sintelestes")
    public String contributors() {
        return "redirect:/sintelestes.html";
    }



}
