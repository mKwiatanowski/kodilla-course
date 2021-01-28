package com.kodilla.good.patterns.allegro;

public class User {

    private String nick;
    private String userName;
    private String userSurname;

    public User(String nickName, String userName, String userSurname) {
        this.nick = nickName;
        this.userName = userName;
        this.userSurname = userSurname;
    }

    public String getNickName() {
        return nick;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }
}
