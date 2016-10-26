package cn.edu.bupt.springmvc.web.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.edu.bupt.springmvc.web.dao.OutpatientMapper;
import cn.edu.bupt.springmvc.web.model.Outpatient;
import cn.edu.bupt.springmvc.web.model.OutpatientExample;
import cn.edu.bupt.springmvc.web.service.OutpatientService;

@Service
public class OutpatientServiceImpl implements OutpatientService{

	@Resource
	private OutpatientMapper outpatientMapper;
	
	@Override
	public Outpatient getOutpatientDetailsById(String outpatientId) throws Exception {
		// TODO Auto-generated method stub
		return outpatientMapper.selectByPrimaryKey(outpatientId);
	}

}
