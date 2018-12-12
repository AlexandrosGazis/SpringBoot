package com.carshopwebapp.controllers;


import com.carshopwebapp.entitities.Owner;
import com.carshopwebapp.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller

public class OwnerContoller {
    @Autowired
    OwnerService service;


    @RequestMapping("/OwnerPages")
    public String ownerOptins() {
        return "OwnerPage";
    }


    @RequestMapping("/OwnerUpdatePage")
    public String ownerOptionUpdate(ModelMap modelMap) {
        List<Owner> owners = service.getAllOwners();
        modelMap.addAttribute("owners", owners);
        return "OwnerUpdatePage";
    }//ADD delete option


    @RequestMapping("/showCreate")
    public String createNewOwner() {
        return "createOwner";
    }


    @RequestMapping("/search")//epitheto
    public String search(Model model, @RequestParam (name = "epitheto") String surname)
    {
        model.addAttribute("owners", service.getOwnersBySurname(surname));
        return "registration-done";
        //String a= "registration-done"+;
      //  return a;
    }

    @RequestMapping("/search2")//afm
    public String search2(Model model, @RequestParam (name = "afm") String afm)
    {
        model.addAttribute("owners", service.getOwnersByAfm(afm));
        return "registration-done";
        //String a= "registration-done"+;
        //  return a;
    }

    @RequestMapping("/search3")//email
    public String search3(Model model, @RequestParam (name = "email") String email)
    {
        model.addAttribute("owners", service.getOwnersByEmail(email));
        return "registration-done";
        //String a= "registration-done"+;
        //  return a;
    }


    //http://localhost:8000/carshopwebapp/search?epitheto=Papakis









    @RequestMapping("/saveOwn")
    public String saveNewOwner(@ModelAttribute("owner") Owner owner, ModelMap modelMap) { //expose it out a as bean -spring container-
        Owner userSaved = service.saveOwner(owner);
        String msg = "Επιτυχης εισαγωγη δεδομενων με id: " + userSaved.getId();
        modelMap.addAttribute("msg", msg);
        return "createOwner";  //request modelattribute        //response modelmap (pass key value pairs)
    }


    @RequestMapping("/showUpdate")
    public String showOwner(@RequestParam("id") int id, ModelMap modelMap) {
        //model map for when we get back to the jsp
        Owner owner = service.getOwnerbyId(id);
        modelMap.addAttribute("owner", owner);
        return "updateOwner";
    }


    @RequestMapping("/updateOwn") //uri to handle
    public String updateOwner(@ModelAttribute("owner") Owner owner, ModelMap modelMap) {
        service.updateOwner(owner); // i wont use it so i dont save it somewhere like createOwner
        List<Owner> owners = service.getAllOwners();
        modelMap.addAttribute("owners", owners);
        return "OwnerUpdatePage"; //return to all records page
    }


    @RequestMapping("/deleteOwner") //it gets it from the displayOwners.jsp
    public String deleteOwner(@RequestParam("id") int id, ModelMap modelMap) {
        Owner owner = new Owner();
        owner = service.getOwnerbyId(id);//get the owner
        service.deleteOwner(owner); //delete the owner
        List<Owner> owners = service.getAllOwners();
        modelMap.addAttribute("owners", owners);
        //send response back via modelmap
        return "OwnerUpdatePage"; //go back to all Records page
    }

}
