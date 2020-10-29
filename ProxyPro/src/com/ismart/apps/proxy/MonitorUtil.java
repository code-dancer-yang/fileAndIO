package com.ismart.apps.proxy;

public class MonitorUtil {
	private static ThreadLocal<Long> t1=new ThreadLocal<Long>();
	public static void start() {
		//记录开始时间
		t1.set(System.currentTimeMillis());
	}
	public static void finish(String methodName) {
		//控制太打印方法执行消耗用时 /ms
		System.out.println(methodName+"方法执行消耗了："+(System.currentTimeMillis()-t1.get())+"ms");
	}

}
