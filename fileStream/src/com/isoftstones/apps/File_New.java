package com.isoftstones.apps;

import java.io.File;
import java.io.IOException;

/**
 * ����һ���ļ���
 *   public boolean createNewFile() throws IOException
 *   ���ҽ���·����û�и��ļ���ʱ���ȥ����һ���µ��ļ���
 *  ע�⣺1.  ·������д����·��������ڣ���Ȼ�ᱨ�쳣
 *             2. �÷���ֻ�ܴ����ļ������ܹ������ļ���
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
		//ɾ���ļ������ļ��У�����ɾ��
		File f1=new File("a.txt");
		boolean delete = f1.delete();
		System.out.println(delete);
	}
	
	
	

}
