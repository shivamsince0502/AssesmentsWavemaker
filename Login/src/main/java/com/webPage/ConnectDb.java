package com.webPage;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDb {
    static Connection con;
    static Connection createConnection() {
        try {
            // load driver;
            Class.forName("com.mysql.cj.jdbc.Driver");

            //create connection..
            String user = "root";
            String password = "shivam123";
            String url = "jdbc:mysql://localhost:3306/usersimple";
            con = DriverManager.getConnection(url, user, password);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return  con;
    }
}
