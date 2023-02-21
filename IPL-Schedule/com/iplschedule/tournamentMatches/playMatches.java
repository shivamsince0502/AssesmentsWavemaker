package com.iplschedule.tournamentMatches;

import java.util.*;
import com.iplschedule.scheduleMatches.*;
import com.iplschedule.systemDatabase.*;
import com.iplschedule.entities.*;
import java.text.SimpleDateFormat;  
import java.util.Date;         
import java.util.Calendar;
import com.iplschedule.dateExtend.DateExtend;

public class playMatches {

   Boolean displayMatch(Calendar date, int teamIdA, int teamIdB, Boolean flag) {
    cricketTeam A = systemDatabase.getTeam(teamIdA);
    cricketTeam B = systemDatabase.getTeam(teamIdB);
    cricketGround gA = systemDatabase.getGround(A.getGround());
    cricketGround gB = systemDatabase.getGround(B.getGround());
    String ground = flag ? gA.getGround() : gB.getGround();
    String teamNameA = A.getName();
    String teamNameB = B.getName();

    System.out.println(A.getId() + " " +  teamNameA +  " V/S " + B.getId() + " " + teamNameB + " on "
         + date.getTime() + " at " + ground);
    flag = !flag;
    return true;
  }

  public Boolean startMatches(Calendar startDate) {
    Boolean flag = true;
    DateExtend dateExtend = new DateExtend();
    Calendar currDate = dateExtend.addDays(startDate, 0);
    ArrayList<Integer> teamsid = systemDatabase.giveArr();
    Integer rounds = teamsid.size();
    if(rounds % 2 == 0) rounds--;
    else scheduleMatches.setUpOdd();
    for(int i = 0; i < teamsid.size(); i++) {
      System.out.println(systemDatabase.getTeam(teamsid.get(i)));
    }
    Integer t = 2;
    while(t > 0) {
      for(int i = 0; i < rounds; i++) {
        int len = teamsid.size();
        int start = 0, end = len-1;
        
        while(start < end) {
          int teamA = teamsid.get(start), teamB = teamsid.get(end);
          if(teamA == -1) {
            end--;
            start++;
            continue;
          }
          if(currDate.get(Calendar.DAY_OF_WEEK) == 1 || currDate.get(Calendar.DAY_OF_WEEK) == 7) {
            end--;
            start++;
            displayMatch(currDate, teamA, teamB, flag); 
            teamA = teamsid.get(start);
            teamB = teamsid.get(end);
            displayMatch(currDate, teamA, teamB, flag);
          }else {
            displayMatch(currDate, teamA, teamB, flag);
          }
          currDate = dateExtend.addDays(currDate, 1);
          end--;
          start++;
        }
          scheduleMatches.rotate();
      }
      t--;
    }


    return true;

    
  }
  
}
