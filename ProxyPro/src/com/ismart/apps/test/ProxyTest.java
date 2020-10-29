package com.ismart.apps.test;

import java.lang.reflect.Proxy;

import org.junit.jupiter.api.Test;

import com.ismart.apps.proxy.Person;
import com.ismart.apps.proxy.StudenCGLIBProxy;
import com.ismart.apps.proxy.Student;
import com.ismart.apps.proxy.StudentInvocationHandler;
import com.ismart.apps.proxy.StudentProxy;

import net.sf.cglib.proxy.Enhancer;

class ProxyTest {

	@Test
	void testStudentProxy1() {
		//获取被代理对象
		Student stu=new Student();
		//获取被代理对象
		StudentProxy proxy=new StudentProxy(stu);
		//调用代理对象的方法
		proxy.sayHello();
		proxy.giveMoney();
	}
	@Test
	void testStudentProxy2() {
		//获取被代理对象
		Student stu=new Student();
		//获取处理器对象
		StudentInvocationHandler<Student> handler=new StudentInvocationHandler<Student>(stu);
		Person personProxy=(Person)Proxy.newProxyInstance(stu.getClass().getClassLoader(), stu.getClass().getInterfaces(), handler);
		personProxy.sayHello();
		personProxy.giveMoney();
	}
	@Test
	void testStudentProxy3() {
		ProxyTest test=new ProxyTest();
		Person personProxy=(Person)test.getProxyInstance(Student.class);
		personProxy.sayHello();
		personProxy.giveMoney();
	}
	//cglib代理获取代理类
	public  Object getProxyInstance(Class<?> clazz) {
		Enhancer enhancer = new Enhancer();

		enhancer.setSuperclass(clazz);

		enhancer.setCallback(new StudenCGLIBProxy());

		return enhancer.create();
	}

}
