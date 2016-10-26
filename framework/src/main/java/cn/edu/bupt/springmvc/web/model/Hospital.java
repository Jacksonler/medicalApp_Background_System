package cn.edu.bupt.springmvc.web.model;

import java.util.Date;
import java.util.List;

public class Hospital {
    private String hosid;

    private String hosname;

    private String hosgrade;

    private String hosaddr;

    private String hostel;

    private String hosintro;

    private String hosurl;

    private String dean;

    private String deanintro;

    private String hostraffic;

    private String hosspecial;

    private Date hosestablished;

    private List<Section> sectionList;
    

	public List<Section> getSectionList() {
		return sectionList;
	}

	public void setSectionList(List<Section> sectionList) {
		this.sectionList = sectionList;
	}

	public String getHosid() {
        return hosid;
    }

    public void setHosid(String hosid) {
        this.hosid = hosid == null ? null : hosid.trim();
    }

    public String getHosname() {
        return hosname;
    }

    public void setHosname(String hosname) {
        this.hosname = hosname == null ? null : hosname.trim();
    }

    public String getHosgrade() {
        return hosgrade;
    }

    public void setHosgrade(String hosgrade) {
        this.hosgrade = hosgrade == null ? null : hosgrade.trim();
    }

    public String getHosaddr() {
        return hosaddr;
    }

    public void setHosaddr(String hosaddr) {
        this.hosaddr = hosaddr == null ? null : hosaddr.trim();
    }

    public String getHostel() {
        return hostel;
    }

    public void setHostel(String hostel) {
        this.hostel = hostel == null ? null : hostel.trim();
    }

    public String getHosintro() {
        return hosintro;
    }

    public void setHosintro(String hosintro) {
        this.hosintro = hosintro == null ? null : hosintro.trim();
    }

    public String getHosurl() {
        return hosurl;
    }

    public void setHosurl(String hosurl) {
        this.hosurl = hosurl == null ? null : hosurl.trim();
    }

    public String getDean() {
        return dean;
    }

    public void setDean(String dean) {
        this.dean = dean == null ? null : dean.trim();
    }

    public String getDeanintro() {
        return deanintro;
    }

    public void setDeanintro(String deanintro) {
        this.deanintro = deanintro == null ? null : deanintro.trim();
    }

    public String getHostraffic() {
        return hostraffic;
    }

    public void setHostraffic(String hostraffic) {
        this.hostraffic = hostraffic == null ? null : hostraffic.trim();
    }

    public String getHosspecial() {
        return hosspecial;
    }

    public void setHosspecial(String hosspecial) {
        this.hosspecial = hosspecial == null ? null : hosspecial.trim();
    }

    public Date getHosestablished() {
        return hosestablished;
    }

    public void setHosestablished(Date hosestablished) {
        this.hosestablished = hosestablished;
    }

	@Override
	public String toString() {
		return "Hospital [hosid=" + hosid + ", hosname=" + hosname + ", hosgrade=" + hosgrade + ", hosaddr=" + hosaddr
				+ ", hostel=" + hostel + ", hosintro=" + hosintro + ", hosurl=" + hosurl + ", dean=" + dean
				+ ", deanintro=" + deanintro + ", hostraffic=" + hostraffic + ", hosspecial=" + hosspecial
				+ ", hosestablished=" + hosestablished + ", sectionList=" + sectionList + "]";
	}
    
    
}