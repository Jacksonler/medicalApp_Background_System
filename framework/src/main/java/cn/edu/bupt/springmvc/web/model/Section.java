package cn.edu.bupt.springmvc.web.model;

public class Section {
    private String sectionid;

    private String hosid;

    private String sectioncode;

    private String sectionname;

    private String sectionintro;

    private String sectionpic;

    private String sectionloc;

    public String getSectionid() {
        return sectionid;
    }

    public void setSectionid(String sectionid) {
        this.sectionid = sectionid == null ? null : sectionid.trim();
    }

    public String getHosid() {
        return hosid;
    }

    public void setHosid(String hosid) {
        this.hosid = hosid == null ? null : hosid.trim();
    }

    public String getSectioncode() {
        return sectioncode;
    }

    public void setSectioncode(String sectioncode) {
        this.sectioncode = sectioncode == null ? null : sectioncode.trim();
    }

    public String getSectionname() {
        return sectionname;
    }

    public void setSectionname(String sectionname) {
        this.sectionname = sectionname == null ? null : sectionname.trim();
    }

    public String getSectionintro() {
        return sectionintro;
    }

    public void setSectionintro(String sectionintro) {
        this.sectionintro = sectionintro == null ? null : sectionintro.trim();
    }

    public String getSectionpic() {
        return sectionpic;
    }

    public void setSectionpic(String sectionpic) {
        this.sectionpic = sectionpic == null ? null : sectionpic.trim();
    }

    public String getSectionloc() {
        return sectionloc;
    }

    public void setSectionloc(String sectionloc) {
        this.sectionloc = sectionloc == null ? null : sectionloc.trim();
    }

	@Override
	public String toString() {
		return "Section [sectionid=" + sectionid + ", hosid=" + hosid + ", sectioncode=" + sectioncode
				+ ", sectionname=" + sectionname + ", sectionintro=" + sectionintro + ", sectionpic=" + sectionpic
				+ ", sectionloc=" + sectionloc + "]";
	}
    
    
}