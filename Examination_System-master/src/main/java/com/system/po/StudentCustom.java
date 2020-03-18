package com.system.po;

import lombok.Data;

import java.util.List;

/**
 * Student的扩展类
 */

@Data
public class StudentCustom extends Student {
    //所属院系名
    private String collegeName;

    //选课列表
    private List<SelectedCourseCustom> selectedCourseList;

}
