package com.fanxin.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fanxin.po.Customer;
import com.fanxin.service.CustomerService;

public class TransactionTest {
	public static void main(String[] args) {
		ApplicationContext aContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customerService = aContext.getBean(CustomerService.class);
		Customer customer = new Customer();
		customer.setUsername("zhangsan");
		customer.setJobs("manager");
		customer.setPhone("13233334444");
		customerService.addCustomer(customer);

	}
}
