package com.carshopwebapp.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.carshopwebapp.entities.Greeting;



@Controller

public class GreetingController {

    private final Logger logger = LoggerFactory.getLogger(GreetingController.class);

 /*   @RequestMapping("/kwstas")
    public String createNewRepair() {
        return "createInputUser.jsp";
    }
/*
  / /* @RequestMapping(value = "/kwstas", method = RequestMethod.POST)
    @RequestMapping(value = "/kwstas")
    public String authenticateUser(@RequestParam("userName") String userName, @RequestParam("password") String password , Model model) {
        //System.out.println("coming in controller    " +userName +" : "+ password);
        logger.info("Επιτυχης εισαγωγη δεδομενων ");
        logger.info("coming in controller    " +userName +" : "+ password);
        model.addAttribute("message", "Hello Spring MVC Framework!");
        logger.info("Επιτυχης εισαγωγη δεδομενων ");

        String message = "Επιτυχης εισαγωγη δεδομενων με id: " + userName+password;

        return "createInputUser.jsp";
    }*/

  /*  @GetMapping("/kwstas")
    public String greetingForm(Model model) {
        model.addAttribute("message", new Greeting());
        return "message";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        return "message";
    }
*/

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        logger.info("Επιτυχης εισαγωγη δεδομενων ola ok");
        model.addAttribute("greeting", new Greeting());
        logger.info("Επιτυχης εισαγωγη δεδομενων ola ok2");
        return "greeting.html";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        logger.info("Επιτυχης εισαγωγη δεδομενων 33");
        return "result.html";
    }


//deelte createInputUser.jspp, DisplayInputUser.jsp

    //   @RequestMapping(value="/forgotpassword", method=RequestMethod.POST)
  //  public String recoverPass(@RequestParam("j_username") String username) {
  //      //do smthin
  //  }
}
