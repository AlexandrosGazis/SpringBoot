package com.carshopwebapp.controllers;


import com.carshopwebapp.entitities.Owner;
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
        return "owner-page";
    }


    @RequestMapping("/OwnerUpdatePage")
    public String ownerOptionUpdate(ModelMap modelMap) {
        List<Owner> owners = service.getAllOwners();
        modelMap.addAttribute("owners", owners);
        return "owner-update-page";
    }//ADD delete option


    @RequestMapping("/showCreate")
    public String createNewOwner() {
        return "create-owner";
    }


    @RequestMapping("/saveOwn")
    public String saveNewOwner(@ModelAttribute("owner") Owner owner, ModelMap modelMap) { //expose it out a as bean -spring container-
        service.createhashPassword(owner);
        service.updateOwner(owner);
        service.saveOwner(owner);
        return "create-owner";  //request modelattribute   response modelmap (pass key value pairs)
    }


    @RequestMapping("/showUpdate")
    public String showOwner(@RequestParam("id") int id, ModelMap modelMap) {
        //model map for when we get back to the jsp
        Owner owner = service.getOwnerbyId(id);
        modelMap.addAttribute("owner", owner);
        return "update-owner";
    }

    @RequestMapping("/updateOwn") //uri to handle
    public String updateOwner(@ModelAttribute("owner") Owner owner, ModelMap modelMap) {
        service.updateOwner(owner); // i wont use it so i dont save it somewhere like createOwner
        List<Owner> owners = service.getAllOwners();
        modelMap.addAttribute("owners", owners);
        return "owner-update-page"; //return to all records page
    }


    @RequestMapping("/deleteOwner") //it gets it from the displayOwners.jsp
    public String deleteOwner(@RequestParam("id") int id, ModelMap modelMap) {
        Owner owner = new Owner();
        owner = service.getOwnerbyId(id);//get the owner
        service.deleteOwner(owner); //delete the owner
        List<Owner> owners = service.getAllOwners();
        modelMap.addAttribute("owners", owners);        //send response back via modelmap

        return "owner-update-page"; //go back to all Records page
    }

}