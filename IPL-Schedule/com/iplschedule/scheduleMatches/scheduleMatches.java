package com.iplschedule.scheduleMatches;

import java.util.*;
import com.iplschedule.*;
import com.iplschedule.systemDatabase.systemDatabase;

public class scheduleMatches {

  public static ArrayList<Integer> teamsid = systemDatabase.giveArr();

  public static void setUpOdd() {
    int len = teamsid.size();
    teamsid.add(-1);
    for (Integer i = len; i >= 1; i--) {
      Integer curr = teamsid.get(i - 1);
      teamsid.set(i, curr);
    }
    teamsid.set(0, -1);

  }

  public static void rotate() {
    Integer len = teamsid.size();
      Integer fix = teamsid.get(0);
      Integer lastId = teamsid.get(len - 1);
      for (Integer i = len - 1; i > 1; i--) {
        Integer curr = teamsid.get(i - 1);
        teamsid.set(i, curr);
      }
      teamsid.set(1, lastId);

  }



}
