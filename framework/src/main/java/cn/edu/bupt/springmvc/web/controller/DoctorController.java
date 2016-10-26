package cn.edu.bupt.springmvc.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.edu.bupt.springmvc.web.service.DoctorService;
import cn.edu.bupt.springmvc.core.generic.GenericController;
import cn.edu.bupt.springmvc.web.model.Doctor;

@Controller
@RequestMapping(value = "doctorController")
public class DoctorController extends GenericController {

	@Autowired
	private DoctorService doctorService;

	/**
	 * 根据医生id查询医生的详细信息
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "getDoctorDetailByDoctorId", method = RequestMethod.GET)
	public void getDoctorDetailByDoctorId(HttpServletRequest request, HttpServletResponse response) {
		
		String doctorId = request.getParameter("doctorId");
		
		if (doctorId != null && !"".equals(doctorId)) {
			try {
				Doctor doctor = doctorService.getDoctorDetailInfo(doctorId);
				renderSuccessString(response, doctor);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				renderErrorString(response, "can't obtain doctorDetail!");
				e.printStackTrace();
			}
		} else {
			renderErrorString(response, "NullPointException！");
		}
	}

	/**
	 * 根据门诊Id查询所有的医生信息和医生所对应的放号的信息
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "getDoctorReleaseNumDetailByOutpatientId", method = RequestMethod.GET)
	public void getDoctorReleaseNumDetailByOutpatientId(HttpServletRequest request, HttpServletResponse response) {
		
		String outpatient = request.getParameter("outpatientId");
		List<Doctor> doctorList = new ArrayList<>();
		
		if (outpatient != null && !"".equals(outpatient)) {
			try {
				doctorList = doctorService.getDoctorReleaseNumByOutPatientId(outpatient);
				renderSuccessString(response, doctorList);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				renderErrorString(response, "can't obtain doctorReleaseNumDetail!");
				e.printStackTrace();
			}
		} else {
			renderErrorString(response, "NullPointException！");
		}
	}

}
