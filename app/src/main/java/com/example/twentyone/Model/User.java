package com.example.twentyone.Model;

import android.graphics.drawable.Drawable;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {

    public Boolean inAuth;

    private Drawable imageUrl;
    private String name;
    private String nick;
    private String email;
    private int friendCount;
    private String password;

    public User()
    {}

    public User(String name, String nick, String email, String password) {
        this.name = name;
        this.nick = nick;
        this.email = email;
        this.password = password;
    }

    public Drawable getImageUrl() {
        return imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getNick() {
        return nick;
    }

    public String getEmail() {
        return email;
    }

    public int getFriendCount() {
        return friendCount;
    }

    public String getPassword(){
        return password;
    }

    public void setImageUrl(Drawable imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFriendCount(int friendCount) {
        this.friendCount = friendCount;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return friendCount == user.friendCount &&
                Objects.equals(imageUrl, user.imageUrl) &&
                Objects.equals(name, user.name) &&
                nick.equals(user.nick) &&
                Objects.equals(email, user.email) &&
                password.equals(user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageUrl, name, nick, email, friendCount, password);
    }
}
