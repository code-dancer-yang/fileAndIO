package com.isoftstones.apps;

import java.io.File;
/**
 * 相对路径：
 * 绝对路径：
 * @author zhyang
 *
 */
public class File_create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pathseparator = File.pathSeparator;
		String separator = File.separator;
	    System.out.println("系统的路径分隔符："+pathseparator);//windows ;  linux :
	    System.out.println("系统的文件路径分隔符："+separator); //windows \  linux /
	    System.out.println("+++++++++++File类的构造方法++++++++++++");
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
