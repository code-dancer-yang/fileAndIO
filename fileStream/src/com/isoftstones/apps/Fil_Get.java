package com.isoftstones.apps;

import java.io.File;
import java.io.InputStream;

/**
 * File的获取功能
 * @author zhyang
 *
 */
public class Fil_Get {
	public static void main(String[] args) {
		/*
		 * File f1=new File("a.txt"); File f2=new File("C:\\a.txt");
		 * System.out.println(f1.getAbsolutePath());
		 * System.out.println(f2.getAbsolutePath());
		 * 
		 * System.out.println(f1.getPath()); System.out.println(f2.getPath());
		 * System.out.println(f1); System.out.println(f2);
		 */
	//	Fil_Get.show01();
		Fil_Get f=new Fil_Get();
		//f.show02();
		Fil_Get.show03();
	}
	
	
	public static  void show01() {
		File f1=new File("C:\\Users\\zhyang\\eclipse-workspace-01\\fileStream\\1.jpg");
		File f12=new File("C:\\Users\\zhyang\\eclipse-workspace-01\\fileStream\\12.jpg");
		File f13=new File("C:\\Users\\zhyang\\eclipse-workspace-01\\fileStream");
		File f14=new File("1.jpg");
		File f15=new File("2.jpg");
		System.out.println(f1.getName());
		System.out.println(f1.length());//获取文件大小，以字节为单位，文件夹的大小为0
		System.out.println(f12.length());//获取文件大小，以字节为单位 ，文件不存在时 大小为0
		System.out.println(f1.exists());
		System.out.println(f12.exists());
		System.out.println(f13.exists());//判断构造方法中传递的路径中的文件或者文件夹是否存在
		System.out.println(f14.exists());
		System.out.println(f15.exists());
		
		
		
	}
	
	public void show02() {
		InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("a.txt");
	}
	
	
	
	public static void show03() {
		File f1=new File("C:\\Users\\zhyang\\eclipse-workspace-01\\fileStream");
		File f2=new File("C:\\Users\\zhyang\\eclipse-workspace-01\\fileStream\\1.jpg");
		if(f1.exists()) {
			System.out.println(f1.isDirectory());//判断构造方法传入的路径中的是否是文件夹,如果路径不存在则返回false
			System.out.println(f1.isFile());//判断构造方法传入的路径中的是否是文件,如果路径不存在 则返回false
		}
		System.out.println("+++++++++++++++++++");
		if (f2.exists()) {
			System.out.println(f2.isDirectory()); 
			System.out.println(f2.isFile());
		} 
	}

}
