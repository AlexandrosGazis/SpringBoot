package com.carshopwebapp.controllers;


import com.carshopwebapp.entitities.Repair;
import com.carshopwebapp.services.OwnerService;
import com.carshopwebapp.services.RepairService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller

public class GenericLinksController {

    @Autowired
    OwnerService service;
    @Autowired
    RepairService service2;

    Logger logger = LoggerFactory.getLogger(RepairController.class);


    @RequestMapping("/")
    public String startPage() {
        return "redirect:/index.html";
    }

    @RequestMapping("/sintelestes")
    public String contributors() {
        return "redirect:/sintelestes.html";
    }


    @RequestMapping("/search")//epitheto
    public String search(Model model, @RequestParam(name = "epitheto") String surname)
    {
        model.addAttribute("owners", service.getOwnersBySurname(surname));
        return "registration-done";
    }    //http://localhost:8000/carshopwebapp/search?epitheto=Papakis


    @RequestMapping("/search2")//afm
    public String search2(Model model, @RequestParam (name = "afm") String afm)
    {
        model.addAttribute("owners", service.getOwnersByAfm(afm));
        return "registration-done";
    }    //http://localhost:8000/carshopwebapp/search2?afm=ASE-2934


    @RequestMapping("/search3")//email
    public String search3(Model model, @RequestParam (name = "email") String email)
    {
        model.addAttribute("owners", service.getOwnersByEmail(email));
        return "registration-done";
    }    //http://localhost:8000/carshopwebapp/search3?email=akis@aol.com


    @RequestMapping("/search-afm")
    public String searchAfm() {
        return "redirect:/anagnwstakisInputAFM.html";
    }

    @RequestMapping("/search-email")
    public String searcEmail() {
        return "redirect:/anagnwstakisInputEmail.html";
    }

    @RequestMapping("/search-epitheto")
    public String searchEpitheto() {
        return "redirect:/anagnwstakisInputEpitheto.html";
    }


    @RequestMapping("/welcomeUser2")
    public String searchUserInfo(ModelMap modelMap) {
        List<Repair> repairs = service2.getfindByIdEquals(2);
        modelMap.addAttribute("repairs", repairs);
        System.out.println(service2.getfindByIdEquals(2));
        // logger.info(service.getfindByIdEquals(1).toString());
        return "welcome-user2";
    }


}
