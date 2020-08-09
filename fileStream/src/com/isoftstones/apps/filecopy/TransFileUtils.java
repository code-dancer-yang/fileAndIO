package com.isoftstones.apps.filecopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 * 转换流
 * InputStreamReader
 * OutputStreamWriter
 * @author zhyang
 *
 */
public class TransFileUtils {
	public static void main(String[] args) throws IOException{
		TransFileUtils.show01();
		TransFileUtils.show02();
		TransFileUtils.show03();

	}
    /**
     * 转换流读文件
     */
	private static void show03() throws IOException{
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(new FileInputStream("temp4.txt"),"utf-8");
		int len=0;
		while((len=isr.read())!=-1) {
			System.out.println((char)len);
		}
		//释放资源
		isr.close();
	}
    /**
     * 转换流写文件
     */
	private static void show02() throws IOException{
		// TODO Auto-generated method stub
		OutputStreamWriter osw=new OutputStreamWriter
				(new FileOutputStream("temp5.txt"),"utf-8");
		    osw.write("杨增辉");
		    //释放资源
		    osw.close();
	}

	private static void show01() throws IOException {
		// TODO Auto-generated method stub
		String a=new String("杨增辉".getBytes(),"iso-8859-1");
		String b=new String(a.getBytes("iso-8859-1"),"utf-8");
		System.out.println(b);
		
	}
}
