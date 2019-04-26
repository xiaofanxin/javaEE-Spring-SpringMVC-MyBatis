package com.itheima.factorybean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		// TODO Auto-generated method stub
		check_Permissions();
		Object obj = mi.proceed();
		log();	
		return obj;
	}
	
	public void check_Permissions() {
		System.out.println("模拟权限检查。。。");
	}
	
	public void log() {
		System.out.println("模拟记录日志。。。");
	}
}
