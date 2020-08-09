package com.isoftstones.apps.filecopy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符缓冲流读写文件
 * @author zhyang
 *
 */
public class BufferReadAndWriter {
	public static void main(String[] args) throws IOException{
//		BufferReadAndWriter.show01();
//		BufferReadAndWriter.show02();
		BufferReadAndWriter.show03();
   
	}
    //一次读取一行并写如文件
	private static void show03() throws IOException{
		// TODO Auto-generated method stub
		//字符缓冲输入流对象
		BufferedReader br=new BufferedReader(new FileReader("temp.txt"));
		//字符缓冲输出流对象
		BufferedWriter bw=new BufferedWriter(new FileWriter("temp3.txt"));
		String str=null;
		while((str=br.readLine())!=null) {
			bw.write(str);
			bw.newLine();
		}
		//刷新缓冲到文件
		bw.flush();
		bw.close();
		br.close();
		
	}
   //读文件，一次读取一行
	private static void show02() throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new FileReader("temp.txt"));
		String str=null;
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
		//释放资源
		br.close();
	}
    //读文件，一次缓冲一个字符数组大小的字符
	private static void show01()throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("temp.txt"));
		char[] c=new char[1024];
		int len=0;
		while((len=br.read(c))!=-1) {
			System.out.println(c);
		}
//		while((len=br.read())!=-1) {
//			System.out.println(len);
//		}
		//释放资源
		br.close();
	}
}
