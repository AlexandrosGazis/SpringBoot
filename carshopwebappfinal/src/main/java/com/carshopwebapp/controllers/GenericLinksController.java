package com.carshopwebapp.controllers;


import com.carshopwebapp.entitities.Owner;
import com.carshopwebapp.entitities.Repair;
import com.carshopwebapp.services.OwnerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller

public class GenericLinksController {
    private final Logger logger = LoggerFactory.getLogger(GenericLinksController.class);


    @Autowired
    private OwnerService userService;

    @RequestMapping("/")
    public String startPage() {
        return "redirect:/index2.html";
    }

    @RequestMapping("/sintelestes")
    public String contributors() {
        return "redirect:/sintelestes.html";
    }



}
