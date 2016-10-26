package cn.edu.bupt.springmvc.web.service;

import cn.edu.bupt.springmvc.web.model.Customer;

public interface CustomerService {

	public Customer getCustoemrDetailsByIdCard(String idCard) throws Exception;
}
