package com.carshopwebapp.controllers;


import com.carshopwebapp.entitities.Repair;
import com.carshopwebapp.services.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller

public class RepairController {
    @Autowired
    RepairService service;


    @RequestMapping("/RepairPages")
    public String repairOptins() {
        return "RepairPage";
    }


    @RequestMapping("/RepairUpdatePage")
    public String repairOptionUpdate(ModelMap modelMap) {
        List<Repair> repairs = service.getAllRepairs();
        modelMap.addAttribute("repairs", repairs);
        return "RepairUpdatePage";
    }// ADD delete option

    @RequestMapping("/showCreateRepair")
    public String createNewRepair() {
        return "createRepairs";
    }


    @RequestMapping("/saveRepair")
    public String saveNewRepair(@ModelAttribute("repair") Repair repair, ModelMap modelMap) { //expose it out a as bean -spring container-
        Repair repairSaved = service.saveRepair(repair);
        String msg = "Επιτυχης εισαγωγη δεδομενων με id: " + repairSaved.getId();
        modelMap.addAttribute("msg", msg);
        return "createRepairs";//request modelattribute//response modelmap (pass key value pairs)
    }


    @RequestMapping("/showUpdateRepair")
    public String showRepair(@RequestParam("id") int id, ModelMap modelMap) {
        //model map for when we get back to the jsp
        Repair repair = service.getRepairbyId(id);
        modelMap.addAttribute("repair", repair);
        return "updateRepairs";
    }


    @RequestMapping("/updateRepair") //uri to handle
    public String updateRepairs(@ModelAttribute("repair") Repair repair, ModelMap modelMap) {
        service.updateRepair(repair); // i wont use it so i dont save it somewhere like createRepair
        List<Repair> repairs = service.getAllRepairs();
        modelMap.addAttribute("repairs", repairs);
        return "RepairUpdatePage"; //return to all records page
    }


    @RequestMapping("/deleteRepair") //it gets it from the displayRepairs.jsp
    public String deleteRepair(@RequestParam("id") int id, ModelMap modelMap) {
        Repair repair = new Repair();
        repair = service.getRepairbyId(id);//get the repair
        service.deleteRepair(repair); //delete the repair
        List<Repair> repairs = service.getAllRepairs();
        modelMap.addAttribute("repairs", repairs);
        //send response back via modelmap
        return "RepairUpdatePage"; //go back to all Records page
    }
}
