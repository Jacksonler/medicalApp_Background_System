package cn.edu.bupt.springmvc.web.model;

import java.util.Date;

public class Appointment {
    private String id;

    private String doctorid;

    private String customerid;

    private String realseid;

    private String idcard;

    private Byte type;

    private String sectionname;

    private String outpatientname;

    private Date appointdate;

    private Double cost;

    private String telephone;

    private String customername;

    private String doctorname;

    private String sectionarea;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(String doctorid) {
        this.doctorid = doctorid == null ? null : doctorid.trim();
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    public String getRealseid() {
        return realseid;
    }

    public void setRealseid(String realseid) {
        this.realseid = realseid == null ? null : realseid.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getSectionname() {
        return sectionname;
    }

    public void setSectionname(String sectionname) {
        this.sectionname = sectionname == null ? null : sectionname.trim();
    }

    public String getOutpatientname() {
        return outpatientname;
    }

    public void setOutpatientname(String outpatientname) {
        this.outpatientname = outpatientname == null ? null : outpatientname.trim();
    }

    public Date getAppointdate() {
        return appointdate;
    }

    public void setAppointdate(Date appointdate) {
        this.appointdate = appointdate;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname == null ? null : doctorname.trim();
    }

    public String getSectionarea() {
        return sectionarea;
    }

    public void setSectionarea(String sectionarea) {
        this.sectionarea = sectionarea == null ? null : sectionarea.trim();
    }
}