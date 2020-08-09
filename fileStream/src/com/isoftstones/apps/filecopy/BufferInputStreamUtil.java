package com.isoftstones.apps.filecopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节缓冲流 读&取文件
 * @author zhyang
 *
 */
public class BufferInputStreamUtil {
	public static void main(String[] args) throws IOException {
//		BufferInputStreamUtil.show01();
	//	BufferInputStreamUtil.show02();
		
		BufferInputStreamUtil.show03();
	}
    /**
     * 通过字节缓冲流读写文件
     */
	private static void show03() throws IOException{
		//记录开始时间
		long start=System.currentTimeMillis();
		// TODO Auto-generated method stub
		//字节缓存输入流对象
	   BufferedInputStream bis=new BufferedInputStream(new FileInputStream("temp.txt"));
	   //自己缓存输出流对象
	   BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("temp2.txt"));
	   byte[] b=new byte[1024];
	   int len=0;
	   while((len=bis.read(b))!=-1) {
		   //写读取到的数据到缓存区
		   System.out.println(len);
		   bos.write(b, 0, len);
	   }
	   //刷新缓存到文件
	   bos.flush();
	   bos.close();
	   bis.close();
	   //记录结束时间
	   long end=System.currentTimeMillis();
	   System.out.println("通过字节缓冲流读取文件用时为："+(end-start)+"毫秒");
	}
    /**
     * 通过字节缓存流读取文件，一次缓存多个字节
     */
	private static void show02() throws IOException{
		// TODO Auto-generated method stub
		long start =System.currentTimeMillis();
		//获取文件输入流对象
		FileInputStream fis=new FileInputStream("temp.txt");
		BufferedInputStream bis=new BufferedInputStream(fis); 
		byte[] b=new byte[1024];
		int len=0;
		while((len=bis.read(b))!=-1) {
			System.out.println(len);
		}
		//释放资源
		bis.close();
		long end =System.currentTimeMillis();
		System.out.println("一次缓冲1024个字节，读取整个文件需要用时为："+(end-start)+"毫秒");
		
		
	}
    /**
     * 通过字节缓存流读取文件，一次缓存一个字节
     * @throws IOException
     */
	private static void show01() throws IOException {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		//获取文件输入流对象
		FileInputStream fis=new FileInputStream("temp.txt");
		//获取字节缓存流对象，并将输入流对象传入其构造方法
		BufferedInputStream bis=new BufferedInputStream(fis);
		int len=0;
		while((len=bis.read())!=-1) {
			System.out.println(len);
		}
		//释放资源
		bis.close();
		long end=System.currentTimeMillis();
		System.out.println("一次缓冲一个字节，读取整个文件需要用时为："+(end-start)+"毫秒");
	}

}
