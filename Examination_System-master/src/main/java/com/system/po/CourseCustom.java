package com.system.po;

import lombok.Data;

/**
 * Course扩展类    课程
 */
@Data
public class CourseCustom extends Course {

    //所属院系名
    private String collegeName;

}
