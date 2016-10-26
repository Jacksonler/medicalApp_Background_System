package cn.edu.bupt.springmvc.web.controller;


import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.edu.bupt.springmvc.web.model.Hospital;
import cn.edu.bupt.springmvc.web.service.HospitalService;

public class HospitalControllerTest {
	
	private HospitalService hospitalService;

	@Before
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		hospitalService = context.getBean(HospitalService.class);
	}
	
	/*@Test
	public void testFinHospitalSectionResultMap() {
		List<Hospital> hospitalList = new ArrayList<>();
		try {
			hospitalList = hospitalService.find;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(hospitalList);

	}
*/

}
