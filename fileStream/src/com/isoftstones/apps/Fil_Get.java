package com.isoftstones.apps;

import java.io.File;
import java.io.InputStream;

/**
 * File�Ļ�ȡ����
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
		System.out.println(f1.length());//��ȡ�ļ���С�����ֽ�Ϊ��λ���ļ��еĴ�СΪ0
		System.out.println(f12.length());//��ȡ�ļ���С�����ֽ�Ϊ��λ ���ļ�������ʱ ��СΪ0
		System.out.println(f1.exists());
		System.out.println(f12.exists());
		System.out.println(f13.exists());//�жϹ��췽���д��ݵ�·���е��ļ������ļ����Ƿ����
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
			System.out.println(f1.isDirectory());//�жϹ��췽�������·���е��Ƿ����ļ���,���·���������򷵻�false
			System.out.println(f1.isFile());//�жϹ��췽�������·���е��Ƿ����ļ�,���·�������� �򷵻�false
		}
		System.out.println("+++++++++++++++++++");
		if (f2.exists()) {
			System.out.println(f2.isDirectory()); 
			System.out.println(f2.isFile());
		} 
	}

}
