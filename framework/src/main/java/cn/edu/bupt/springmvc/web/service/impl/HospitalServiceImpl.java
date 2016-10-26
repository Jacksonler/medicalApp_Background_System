package cn.edu.bupt.springmvc.web.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.edu.bupt.springmvc.web.dao.HospitalMapper;
import cn.edu.bupt.springmvc.web.model.Hospital;
import cn.edu.bupt.springmvc.web.service.HospitalService;

@Service
public class HospitalServiceImpl implements HospitalService{
	
	@Resource
	private HospitalMapper hospitalMapper;
	
	@Override
	public List<Hospital> getHospitalSectionList(String hospitalId) throws Exception {
		// TODO Auto-generated method stub
		return hospitalMapper.finHospitalSectionResultMap(hospitalId);
	}

}
