package com.carshopwebapp.controllers;

import com.carshopwebapp.Service.OwnerService;
import com.carshopwebapp.entities.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    @Autowired
    OwnerService service;

    @RequestMapping("/showCreate")
    public String createNewOwner() {
        return "createOwner";
    }

    @RequestMapping("/saveOwn")
    public String saveNewOwner(@ModelAttribute("owner") Owner owner) { //expose it out a as bean -spring container-
        service.saveOwner(owner);
        return "createOwner";//maprequest
    }


}
