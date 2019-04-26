package com.itheima.jdk;

public class JdkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JdkProxy jdkProxy = new JdkProxy();
		UserDao userDao = new UserDaoImpl();
		UserDao uesrDao1 = (UserDao) jdkProxy.createProxy(userDao);
		
		uesrDao1.addUser();
		uesrDao1.deleteUser();
		
		// uesrDao1.addUser();
		// uesrDao1.deleteUser();
	}

}
