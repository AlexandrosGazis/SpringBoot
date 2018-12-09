package com.carshopwebapp.controllers;

import com.carshopwebapp.Service.UserService;
import com.carshopwebapp.entities.Repair;
import com.carshopwebapp.entities.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(UserController.class);


    @Controller
    @RequestMapping("/register")
    public class UserRegistrationController {

        @Autowired
        private UserService userService;

        @RequestMapping(method = RequestMethod.GET)
        public String handleGetRequest() {
            logger.info("ok bika ");

            return "user-registration.jsp";
        }

        @RequestMapping(method = RequestMethod.POST)
        public String handlePostRequest(User user, Model model, Repair repair) {
            userService.saveUser(user);
            if (userService.validUser(user) == true) {  // Ebale stoixeia pou uparxoyn ston pinaka
                logger.info("ELAAAAAAAA ok bikaaaaaaaaaaaaaaaa 1(from deriect gimme the form file)");
            }
            logger.info("bbbbbbbbbbbbbbbbbbbbbb bikaaaaaaaaaaaaaaaa 2(from deriect gimme the form file");

            // allios epistrefei sto registration page me minima lathos stoixeion
            //return "user-registration.jsp";
            return "registration-done.jsp";
        }



    }
}
