package com.fanxin.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.fanxin.po.Orders;
import com.fanxin.po.Person;
import com.fanxin.po.User;
import com.fanxin.utils.MybatisUtils;

public class MybatisAssociatedTest {
	  // 嵌套查询
//    @Test
//    public void findPersonByIdTest() {
//        // 1、通过工具类生成SqlSession对象
//        SqlSession session = MybatisUtils.getSession();
//        // 2.使用MyBatis嵌套查询的方式查询id为1的人的信息
//        Person person = session.selectOne("com.fanxin.mapper." 
//                                   + "PersonMapper.findPersonById", 1);
//        // 3、输出查询结果信息
//        System.out.println(person);
//        // 4、关闭SqlSession
//        session.close();
//    }
    
      // 嵌套查询
//    @Test
//    public void findPersonByIdTest2() {
//        // 1、通过工具类生成SqlSession对象
//        SqlSession session = MybatisUtils.getSession();
//        // 2.使用MyBatis嵌套查询的方式查询id为1的人的信息
//        Person person = session.selectOne("com.fanxin.mapper." 
//                                   + "PersonMapper.findPersonById2", 1);
//        // 3、输出查询结果信息
//        System.out.println(person);
//        // 4、关闭SqlSession
//        session.close();
//    }
	
	// 一对多
//    @Test
//    public void findUserTest() {
//        // 1、通过工具类生成SqlSession对象
//        SqlSession session = MybatisUtils.getSession();
//        // 2.使用MyBatis嵌套查询的方式查询id为1的人的信息
//        User user = session.selectOne("com.fanxin.mapper." 
//                                   + "UserMapper.findUserWithOrders", 1);
//        // 3、输出查询结果信息
//        System.out.println(user);
//        // 4、关闭SqlSession
//        session.close();
//    }
	
	// 多对多
//	@Test
//	public void findOrdersTest() {
//	  // 1、通过工具类生成SqlSession对象
//      SqlSession session = MybatisUtils.getSession();
//      // 2.使用MyBatis嵌套查询的方式查询id为1的人的信息
//      Orders orders = session.selectOne("com.fanxin.mapper." 
//                                 + "OrdersMapper.findOrdersWithProduct", 1);
//      // 3、输出查询结果信息
//      System.out.println(orders);
//      // 4、关闭SqlSession
//      session.close();
//	}
	
	@Test
	public void findOrdersTest() {
	  // 1、通过工具类生成SqlSession对象
      SqlSession session = MybatisUtils.getSession();
      // 2.使用MyBatis嵌套查询的方式查询id为1的人的信息
      Orders orders = session.selectOne("com.fanxin.mapper." 
                                 + "OrdersMapper.findOrdersWithProduct2", 1);
      // 3、输出查询结果信息
      System.out.println(orders);
      // 4、关闭SqlSession
      session.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
