package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

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

                String addUsersCommand = "INSERT INTO userdata " +
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


    }

