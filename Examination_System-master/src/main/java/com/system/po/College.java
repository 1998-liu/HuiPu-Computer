package com.system.po;

import lombok.Data;

@Data
public class College {
    private Integer collegeid;

    private String collegename;

    public void setCollegename(String collegename) {
        this.collegename = collegename == null ? null : collegename.trim();
    }
}