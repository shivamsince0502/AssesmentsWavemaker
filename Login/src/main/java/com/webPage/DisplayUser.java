package com.webPage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayUser extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        Connection con = ConnectDb.createConnection();
        String q = "select * from users";
        Statement stmt = null;
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // store all rows in a set by executing
        ResultSet set = null;
        try {
            set = stmt.executeQuery(q);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        out.println("<h1> Welcome to All Users page</h1>");
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"utf-8\">");  // escape the quote marks
        out.println("<title>Glassfish HTML Testing</title>");
        out.println("<style>");     // start style
        // enclose style attributes withing the <style> </style> elements
        out.println("h1 {");        // note leading brace
        out.println("color:black;");
        out.println("align-items:center;");
        out.println(" display: flex;");
        out.println("justify-content: space-around;");
        out.println("background-color:#87eba28f;");
        out.println("\n");
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");



        while (true){
            try {
                if (!set.next()) break;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            int id = 0;
            try {
                id = set.getInt(1);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            String email = null;
            try {
                email = set.getString(2);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            String name = null;
            try {
                name = set.getString(3);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            String password = null;
            try {
                password = set.getString(4);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            out.println("<h2>UserId : "+id+" UserName : "+name+" UserEmail : "+email+"</h2>");
        }
        out.println("</body>");
        out.println("</html>");

    }
}
