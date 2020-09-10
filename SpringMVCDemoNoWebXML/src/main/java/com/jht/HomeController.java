package com.jht;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class HomeController {

    @Autowired
    private Person person;

    @RequestMapping(value = "/", method=GET)
    public ModelAndView home() {
        System.out.println(person.getName());
        String message = "Hello world from Spri12ng MVC";
        return new ModelAndView("home", "message", message);
    }
}
