package com.carshopwebapp.controllers;

import com.carshopwebapp.Service.OwnerService;
import com.carshopwebapp.entities.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class OwnerController {

    @Autowired
    OwnerService service;

        @RequestMapping("/sintelestes")
        public String contributors() {
            return "redirect:/sintelestes.html";
        }



    @RequestMapping("/showCreate")
    public String createNewOwner() {
        return "createOwner.jsp";
    }


    @RequestMapping("/saveOwn")
    public String saveNewOwner(@ModelAttribute("owner") Owner owner, ModelMap modelMap) { //expose it out a as bean -spring container-
        Owner userSaved = service.saveOwner(owner);
        String msg = "Επιτυχης εισαγωγη δεδομενων με id: " + userSaved.getId();
        modelMap.addAttribute("msg", msg);
        return "createOwner.jsp";
        //request modelattribute
        //response modelmap (pass key value pairs)
    }

    @RequestMapping("/displayOwners")
    public String displayOwners(ModelMap modelMap) {
        List<Owner> owners = service.getAllOwners();
        modelMap.addAttribute("owners", owners);
        return "displayOwners.jsp";
    }

    @RequestMapping("/deleteOwner") //it gets it from the displayOwners.jsp
    public String deleteOwner(@RequestParam("id") int id, ModelMap modelMap) {
        Owner owner = new Owner();
        owner = service.getOwnerbyId(id);//get the owner
        service.deleteOwner(owner); //delete the owner
        List<Owner> owners = service.getAllOwners();
        modelMap.addAttribute("owners", owners);
        //send response back via modelmap
        return "displayOwners.jsp"; //go back to all Records page
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
        return "displayOwners.jsp"; //return to all records page
    }


}
