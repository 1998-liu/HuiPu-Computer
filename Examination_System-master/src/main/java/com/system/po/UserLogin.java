package com.system.po;

import lombok.Data;

@Data
public class UserLogin {
    private Integer userid;

    private String username;

    private String password;

    private Integer role;

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }


}