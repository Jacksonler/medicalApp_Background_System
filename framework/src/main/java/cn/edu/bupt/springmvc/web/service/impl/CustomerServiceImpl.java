package cn.edu.bupt.springmvc.web.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.edu.bupt.springmvc.web.dao.CustomerMapper;
import cn.edu.bupt.springmvc.web.model.Customer;
import cn.edu.bupt.springmvc.web.model.CustomerExample;
import cn.edu.bupt.springmvc.web.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Resource
	private CustomerMapper customerMapper;
	private CustomerExample customerExample;

	@Override
	public Customer getCustoemrDetailsByIdCard(String idCard) throws Exception {

		customerExample.createCriteria().andIdcardEqualTo(idCard);
		List<Customer> customerList = customerMapper.selectByExample(customerExample);
		Customer customer = new Customer();
		if(customerList!=null){
			customer = customerList.get(0);
		}
		return customer;
	}

}
