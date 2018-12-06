package com.carshopwebapp.controllers;

import com.carshopwebapp.Service.OwnerService;
import com.carshopwebapp.entities.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
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
    public String saveNewOwner(@ModelAttribute("owner") Owner owner, ModelMap modelMap) { //expose it out a as bean -spring container-
        Owner userSaved =  service.saveOwner(owner);
        String msg = "Επιτυχης εισαγωγη δεδομενων με id: "+ userSaved.getId();
        modelMap.addAttribute("msg",msg);
        return "createOwner";
        //request modelattribute
        //response modelmap (pass key value pairs)
    }

    


}
