package com.webPage;

public class user {
    int name;
    int userUniqueId;
    String userName;
    String userPassword;

    @Override
    public String toString() {
        return "user{" +
                "name=" + name +
                ", userUniqueId=" + userUniqueId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }

    public user(int name, int userUniqueId, String userName, String userPassword) {
        this.name = name;
        this.userUniqueId = userUniqueId;
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getUserUniqueId() {
        return userUniqueId;
    }

    public void setUserUniqueId(int userUniqueId) {
        this.userUniqueId = userUniqueId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
