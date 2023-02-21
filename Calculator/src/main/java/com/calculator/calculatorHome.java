package com.calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class calculatorHome extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        Double inp1 = Double.parseDouble(req.getParameter("input1"));
        Double inp2 = Double.parseDouble(req.getParameter("input2"));
        String op = req.getParameter("calc");
        Double res = 0.0;
        if(op.equals("+")){
            res = inp1 + inp2;
        }else if(op.equals("-")) {
            res = inp1 - inp2;
        }else if(op.equals("*")) {
            res = inp1 * inp2;
        }else res = inp1/inp2;

        PrintWriter out = resp.getWriter();
        out.println("<h1> Welcome to Calculator</h1>");
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"utf-8\">");  // escape the quote marks
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>The result is : "+ res +"</h2>");
        out.println("</body>");
        out.println("</html>");

    }
}
