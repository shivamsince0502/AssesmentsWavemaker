package com.iplschedule.systemDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import com.iplschedule.entities.*;


public class systemDatabase {
  static HashMap<Integer, cricketTeam> teamsMap = new HashMap<>();
  static HashMap<Integer, cricketMatch> matchesMap = new HashMap<>();
  static HashMap<Integer, cricketGround> groundsMaps = new HashMap<>();
  static ArrayList<Integer> teams = new ArrayList<>();

  public static Boolean enterTeam(int id, String name, int homeGround) {
    if(groundsMaps.containsKey(homeGround) == false) return false;
    if(teamsMap.containsKey(id)) return false;
    teams.add(id);
    cricketTeam newTeam = new cricketTeam(id, name, homeGround);
    teamsMap.put(id, newTeam);
    return true;
  }



  public static Boolean addGround(int id, String name) {

    if(groundsMaps.containsKey(id)) return false;
    cricketGround newGround = new cricketGround(id, name);
    groundsMaps.put(id, newGround);
    return true;
  }
 
  public static ArrayList<Integer> giveArr() {
    return teams;
  }

  public static cricketTeam getTeam(int id) {
    return teamsMap.get(id);
  }

  public static cricketMatch getMatch(int id) {
    return matchesMap.get(id);
  }

  public static cricketGround getGround(int id) {
    return groundsMaps.get(id);
  }

  public static void showAllGrounds() {
    for (Entry<Integer, cricketGround> entry : groundsMaps.entrySet()) 
            System.out.println("Ground: " + entry.getValue());
  }

}
