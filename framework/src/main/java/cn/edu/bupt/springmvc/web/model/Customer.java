package cn.edu.bupt.springmvc.web.model;

public class Customer {
    private String customerid;

    private String pichead;

    private String customername;

    private Integer age;

    private String nickname;

    private Integer sex;

    private String idcard;

    private String phone;

    private String customeradrr;

    private String password;

    private String remarks;

    private Byte ismarried;

    private String job;

    private String nation;

    private String birthplace;

    private String residence;

    private String workplace;

    private String putpatientid;

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    public String getPichead() {
        return pichead;
    }

    public void setPichead(String pichead) {
        this.pichead = pichead == null ? null : pichead.trim();
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getCustomeradrr() {
        return customeradrr;
    }

    public void setCustomeradrr(String customeradrr) {
        this.customeradrr = customeradrr == null ? null : customeradrr.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Byte getIsmarried() {
        return ismarried;
    }

    public void setIsmarried(Byte ismarried) {
        this.ismarried = ismarried;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace == null ? null : birthplace.trim();
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence == null ? null : residence.trim();
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace == null ? null : workplace.trim();
    }

    public String getPutpatientid() {
        return putpatientid;
    }

    public void setPutpatientid(String putpatientid) {
        this.putpatientid = putpatientid == null ? null : putpatientid.trim();
    }
}