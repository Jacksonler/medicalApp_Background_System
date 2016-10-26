package cn.edu.bupt.springmvc.web.model;

public class Outpatient {
    private String outpatientid;

    private String outpatientname;

    private String sectionid;

    private String sectionname;

    private String doctorname;

    private String outpatientloc;

    private Integer count;

    private String telephone;

    public String getOutpatientid() {
        return outpatientid;
    }

    public void setOutpatientid(String outpatientid) {
        this.outpatientid = outpatientid == null ? null : outpatientid.trim();
    }

    public String getOutpatientname() {
        return outpatientname;
    }

    public void setOutpatientname(String outpatientname) {
        this.outpatientname = outpatientname == null ? null : outpatientname.trim();
    }

    public String getSectionid() {
        return sectionid;
    }

    public void setSectionid(String sectionid) {
        this.sectionid = sectionid == null ? null : sectionid.trim();
    }

    public String getSectionname() {
        return sectionname;
    }

    public void setSectionname(String sectionname) {
        this.sectionname = sectionname == null ? null : sectionname.trim();
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname == null ? null : doctorname.trim();
    }

    public String getOutpatientloc() {
        return outpatientloc;
    }

    public void setOutpatientloc(String outpatientloc) {
        this.outpatientloc = outpatientloc == null ? null : outpatientloc.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }
}