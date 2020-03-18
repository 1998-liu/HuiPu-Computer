package com.system.po;

import lombok.Data;

@Data
public class SelectedCourseCustom extends Selectedcourse {
    //新增Student 对象字段
    private StudentCustom studentCustom;

    //扩展课程信息对象
    private CourseCustom courseCustom;

    //判断该学生是否已经完成该课程
    private Boolean over = false;

}
