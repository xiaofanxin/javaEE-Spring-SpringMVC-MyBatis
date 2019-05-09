package com.fanxin.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.fanxin.dao.CustomerDao;
import com.fanxin.po.Customer;

public class CustomerDaoImpl extends SqlSessionDaoSupport implements CustomerDao {

	@Override
	public Customer findCustomerById(Integer id) {
		return this.getSqlSession().selectOne("com.fanxin.po" + ".CustomerMapper.findCustomerById", id);
	}



}
