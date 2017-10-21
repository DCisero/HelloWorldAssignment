package com.dcisero.company.traventure.company.test.util;

import model.DBCredentials;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;

public class DAO {


        public static boolean addUsers(
                String FirstName,
                String LastName,
                String Address1,
                String Address2,
                String City,
                String State,
                int Zip,
                String Country) {

            try {
                Class.forName("com.mysql.jdbc.Driver");

                Connection mysqlConnection;
                mysqlConnection = DriverManager.getConnection(
                        DBCredentials.DB_ADDRESS,
                        DBCredentials.USERNAME,
                        DBCredentials.PASSWORD);

                String addUsersCommand = "INSERT INTO userinfo " +
                        "(FirstName, LastName, Address1, Address2, City, State, Zip, Country) " +
                        "VALUES ('" +
                        FirstName + "', '" +
                        LastName + "', '" +
                        Address1 + "', '" +
                        Address2 + "', '" +
                        City + "', '" +
                        State + "', '" +
                        Zip + "', '" +
                        Country + "')";
                System.out.println("SQL Query " + addUsersCommand);

                Statement st = mysqlConnection.createStatement();

                int results = st.executeUpdate(addUsersCommand);

                return true;
            } catch (Exception ex) {
                ex.printStackTrace();
                return false;
            }
        }

    public static ArrayList<UserReport> Admin()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection mysqlConnection;
            mysqlConnection = DriverManager.getConnection(
                    DBCredentials.DB_ADDRESS,
                    DBCredentials.USERNAME,
                    DBCredentials.PASSWORD);


            String readUserReportCommand = "select FirstName, LastName, Address1, Address2, City, State, Zip, Country, Date from userinfo";

            Statement readUserReport = mysqlConnection.createStatement();

            ResultSet result = readUserReport.executeQuery(readUserReportCommand);

            ArrayList<UserReport> adminList = new ArrayList<UserReport>();
            while (result.next()) {

                UserReport temp = new UserReport (result.getString(1),result.getString(2),
                        result.getString(3),result.getString(4), result.getString(5),
                        result.getString(6), result.getInt(7), result.getString(8),
                        result.getTimestamp(9));


                adminList.add(temp);
            }
            return adminList;
        }
        catch (Exception ex){

        }
        return null;
    }


    }

