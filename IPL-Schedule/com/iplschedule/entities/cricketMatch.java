package com.iplschedule.entities;

public class cricketMatch {
  String date;
  int teamAId;
  String teamAName;
  int teamBId;
  String teamBName;
  int winId;
  String winTeamName;
  @Override
  public String toString() {
    return  teamAName + " V/S " + teamBName + " On " + date + " winning team : " + winTeamName;
  }
  
  public cricketMatch(int tAId, String tAN, int tBId, String tBN, String date, int winId, String winTN) {
    this.date = date;
    this. teamAId = tAId;
    this.teamAName = tAN;
    this.teamBId = tBId;
    this.teamBName = tBN;
    this.winId = winId;
    this.winTeamName = winTN;
  }

}
