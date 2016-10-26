package cn.edu.bupt.springmvc.web.model;

import java.util.Date;

public class ReleaseNum {
    private String realseid;

    private String doctorid;

    private Date date;

    private String remark;

    private Byte issuccess;

    private Integer isfamilynum;

    public String getRealseid() {
        return realseid;
    }

    public void setRealseid(String realseid) {
        this.realseid = realseid == null ? null : realseid.trim();
    }

    public String getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(String doctorid) {
        this.doctorid = doctorid == null ? null : doctorid.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Byte getIssuccess() {
        return issuccess;
    }

    public void setIssuccess(Byte issuccess) {
        this.issuccess = issuccess;
    }

    public Integer getIsfamilynum() {
        return isfamilynum;
    }

    public void setIsfamilynum(Integer isfamilynum) {
        this.isfamilynum = isfamilynum;
    }
}