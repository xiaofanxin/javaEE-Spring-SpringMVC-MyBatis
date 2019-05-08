package com.fanxin.test;

import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.fanxin.po.Customer;
import com.fanxin.utils.MybatisUtils;


public class MybatisTest {
	
	// 根据用户姓名和职业组合条件查询客户信息列表
//	@Test
//	public void findCustomerByNameAndJobs() {
//		// 生成SqlSession对象
//		SqlSession sqlSession = MybatisUtils.getSession();
//		// 创建Customer对象，封装需要组合的查询条件
//		Customer customer =  new Customer();
//		customer.setUsername("fanxin");
//		customer.setJobs("student");
//		
//		List<Customer> customers = sqlSession.selectList("com.fanxin.mapper"+".CustomerMapper.findCustomerByNameAndJobs", customer);
//		// 输出查询结果
//		for (Customer customer2 : customers) {
//			System.out.println(customer2);
//		}
//		// 关闭SqlSession
//		sqlSession.close();
//	}
	
	// 根据用户姓名或者职业查询客户列表
//	@Test
//	public void findCustomerByNameOrJobs() {
//		// 生成SqlSession对象
//		SqlSession sqlSession = MybatisUtils.getSession();
//		// 创建Customer对象，封装需要组合的查询条件
//		Customer customer =  new Customer();
//		customer.setUsername("fanxin");
//		customer.setJobs("student");
//		
//		List<Customer> customers = sqlSession.selectList("com.fanxin.mapper"+".CustomerMapper.findCustomerByNameOrJobs", customer);
//		// 输出查询结果
//		for (Customer customer2 : customers) {
//			System.out.println(customer2);
//		}
//		// 关闭SqlSession
//		sqlSession.close();
//	}
	
	// 更新用户信息
//	@Test
//	public void updateCustomerTest() {
//		// 获取SqlSession
//		SqlSession session = MybatisUtils.getSession();
//		// 创建Customer对象，并向对象中添加数据
//		Customer customer = new Customer();
//		customer.setId(8);
//		customer.setPhone("14568791348");
//		
//		int rows = session.update("com.fanxin.mapper" + ".CustomerMapper.updateCustomer", customer);
//		if (rows > 0) {
//			System.out.println("修改了"+ rows +"条数据！");
//		} else {
//			System.out.println("执行修改操作失败！");
//		}
//		// 提交事务
//		session.commit();
//		// 关闭SqlSession
//		session.close();	
//	}
	
	// 根据客户编号批量查询客户信息
//	@Test
//	public void updateCustomerTest() {
//		// 获取SqlSession
//		SqlSession session = MybatisUtils.getSession();
//		// 创建List集合封装查询ID
//		List<Integer> customer = new ArrayList<Integer>();
//		
//		customer.add(3);
//		customer.add(8);
//		// 结果集
//		List<Customer> customers = session.selectList("com.fanxin.mapper" + ".CustomerMapper.findCustomerByIds", customer);
//		
//		for (Customer customer2 : customers) {
//			System.out.println(customer2);
//		}
//		
//		// 关闭SqlSession
//		session.close();	
//	}
	
	// <bind>元素的使用，根据客户名模糊查询客户信息
	@Test
	public void findCustomerByName() {
		// 获取SqlSession
		SqlSession session = MybatisUtils.getSession();
		// 创建List集合封装查询ID
		Customer customer = new Customer();
		customer.setUsername("j");
		// 结果集
		List<Customer> customers = session.selectList("com.fanxin.mapper" + ".CustomerMapper.findCustomerByName", customer);
		
		for (Customer customer2 : customers) {
			System.out.println(customer2);
		}
		// 关闭SqlSession
		session.close();	
	}
}
