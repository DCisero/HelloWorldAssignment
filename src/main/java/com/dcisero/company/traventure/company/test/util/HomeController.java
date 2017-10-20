package com.dcisero.company.traventure.company.test.util;

import model.DAO;
import model.DBCredentials;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.sql.*;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


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

    @RequestMapping("/userreport")
    public ModelAndView userreport() {

       return new ModelAndView("userreport", "report", "Report Information");
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

    public ModelAndView Admin()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection mysqlConnection;
            mysqlConnection = DriverManager.getConnection(
                    DBCredentials.DB_ADDRESS,
                    DBCredentials.USERNAME,
                    DBCredentials.PASSWORD);


            String readUserReportCommand = "select FirstName, LastName, Address1, Address2, City, State, Zip, Country, Date from userdata";

            Statement readUserReport = mysqlConnection.createStatement();

            ResultSet result = readUserReport.executeQuery(readUserReportCommand);

            ArrayList<UserReport> adminList = new ArrayList<UserReport>();
            while (result.next()) {

                UserReport temp = new UserReport (result.getString(1),result.getString(2),
                        result.getString(3),result.getString(4), result.getString(5),
                        result.getString(6), result.getInt(7), result.getString(8),
                result.getInt(9));


                adminList.add(temp);
            }
            return new ModelAndView ("userreport","adList",adminList);
        }
        catch (Exception ex){

        }
        return null;
    }

}
