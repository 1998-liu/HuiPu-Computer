package com.system.po;

import lombok.Data;

@Data
public class Role {
    private Integer roleid;

    private String rolename;

    private String permissions;

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions == null ? null : permissions.trim();
    }
}