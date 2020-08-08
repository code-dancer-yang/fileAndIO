package com.isoftstones.apps;

import java.io.File;
import java.io.IOException;

/**
 * 创建一个文件：
 *   public boolean createNewFile() throws IOException
 *   当且仅当路径中没有该文件的时候才去创建一个新的文件，
 *  注意：1.  路径不能写错且路径必须存在，不然会报异常
 *             2. 该方法只能创建文件，不能够创建文件夹
 * @author zhyang
 *
 */
public class File_New {
	public static void main(String[] args)throws Exception {
		File_New.createFile01();
		//File_New.createFile02();
		File_New.deleteFile();
	}
	
	public static void createFile01() throws IOException {
		File f1=new File("a.txt");
		boolean result = f1.createNewFile();
		System.out.println(result);
	}
	public static void createFile02() throws IOException {
		File f1=new File("a.txt");
		boolean result = f1.mkdirs();
		System.out.println(result);
	}
	
	public  static void deleteFile() {
		//删除文件或者文件夹，彻底删除
		File f1=new File("a.txt");
		boolean delete = f1.delete();
		System.out.println(delete);
	}
	
	
	

}
