package com.system.po;

import lombok.Data;

import java.util.Date;

@Data
public class Student {
    private Integer userid;

    private String username;

    private String sex;

    private Date birthyear;

    private Date grade;

    private Integer collegeid;

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }
}