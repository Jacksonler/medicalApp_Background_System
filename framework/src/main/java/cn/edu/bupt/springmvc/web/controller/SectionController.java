package cn.edu.bupt.springmvc.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.edu.bupt.springmvc.web.service.SectionService;
import cn.edu.bupt.springmvc.core.generic.GenericController;
import cn.edu.bupt.springmvc.web.model.Doctor;

@Controller
@RequestMapping(value = "SectionController")
public class SectionController extends GenericController {

	@Autowired
	private SectionService sectionService;

	/**
	 * 根据科室主键得到科室下的所有的医生
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "getSeciontDoctorListBySectionId", method = RequestMethod.GET)
	public void getSeciontDoctorListBySectionId(HttpServletRequest request, HttpServletResponse response) {
		
		List<Doctor> doctorList = new ArrayList<>();
		String sectionId = request.getParameter("sectionId");
		
		if (sectionId != null && !"".equals(sectionId)) {
			try {
				doctorList = sectionService.getSectionDoctorList(sectionId);
				renderSuccessString(response, doctorList);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				renderErrorString(response, "can't obtain doctorList!");
				e.printStackTrace();
			}
		} else {
			renderErrorString(response, "NullPointException！");
		}

	}

}
