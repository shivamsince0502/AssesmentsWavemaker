package org.library;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class libraryDao {

    static Boolean addBook(Book book) {
        //will call jdbc connection methods
        Boolean flag = false;
        try {
            Connection con = DBconnection.createConnection();
            String q = "insert into Books(bookId, bookName, bookDesc) value(?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(q);
            // set the values of parameters
            pstmt.setInt(1, book.getBookId());
            pstmt.setString(2, book.getBookName());
            pstmt.setString(3, book.getBookAuthor());

            //execute
            pstmt.executeUpdate();
            flag = true;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return flag;

    }

    public static Boolean doAddBook(Book book) {
        return addBook(book);
    }

    static Boolean deleteBook(int bookId) {
        Boolean flag = false;
        try {
            Connection con = DBconnection.createConnection();
            String q = "DELETE from Books where bookId = ?";
            PreparedStatement pstmt = con.prepareStatement(q);
            // set the values of parameters
            pstmt.setInt(1, bookId);

            //execute
            pstmt.executeUpdate();
            flag = true;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    public static Boolean doDeleteBook(int bookId) {
        return  deleteBook(bookId);
    }

    static Boolean searchBook(int bookId) {
        Boolean flag = false;
        try {
            Connection con = DBconnection.createConnection();
            String q = "select * from Books where bookId = ?";
            PreparedStatement pstmt = con.prepareStatement(q);
            // set the values of parameters
            pstmt.setInt(1, bookId);

            //execute
            ResultSet set = pstmt.executeQuery();

            //print all the row records
            while (set.next()){
                int id = set.getInt(2);
                String bookName = set.getString(3);
                String bookAuthor = set.getString(4);
                System.out.println("Book Id : " + id + " Book Name : " + bookName + " Book Author : " + bookAuthor);
            }

            flag = true;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    public  static Boolean doSearchBook(int bookId) {
        return searchBook(bookId);
    }

    static Boolean showAllBooks() {
        Boolean flag = false;
        try {
            Connection con = DBconnection.createConnection();
            String q = "Select * from Books";
            Statement stmt = con.createStatement();

            // store all rows in a set by executing
            ResultSet set = stmt.executeQuery(q);

            while (set.next()){
                int id = set.getInt(2);
                String bookName = set.getString(3);
                String bookAuthor = set.getString(4);
                System.out.println("Book Id : " + id + " Book Name : " + bookName + " Book Author : " + bookAuthor);
            }


            flag = true;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    public  static Boolean doShowAllBooks() {
        return showAllBooks();
    }



}
