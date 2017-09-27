package service;

import java.util.Objects;

public class User {
    
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEmpty(){
        return username==null || password==null || username.isEmpty() || password.isEmpty();
    }
    
    @Override
    public String toString() {
        return username + "," + password;
    }

    @Override
    public boolean equals(Object o) {
        return o.toString().equals(toString());
    }
    
}
