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

//public class LoginController implements AuthenticationSuccessHandler {
    public class LoginController {


    @Autowired
    OwnerService service;
    @Autowired
    RepairService service2;

    @RequestMapping("/welcomeUser")
    public ModelAndView helloUser(ModelMap modelMap) {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        System.out.println(username);
        //Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        //String currentPrincipalName = authentication.getName();

       // logger.info(currentPrincipalName);
       // System.out.println("\n\n======="+currentPrincipalName+ "=======\n\n");
       List<Owner> owners = service.getOwnersByEmail(username);
        System.out.println(owners);
        int idOwner = owners.get(0).getId();
        //System.out.println("AAAAAAAA"+idOwner);

        // owners.
       //int idOwner = 1;

        List<Repair> repairs = service2.getfindByIdEquals(idOwner);

        String msg = " " + username;
       // System.out.println(service.getOwnersByEmail(currentPrincipalName)); //delete
        modelMap.addAttribute("repairs", repairs);
        //System.out.println(service2.getfindByIdEquals(2));
        // logger.info(service.getfindByIdEquals(1).toString());
       modelMap.addAttribute("msg", msg);
        return new ModelAndView("welcome-user");
    }


   // @RequestMapping("/welcomeAdmin")
  //  public ModelAndView helloAdmin() {
   ///     String username = SecurityContextHolder.getContext().getAuthentication().getName();
   //     return new ModelAndView("welcome-admin");
  //  }

    }


