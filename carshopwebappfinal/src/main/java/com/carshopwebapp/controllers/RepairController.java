package com.carshopwebapp.controllers;


import com.carshopwebapp.entitities.Repair;
import com.carshopwebapp.services.RepairService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller

public class RepairController {
    @Autowired
    RepairService service;



    @RequestMapping("/RepairPages")
    public String repairOptins() {
        return "repair-page";
    }


    @RequestMapping("/RepairUpdatePage")
    public String repairOptionUpdate(ModelMap modelMap) {
        List<Repair> repairs = service.getAllRepairs();
        modelMap.addAttribute("repairs", repairs);
        return "repair-update-page";
    }// ADD delete option

    @RequestMapping("/showCreateRepair")
    public String createNewRepair() {
        return "create-repairs";
    }


    @RequestMapping("/saveRepair")
    public String saveNewRepair(@ModelAttribute("repair") Repair repair, ModelMap modelMap) { //expose it out a as bean -spring container-
        Repair repairSaved = service.saveRepair(repair);
        String msg = "Επιτυχης εισαγωγη δεδομενων με id: " + repairSaved.getId();
        modelMap.addAttribute("msg", msg);
        return "create-repairs";//request modelattribute//response modelmap (pass key value pairs)
    }


    @RequestMapping("/showUpdateRepair")
    public String showRepair(@RequestParam("id") int id, ModelMap modelMap) {
        //model map for when we get back to the jsp
        Repair repair = service.getRepairbyId(id);
        modelMap.addAttribute("repair", repair);
        return "update-repairs";
    }


    @RequestMapping("/updateRepair") //uri to handle
    public String updateRepairs(@ModelAttribute("repair") Repair repair, ModelMap modelMap) {
        service.updateRepair(repair); // i wont use it so i dont save it somewhere like createRepair
        List<Repair> repairs = service.getAllRepairs();
        modelMap.addAttribute("repairs", repairs);
        return "repair-update-page"; //return to all records page
    }


    @RequestMapping("/deleteRepair") //it gets it from the displayRepairs.jsp
    public String deleteRepair(@RequestParam("id") int id, ModelMap modelMap) {
        Repair repair = new Repair();
        repair = service.getRepairbyId(id);//get the repair
        service.deleteRepair(repair); //delete the repair
        List<Repair> repairs = service.getAllRepairs();
        modelMap.addAttribute("repairs", repairs);   //send response back via modelmap
        return "repair-update-page"; //go back to all Records page
    }


    @RequestMapping("/LastRepairs")
    public String searchAdminInfo(@ModelAttribute("repair") Repair repair, ModelMap modelMap) {
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        String formattedDate = dateFormat.format(new Date());
        List<Repair> repairs = service.getFirst10Repairs(formattedDate);
        modelMap.addAttribute("repairs", repairs);

        return "repair-last-dates";
    }

}





