package com.iplschedule.entities;

public class cricketGround {
  int id;
  String name;

  @Override
  public String toString() {
    return "Ground id " + this.id + " Ground Name " + this.name;
  }

  public cricketGround(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public String getGround(){
    return this.name;
  }

  public int getId() {
    return this.id;
  }
  
}
