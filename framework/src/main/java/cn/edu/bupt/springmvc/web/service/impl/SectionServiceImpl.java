package cn.edu.bupt.springmvc.web.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.edu.bupt.springmvc.web.dao.SectionMapper;
import cn.edu.bupt.springmvc.web.model.Doctor;
import cn.edu.bupt.springmvc.web.model.Section;
import cn.edu.bupt.springmvc.web.service.SectionService;

@Service
public class SectionServiceImpl implements SectionService{

	@Resource 
	private SectionMapper sectionMapper;
	
	@Override
	public List<Doctor> getSectionDoctorList(String sectionId) throws Exception {
		// TODO Auto-generated method stub
		 return sectionMapper.selectSectionDoctorsBySectionId(sectionId);
	
	}

}
