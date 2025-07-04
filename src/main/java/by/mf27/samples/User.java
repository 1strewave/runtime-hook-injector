package by.mf27.samples;

import lombok.Getter;

public class User {
    @Getter
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean isAdmin() {
        return false;
    }

}
