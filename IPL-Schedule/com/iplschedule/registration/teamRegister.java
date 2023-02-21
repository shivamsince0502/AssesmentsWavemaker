package com.iplschedule.registration;

import java.util.*;
import com.iplschedule.systemDatabase.*;

public class teamRegister {
  public boolean registerTeams() {
    
    System.out.println("Welcome to the team registration");
    System.out.println("Every team has its team id team name and a home ground please give each info asked!");
    Scanner sc = new Scanner(System.in);
    systemDatabase.showAllGrounds();
    while(true) {
      System.out.println("Give id of team? ");
      int id = sc.nextInt();
      System.out.println("Give name of team? ");
      String name = sc.nextLine();sc.nextLine();
      System.out.println("Give Home Ground of team? ");
      
      int groundId = sc.nextInt();
      if(systemDatabase.enterTeam(id, name, groundId))
        System.out.println("Team added succesfully");
      System.out.println("If you are done with ground registering press 0.");
      int inp = sc.nextInt();
      if (inp == 0)
        break;     
    }
    return true;
  }
}