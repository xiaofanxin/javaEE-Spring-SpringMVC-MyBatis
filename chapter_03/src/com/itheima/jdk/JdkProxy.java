package com.itheima.jdk;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;
import com.itheima.aspect.MyAspect;

public class JdkProxy implements InvocationHandler {

	// 声明目标类接口
	private UserDao userDao;
	// 创建代理方法
	public Object createProxy(UserDao userDao) {
		this.userDao = userDao;
		// 1. 类加载器
		ClassLoader classLoader = JdkProxy.class.getClassLoader();
		Class[] clazz = userDao.getClass().getInterfaces();
		return Proxy.newProxyInstance(classLoader, clazz, this);
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		MyAspect myAspect = new MyAspect();
		myAspect.check_Permissions();
		Object obj = method.invoke(userDao, args);
		myAspect.log();
		return obj;
	}
	
	// 创建代理方法
//	public  Object createProxy(UserDao userDao) {
//		this.userDao = userDao;
//		// 1.类加载器
//		ClassLoader classLoader = JdkProxy.class.getClassLoader();
//		// 2.被代理对象实现的所有接口
//		Class[] clazz = userDao.getClass().getInterfaces();
//		// 3.使用代理类，进行增强，返回的是代理后的对象
//		return  Proxy.newProxyInstance(classLoader,clazz,this);
//	}
	
//	@Override
//	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//		// TODO Auto-generated method stub
//		MyAspect myAspect = new MyAspect();
//		myAspect.check_Permissions();
//		Object object = method.invoke(userDao, args);
//		myAspect.log();
//		return object;
//	}


}
