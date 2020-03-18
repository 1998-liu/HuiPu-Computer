package com.system.po;

import lombok.Data;

/**
 * teacher扩展类
 */
@Data
public class TeacherCustom extends Teacher {
    //所属院系名
    private String collegeName;

}
