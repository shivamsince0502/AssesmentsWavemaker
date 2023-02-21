package com.iplschedule.registration;

import java.util.Scanner;

import com.iplschedule.systemDatabase.systemDatabase;

public class groundRegistration {



  public boolean registerGround() {
    System.out.println("Give the ground details you want to register. !");
    System.out.println("Ground Id and Ground Name is required"); 
    Scanner sc = new Scanner(System.in);
    while(true) {
      System.out.println("Ground Id.!");
      int id = sc.nextInt();sc.nextLine();
      System.out.println("Ground Name.!");
      String name = sc.nextLine();
      if(systemDatabase.addGround(id, name))
        System.out.println("Ground Added succesfully");
      
      System.out.println("If you are done with ground registering press 0.");
      int inp = sc.nextInt();
      if(inp == 0) break;
    }
    return true;
  }
  
}
