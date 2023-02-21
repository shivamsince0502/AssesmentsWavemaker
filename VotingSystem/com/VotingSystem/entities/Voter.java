
package com.VotingSystem.entities;
public class Voter {
    int voterId, age;
    String name, address;
    public int getVoterId() {
        return voterId;
    }

    public Voter(int id, String name, int age, String address) {
        this.voterId = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Voter{" +
                "voterId=" + voterId +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void setVoterId(int voterId) {
        this.voterId = voterId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
