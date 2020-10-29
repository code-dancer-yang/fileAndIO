package com.ismart.apps.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * jdk动态代理
 * @author zhyang
 *
 */
public class StudentInvocationHandler<T extends Person> implements InvocationHandler {
	private T target;
	public  StudentInvocationHandler(T target) {
		// TODO Auto-generated constructor stub
		this.target=target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		MonitorUtil.start();
		Thread.sleep(3000);
		Object result = method.invoke(target, args);
		MonitorUtil.finish(method.getName());
		return result;
	}

}
