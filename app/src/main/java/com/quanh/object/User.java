/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.quanh.object;

import java.util.Date;

/**
 *
 * @author The
 */
public class User {
    String userID;
    String password;
    String name;
    String avatar;
    String email;
    String about;

    public User() {
    }

    public User(String userID, String password, String name, String avatar, String email, String about) {
        this.userID = userID;
        this.password = password;
        this.name = name;
        this.avatar = avatar;
        this.email = email;
        this.about = about;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getUserID() {
        return userID;
    }

    public String getEmail() {
        return email;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getAbout() {
        return about;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setAbout(String about) {
        this.about = about;
    }
    
    
}
