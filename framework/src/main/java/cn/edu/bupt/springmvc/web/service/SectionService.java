package cn.edu.bupt.springmvc.web.service;

import java.util.List;

import cn.edu.bupt.springmvc.web.model.Doctor;

public interface SectionService {
	public List<Doctor> getSectionDoctorList(String sectionId)throws Exception;

}
