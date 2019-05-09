package com.fanxin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fanxin.mapper.CustomerMapper;
import com.fanxin.po.Customer;
import com.fanxin.service.CustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	// 注解注入CustomerMapper
	@Autowired
	private CustomerMapper cutomerMapper;
	
	@Override
	public void addCustomer(Customer customer) {
		this.cutomerMapper.addCustomer(customer);
		int i=1/0;
	}
	
}
