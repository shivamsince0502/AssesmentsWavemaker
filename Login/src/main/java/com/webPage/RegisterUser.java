package com.webPage;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class RegisterUser extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        PrintWriter out = resp.getWriter();
        out.println("<h2>"+name+"</h2>");
        out.println("<h2>"+email+"</h2>");
        out.println("<h2>"+password+"</h2>");







        try {
            Connection connection = ConnectDb.createConnection();
            out.println("error below connection setup.");
            String sql = "INSERT INTO users (name, email, password) VALUE (?, ?, ?)";
            PreparedStatement pstmt= connection.prepareStatement(sql);
            out.println("error below prepared setup.");
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, password);
            int i = pstmt.executeUpdate();
            out.println("error below executeupdate.");
            if(i > 0){
                out.println("User registered.");
            }

        } catch (Exception e) {
            out.println("Error occured");
            e.printStackTrace();
        }


    }
}
