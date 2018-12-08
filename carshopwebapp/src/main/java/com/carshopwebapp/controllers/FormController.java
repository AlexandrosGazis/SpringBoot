package com.carshopwebapp.controllers;

import com.carshopwebapp.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class FormController {
    private final Logger logger = LoggerFactory.getLogger(FormController.class);


    @GetMapping("/aa")
    public String index() {

        logger.info("ok bika1(redirect ok)");
        return "redirect:/form";
    }

    @GetMapping("/form")
    public String formGet(Model model) {
        model.addAttribute("user", new User());
        logger.info("ok bika 2(from deriect gimme the form file");
        return "form";
    }

    @PostMapping("/form")
    public String formPost(@Valid User user, BindingResult bindingResult, Model model) {
        logger.info("ok bika 3 success here are the data you have entered");

        if (!bindingResult.hasErrors()) {
            model.addAttribute("noErrors", true);
        }
        model.addAttribute("user", user);
        return "form";
    }
}
