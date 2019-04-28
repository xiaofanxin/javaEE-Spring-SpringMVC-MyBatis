package com.fanxin.test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import com.fanxin.po.Customer;

public class MybatisTest {
//	// 根据用户id查询用户信息
//	@Test
//	public void findCustomerById() throws Exception {
//		// 1.先读取配置文件
//		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//		// 2.构建会话工厂（SqlSessionFactory）
//		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//		// 3. 通过SqlSessionFactory创建SqlSession
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		// 4. 执行映射文件中定义的SQL,并返回映射结果
//		Customer customer = sqlSession.selectOne("com.fanxin.mapper" + ".CustomerMapper.findCustomerById", 1);
//		System.out.println(customer.toString());
//		// 5.关闭SqlSession
//		sqlSession.close();
//	}
//	
	
	// 根据用户名查询用户信息
//	@Test
//	public void findCustomerByName() throws Exception {
//		// 1.先读取配置文件
//		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//		// 2.构建会话工厂（SqlSessionFactory）
//		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//		// 3. 通过SqlSessionFactory创建SqlSession
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		// 4. 执行映射文件中定义的SQL,并返回映射结果
//		List<Customer> customers = sqlSession.selectList("com.fanxin.mapper" + ".CustomerMapper.findCustomerByName", "j");
//		// System.out.println(customer.toString());
//		for (Customer customer : customers) {
//			System.out.println(customer);
//		}
//		// 5.关闭SqlSession
//		sqlSession.close();
//	}
	
	// 添加用户
//	@Test
//	public void addCustomerTest() throws Exception {
//		// 1.先读取配置文件
//		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//		// 2.构建会话工厂（SqlSessionFactory）
//		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//		// 3. 通过SqlSessionFactory创建SqlSession
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		// 4. 执行映射文件中定义的SQL,并返回映射结果
//		Customer customer =  new Customer();
//		customer.setUsername("ck");
//		customer.setJobs("student");
//		customer.setPhone("15489796549");
//		int num = sqlSession.insert("com.fanxin.mapper"+".CustomerMapper.addCustomer", customer);
//		if (num > 0) {
//			System.out.println("您成功插入了"+ num +"条数据！");
//		} else {
//			System.out.println("执行插入操作失败！");
//		}
//		sqlSession.commit();
//		sqlSession.close();
//	}
	
	// 更新用户
//	@Test
//	public void updateCustomerTest() throws Exception {
//		// 1.先读取配置文件
//		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//		// 2.构建会话工厂（SqlSessionFactory）
//		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//		// 3. 通过SqlSessionFactory创建SqlSession
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		// 4. 执行映射文件中定义的SQL,并返回映射结果
//		Customer customer =  new Customer();
//		customer.setId(3);
//		customer.setUsername("fanxin");
//		customer.setJobs("student");
//		customer.setPhone("15489796549");
//		int num = sqlSession.update("com.fanxin.mapper"+".CustomerMapper.updateCustomer", customer);
//		if (num > 0) {
//			System.out.println("您成功修改了"+ num +"条数据！");
//		} else {
//			System.out.println("执行修改操作失败！");
//		}
//		sqlSession.commit();
//		sqlSession.close();	

	
	// 删除用户
	@Test
	public void deleteCustomerTest() throws Exception {
		// 1.先读取配置文件
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		// 2.构建会话工厂（SqlSessionFactory）
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 3. 通过SqlSessionFactory创建SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 4. 执行映射文件中定义的SQL,并返回映射结果
		int num = sqlSession.delete("com.fanxin.mapper"+".CustomerMapper.deleteCustomer", 5);
		if (num > 0) {
			System.out.println("您成功删除了"+ num +"条数据！");
		} else {
			System.out.println("执行删除操作失败！");
		}
		sqlSession.commit();
		sqlSession.close();
		}
}
