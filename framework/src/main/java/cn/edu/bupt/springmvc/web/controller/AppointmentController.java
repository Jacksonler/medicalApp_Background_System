package cn.edu.bupt.springmvc.web.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.edu.bupt.springmvc.web.model.Appointment;
import cn.edu.bupt.springmvc.web.model.Customer;
import cn.edu.bupt.springmvc.web.model.Doctor;
import cn.edu.bupt.springmvc.web.model.Outpatient;
import cn.edu.bupt.springmvc.web.service.CustomerService;
import cn.edu.bupt.springmvc.web.service.DoctorService;
import cn.edu.bupt.springmvc.web.service.OutpatientService;

@Controller
@RequestMapping(value="appointmentController")
public class AppointmentController {
	
	@Autowired
	private DoctorService doctorService;
	private CustomerService  customerService;
	private OutpatientService outpatientService;
	
	/**
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(value="getAppointmentDetails", method = RequestMethod.GET)
	public void getAppointmentDetails(HttpServletRequest request, HttpServletResponse response){
		
		
		
		
		String idCard = request.getParameter("idCard");
		String doctorId = request.getParameter("doctorId");
		
		Appointment appointment = new Appointment();
		
		try {
			
			Customer customer = customerService.getCustoemrDetailsByIdCard(idCard);
			Doctor doctor= doctorService.getDoctorDetailInfo(doctorId);
			Outpatient outpatient = outpatientService.getOutpatientDetailsById(doctor.getOutpatientid());
			String uuid = UUID.randomUUID().toString();
			appointment.setId(uuid);
			appointment.setDoctorid(doctorId);
			appointment.setCustomerid(customer.getCustomerid());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
