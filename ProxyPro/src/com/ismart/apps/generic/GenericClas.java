package com.ismart.apps.generic;
/**
 * 泛型类
 * 一些常用的泛型类型变量：
				E：元素（Element），多用于java集合框架
				K：关键字（Key）
				N：数字（Number）
				T：类型（Type）
				V：值（Value）
 * @author zhyang
 *
 */
public class GenericClas<T> {
	private  T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}
