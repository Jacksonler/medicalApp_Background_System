package cn.edu.bupt.springmvc.web.service;

import java.util.List;

import cn.edu.bupt.springmvc.web.model.Hospital;

public interface HospitalService {
	public List<Hospital> getHospitalSectionList(String hospitalId)throws Exception;

}
