package com.carshopwebapp.controllers;


import com.carshopwebapp.entitities.Owner;
import com.carshopwebapp.entitities.Repair;
import com.carshopwebapp.services.OwnerService;
import com.carshopwebapp.services.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller

public class LoginController {


    @Autowired
    OwnerService service;
    @Autowired
    RepairService service2;

    @RequestMapping("/welcomeUser")
    public ModelAndView helloUser(ModelMap modelMap) {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();// System.out.println(username);
        List<Owner> owners = service.getOwnersByEmail(username);
        System.out.println(owners);
        int idOwner = owners.get(0).getId();
        List<Repair> repairs = service2.getfindByIdEquals(idOwner);
        String msg = " " + username;
        modelMap.addAttribute("repairs", repairs);

        modelMap.addAttribute("msg", msg);
        return new ModelAndView("welcome-user");
    }

}


