package com.fanxin.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.fanxin.po.User;
import com.fanxin.utils.MybatisUtils;

public class MybatisTest {
	@Test
	public void findAllUserTest() {
		// 获取SqlSession
		SqlSession sqlSession = MybatisUtils.getSession();
		// SqlSession执行映射文件中定义的SQL，并返回映射结果
		List<User> list = sqlSession.selectList("com.fanxin.mapper.UserMapper.findAllUser");
		for (User user : list) {
			System.out.println(user);
		}
		// 关闭SqlSession
		sqlSession.close();
	}
}
