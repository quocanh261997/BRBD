package com.quanh.brbd;

import com.quanh.object.User;

/**
 * Created by The on 5/13/2016.
 */
public class AccountManager {
    private static AccountManager ourInstance = new AccountManager();

    public static AccountManager getInstance() {
        return ourInstance;
    }

    User currentUser = null;
    boolean isLoggedin = false;

    private AccountManager() {
    }

    public void setLoggedin(boolean loggedin) {
        isLoggedin = loggedin;
    }

    public boolean isLoggedin() {

        return isLoggedin;
    }

    public void setCurrentUser(User currentUser) {

        this.currentUser = currentUser;
    }

    public User getCurrentUser() {

        return currentUser;
    }
}
