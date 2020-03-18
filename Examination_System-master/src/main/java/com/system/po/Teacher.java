package com.system.po;

import lombok.Data;

import java.util.Date;

@Data
public class Teacher {
    private Integer userid;

    private String username;

    private String sex;

    private Date birthyear;

    private String degree;

    private String title;

    private Date grade;

    private Integer collegeid;

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
}