package com.VotingSystem.entities;

public class Nominee {
    int id, age;
    String name, address, symbol, party;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    @Override
    public String toString() {
        return "Nominee{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", symbol='" + symbol + '\'' +
                ", party='" + party + '\'' +
                '}';
    }

    public Nominee(int id, String name, int age, String address, String symbol, String party) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.symbol = symbol;
        this.party = party;
    }

}
