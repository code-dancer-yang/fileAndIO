package com.isoftstones.apps;

import java.io.File;
/**
 * ���·����
 * ����·����
 * @author zhyang
 *
 */
public class File_create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pathseparator = File.pathSeparator;
		String separator = File.separator;
	    System.out.println("ϵͳ��·���ָ�����"+pathseparator);//windows ;  linux :
	    System.out.println("ϵͳ���ļ�·���ָ�����"+separator); //windows \  linux /
	    System.out.println("+++++++++++File��Ĺ��췽��++++++++++++");
	    File file = new File("C:\\Users\\zhyang\\eclipse-workspace-01\\fileStream\\a.txt");
	    File file2=new File("b.txt");
	    
	    System.out.println(file);
	    System.out.println(file2);
	    
	    System.out.println("+++++++++++++++++++++++++++");
	    File_create.show01("c:\\","a.txt");

	}
	
	public static void show01(String parentpath,String sonpath) {
		File file =new File(parentpath, sonpath);
		System.out.println(file);
		
	}

}
