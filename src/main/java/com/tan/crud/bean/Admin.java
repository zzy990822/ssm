package com.tan.crud.bean;

public class Admin {
    private Integer admId;

    private String admName;

    private String admPwd;

    private String admStb;

    public Integer getAdmId() {
        return admId;
    }

    public void setAdmId(Integer admId) {
        this.admId = admId;
    }

    public String getAdmName() {
        return admName;
    }

    public void setAdmName(String admName) {
        this.admName = admName == null ? null : admName.trim();
    }

    public String getAdmPwd() {
        return admPwd;
    }

    public void setAdmPwd(String admPwd) {
        this.admPwd = admPwd == null ? null : admPwd.trim();
    }

    public String getAdmStb() {
        return admStb;
    }

    public void setAdmStb(String admStb) {
        this.admStb = admStb == null ? null : admStb.trim();
    }
}