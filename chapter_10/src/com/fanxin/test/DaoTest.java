package com.fanxin.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.fanxin.dao.CustomerDao;
import com.fanxin.mapper.CustomerMapper;
import com.fanxin.po.Customer;

public class DaoTest {
	// 传统DAO层方式的开发整合
//	@Test
//	public void findCustomerByIdTest() {
//		ApplicationContext aContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		CustomerDao customerDao = (CustomerDao) aContext.getBean("customerDao");
//		Customer customer = customerDao.findCustomerById(1);
//		System.out.println(customer);
//	}
	
	// 基于MapperFactoryBean的整合
	@Test
	public void findCustomerByIdTest() {
		ApplicationContext aContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerMapper customerMapper = aContext.getBean(CustomerMapper.class);
		Customer customer = customerMapper.findCustomerById(1);
		System.out.println(customer);
	}
}
