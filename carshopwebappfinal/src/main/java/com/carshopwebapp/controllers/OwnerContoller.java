package com.carshopwebapp.controllers;


import com.carshopwebapp.entitites.Owner;
import com.carshopwebapp.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller

public class OwnerContoller {
    @Autowired
    OwnerService service;


    @RequestMapping("/OwnerPages")
    public String ownerOptins() {
        return "OwnerPage.jsp";
    }


    @RequestMapping("/OwnerUpdatePage")
    public String ownerOptionUpdate(ModelMap modelMap) {
        List<Owner> owners = service.getAllOwners();
        modelMap.addAttribute("owners", owners);
        return "OwnerUpdatePage.jsp";
    }//ADD delete option


    @RequestMapping("/showCreate")
    public String createNewOwner() {
        return "createOwner.jsp";
    }


    @RequestMapping("/saveOwn")
    public String saveNewOwner(@ModelAttribute("owner") Owner owner, ModelMap modelMap) { //expose it out a as bean -spring container-
        Owner userSaved = service.saveOwner(owner);
        String msg = "Επιτυχης εισαγωγη δεδομενων με id: " + userSaved.getId();
        modelMap.addAttribute("msg", msg);
        return "createOwner.jsp";  //request modelattribute        //response modelmap (pass key value pairs)
    }


    @RequestMapping("/showUpdate")
    public String showOwner(@RequestParam("id") int id, ModelMap modelMap) {
        //model map for when we get back to the jsp
        Owner owner = service.getOwnerbyId(id);
        modelMap.addAttribute("owner", owner);
        return "updateOwner.jsp";
    }


    @RequestMapping("/updateOwn") //uri to handle
    public String updateOwner(@ModelAttribute("owner") Owner owner, ModelMap modelMap) {
        service.updateOwner(owner); // i wont use it so i dont save it somewhere like createOwner
        List<Owner> owners = service.getAllOwners();
        modelMap.addAttribute("owners", owners);
        return "OwnerUpdatePage.jsp"; //return to all records page
    }

}
