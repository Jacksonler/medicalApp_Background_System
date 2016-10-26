package cn.edu.bupt.springmvc.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.edu.bupt.springmvc.core.generic.GenericController;
import cn.edu.bupt.springmvc.web.model.Hospital;
import cn.edu.bupt.springmvc.web.service.HospitalService;

@Controller
@RequestMapping("/hospitalController")
public class HospitalController extends GenericController {
	@Autowired
	private HospitalService HospitalService;

	/**
	 * 根据医院id获得医院和医院所包含的科室的信息
	 * 
	 * @param reqest
	 * @param response
	 * @param hospitalId
	 * @return
	 */
	@RequestMapping(value = "getHospitalSectionList", method = RequestMethod.GET)
	public void getHospitalAndSectonsInfoList(HttpServletRequest reqest, HttpServletResponse response) {

		String hospitalId = reqest.getParameter("hosId");
		
		if (hospitalId != null && !"".equals(hospitalId)) {
			try {
				List<Hospital> hospitalList = HospitalService.getHospitalSectionList(hospitalId);
				if (hospitalList != null) {
					renderSuccessString(response, hospitalList);
				} else {
					renderErrorString(response, "obtain info error!");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				renderErrorString(response, "obtain info error!");
				e.printStackTrace();
			}
		} else {
			renderErrorString(response, "illegalArgument!");
		}

	}

}
