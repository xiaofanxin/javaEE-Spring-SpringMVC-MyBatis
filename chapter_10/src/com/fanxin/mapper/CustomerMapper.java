package com.fanxin.mapper;

import com.fanxin.po.Customer;

public interface CustomerMapper {
	public Customer findCustomerById(Integer id);
	public void addCustomer(Customer customer);
	
	
}
