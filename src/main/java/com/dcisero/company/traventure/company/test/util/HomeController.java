package com.dcisero.company.traventure.company.test.util;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;


@Controller
public class HomeController {

    @RequestMapping("/")

    public ModelAndView helloWorld() {
        return new
                ModelAndView("welcome", "message", "Hello World");
    }

    @RequestMapping("/registration")
    public ModelAndView registration() {

        return new ModelAndView("registration", "reg", "Registration Information");
    }


    @RequestMapping(value = "/addUser")
    public ModelAndView addUser(
            @RequestParam("FirstName") String FirstName,
            @RequestParam("LastName") String LastName,
            @RequestParam("Address1") String Address1,
            @RequestParam("Address2") String Address2,
            @RequestParam("City") String City,
            @RequestParam("State") String State,
            @RequestParam ("Zip") int Zip,
            @RequestParam("Country") String Country) {


        boolean result = DAO.addUsers(FirstName, LastName, Address1, Address2, City, State, Zip, Country);

        if (result == false) {

            return new ModelAndView("error", "errmsg", "Adding info failed!");
        }


        ModelAndView mv = new ModelAndView("confirmation");
        mv.addObject("FirstName", FirstName);
        mv.addObject("LastName", LastName);
        mv.addObject("Address1", Address1);
        mv.addObject("Address2", Address2);
        mv.addObject("City", City);
        mv.addObject("State", State);
        mv.addObject("Zip", Zip);
        mv.addObject("Country", Country);

        return mv;
    }

    @RequestMapping("/userreport")
    public ModelAndView userreport()
    {

        ArrayList<UserReport> adminList = DAO.Admin();

        return new ModelAndView("userreport", "adList", adminList);


    }

}
