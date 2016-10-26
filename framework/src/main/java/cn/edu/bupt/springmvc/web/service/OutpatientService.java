package cn.edu.bupt.springmvc.web.service;

import cn.edu.bupt.springmvc.web.model.Outpatient;

public interface OutpatientService {
	
	public Outpatient getOutpatientDetailsById(String outpatientId) throws Exception;

}
