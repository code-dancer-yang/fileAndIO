package com.ismart.apps.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * cglib动态代理
 * @author zhyang
 *
 */
public class StudenCGLIBProxy implements MethodInterceptor {

	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		// TODO Auto-generated method stub
		MonitorUtil.start();
		Thread.sleep(3000);
		Object result = arg3.invokeSuper(arg0, arg2);
		MonitorUtil.finish(arg1.getName());
		return result;
	}

}
