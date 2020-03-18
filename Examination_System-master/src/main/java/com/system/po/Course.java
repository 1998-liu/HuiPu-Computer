package com.system.po;

import lombok.Data;

@Data
public class Course {
    private Integer courseid;

    private String coursename;

    private Integer teacherid;

    private String coursetime;

    private String classroom;

    private Integer courseweek;

    private String coursetype;

    private Integer collegeid;

    private Integer score;

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    public void setCoursetime(String coursetime) {
        this.coursetime = coursetime == null ? null : coursetime.trim();
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom == null ? null : classroom.trim();
    }

    public void setCoursetype(String coursetype) {
        this.coursetype = coursetype == null ? null : coursetype.trim();
    }


}