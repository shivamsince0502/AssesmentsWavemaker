package com.iplschedule.entities;
import com.iplschedule.systemDatabase.*;

public class cricketTeam {

  int teamId;
  String teamName;
  int teamGroundId;


  @Override
  public String toString() {
    return "teamId : " + this.teamId + "teamName : " + this.teamName +  " teamGround : " + systemDatabase.getGround(this.teamGroundId);
  }

  public cricketTeam(int id, String name, int ground) {
    this.teamId = id;
    this.teamName = name;
    this.teamGroundId = ground;
  }

  public int getId() {
    return this.teamId;
  }
  public String getName() {
    return this.teamName;
  }

  public int getGround() {
    return this.teamGroundId;
  }

}
