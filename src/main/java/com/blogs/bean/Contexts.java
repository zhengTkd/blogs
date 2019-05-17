package com.blogs.bean;

import java.util.Date;

public class Contexts {
    private Integer contextsId;

    private String contextsTitle;

    private Integer userId;

    private Integer contextsClassId;

    private Date contextsupdate;

    private String contextsmain;

    public Integer getContextsId() {
        return contextsId;
    }

    public void setContextsId(Integer contextsId) {
        this.contextsId = contextsId;
    }

    public String getContextsTitle() {
        return contextsTitle;
    }

    public void setContextsTitle(String contextsTitle) {
        this.contextsTitle = contextsTitle == null ? null : contextsTitle.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getContextsClassId() {
        return contextsClassId;
    }

    public void setContextsClassId(Integer contextsClassId) {
        this.contextsClassId = contextsClassId;
    }

    public Date getContextsupdate() {
        return contextsupdate;
    }

    public void setContextsupdate(Date contextsupdate) {
        this.contextsupdate = contextsupdate;
    }

    public String getContextsmain() {
        return contextsmain;
    }

    public void setContextsmain(String contextsmain) {
        this.contextsmain = contextsmain == null ? null : contextsmain.trim();
    }
}