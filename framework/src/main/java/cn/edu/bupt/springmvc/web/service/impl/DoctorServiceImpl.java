package cn.edu.bupt.springmvc.web.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.edu.bupt.springmvc.web.dao.DoctorMapper;
import cn.edu.bupt.springmvc.web.model.Doctor;
import cn.edu.bupt.springmvc.web.service.DoctorService;
@Service
public class DoctorServiceImpl implements DoctorService{

	@Resource
	private DoctorMapper doctorMapper;
	@Override
	public Doctor getDoctorDetailInfo(String doctorId) throws Exception {
		// TODO Auto-generated method stub
		return doctorMapper.selectByPrimaryKey(doctorId);
	}
	
	
	public List<Doctor> getDoctorReleaseNumByOutPatientId(String outpatientId) throws Exception {
		// TODO Auto-generated method stub
		return doctorMapper.selectDoctorReleaseNumInfoByOutPatientId(outpatientId);
	}

}
