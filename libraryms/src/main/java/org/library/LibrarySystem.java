package org.library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.library.*;

public class LibrarySystem {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello Welcome to library management system");
        System.out.println("Following are the operations options you have.");
        System.out.println("Press 1 : for Adding a Book");
        System.out.println("Press 2 : for Deleting a Book");
        System.out.println("Press 3 : for Searching a Book");
        System.out.println("Press 4 : for All Books list");
        System.out.println("Press 0 : to exit");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            System.out.println("Choose one option 1, 2, 3, 4 or 0 to end.");
            int inp = 9;
            try {
                inp = Integer.parseInt(br.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if(inp == 0) break;
            else if(inp == 1) {
                // insertion
                System.out.println("Give book's id.");
                int bookId;
                try {
                    bookId = Integer.parseInt(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Give book's name.");
                String name = br.readLine();
                System.out.println("Give book's author's name.");
                String aName = br.readLine();
                Book book = new Book(bookId, name, aName);
                if(libraryDao.doAddBook(book)){
                    System.out.println(book);
                    System.out.println("Book added succesfully...");
                }else {
                    System.out.println("Again Add book");
                }

            }else if(inp == 2) {
                //deletion
                int bookId;
                System.out.println("Give the book id you want to delete.");
                try {
                    bookId = Integer.parseInt(br.readLine());
                    if(libraryDao.doDeleteBook(bookId)){
                        System.out.println("Book deleted Sucessfully");
                    }else {
                        System.out.println("NOt deleted.");
                    }

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }else if(inp == 3) {
                // searching
                System.out.println("Give the book id you wanted to search.");
                int bookId = Integer.parseInt(br.readLine());
                if(libraryDao.doSearchBook(bookId)){
                    System.out.println("Showed the Book you searched for. ");
                }else{
                    System.out.println("Try again.");
                }
            }else if(inp == 4) {
                // all book list
                System.out.println("Showing all the Books in the table.");
                if(libraryDao.doShowAllBooks()) {
                    System.out.println("Showed all the books.");
                }else {
                    System.out.println("Try again.");
                }

            }else{
                System.out.println("Wrong option choose any below:");
                System.out.println("Press 1 : for Adding a Book");
                System.out.println("Press 2 : for Deleting a Book");
                System.out.println("Press 3 : for Searching a Book");
                System.out.println("Press 4 : for All Books list");
                System.out.println("Press 0 : to exit");
                continue;
            }

        }

    }

}
