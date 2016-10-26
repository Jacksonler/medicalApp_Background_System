package cn.edu.bupt.springmvc.web.service;

import java.util.List;

import cn.edu.bupt.springmvc.web.model.Doctor;

public interface DoctorService {
	public Doctor getDoctorDetailInfo(String doctorId) throws Exception;
	public List<Doctor> getDoctorReleaseNumByOutPatientId(String outpatientId) throws Exception;

}
