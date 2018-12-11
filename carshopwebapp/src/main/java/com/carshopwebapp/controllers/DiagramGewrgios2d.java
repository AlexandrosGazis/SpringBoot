package com.carshopwebapp.controllers;

import com.carshopwebapp.Service.OwnerService;
import com.carshopwebapp.Service.RepairService;
import com.carshopwebapp.entities.Owner;
import com.carshopwebapp.entities.Repair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DiagramGewrgios2d {


    @Autowired
    RepairService service;
    @Autowired
    OwnerService serviceOwn;


    @RequestMapping("/")
    public String startPage() {
        return "redirect:/index2.html";
    }


    @RequestMapping("/RepairPages")
    public String repairOptins() {
        return "RepairPage.jsp";
    }

    @RequestMapping("/RepairUpdatePage")
    public String repairOptionUpdate(ModelMap modelMap) {
        List<Repair> repairs = service.getAllRepairs();
        modelMap.addAttribute("repairs", repairs);
        return "RepairUpdatePage.jsp";
    }


    @RequestMapping("/OwnerPages")
    public String ownerOptins() {
        return "OwnerPage.jsp";
    }

    @RequestMapping("/OwnerUpdatePage")
    public String ownerOptionUpdate(ModelMap modelMap) {
        List<Owner> owners = serviceOwn.getAllOwners();
        modelMap.addAttribute("owners", owners);
        return "OwnerUpdatePage.jsp";
    }




}
