package com.ismart.apps.proxy;

public class StudentProxy implements Person {
	private Person target;
	public StudentProxy(Person per) {
		this.target=per;
	}

	@Override
	public void sayHello() {
		MonitorUtil.start();
		try {
			Thread.sleep(3000);
			target.sayHello();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MonitorUtil.finish("sayHello");
	}

	@Override
	public void giveMoney() {
		MonitorUtil.start();
		try {
			Thread.sleep(5000);
			target.giveMoney();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MonitorUtil.finish("giveMoney");
	}

}
