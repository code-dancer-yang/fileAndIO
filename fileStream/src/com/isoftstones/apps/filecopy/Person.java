package com.isoftstones.apps.filecopy;

import java.io.Serializable;

public class Person implements Serializable{
	//解决修改文件编译后反序列化时，报异常
	private static final long serialVersionUID = 1L;
	private String name;
	private Integer age;
	//transient修饰的变量不能被序列化
//	private transient Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
	}
	

}
