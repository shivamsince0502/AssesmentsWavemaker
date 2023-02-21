package org.library;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
    static Connection con;
    static Connection createConnection() {
        try {
            // load driver;
            Class.forName("com.mysql.jdbc.Driver");

            //create connection..
            String user = "root";
            String password = "shivam123";
            String url = "jdbc:mysql://localhost:3306/library";
            con = DriverManager.getConnection(url, user, password);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return  con;
    }
}
