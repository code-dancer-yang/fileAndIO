package com.isoftstones.apps.filecopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyUtils {
	public static void main(String[] args) throws Exception {
		// 复制文件
		FileCopyUtils.copyFile_byte("D:\\fileinputandoutput\\pic_01.jpg", "temp.jpg");
		FileCopyUtils.coypFile_char("D:\\fileinputandoutput\\char.txt", "temp.txt");
	}

	// 通过字节输入和输出流来实现
	public static void copyFile_byte(String src, String dist) throws Exception {
		// 源文件和目的文件都不为空时
		if (!("".equals(src) && "".equals(dist))) {
			// 获取一个指向源文件的文件字节输入流
			FileInputStream fis = new FileInputStream(src);
			FileOutputStream fos = new FileOutputStream(dist);
			// 设置每次读取文件的字节数
			byte[] b = new byte[1024];
			int len = 0;
			// 读取文件并写入文件
			while ((len = fis.read(b)) != -1) {
				// 每次写的字节内容
				System.out.println(len);
				fos.write(b, 0, len);
			}
			fos.close();
			fis.close();
		}
	}

	// 通过字符输入输出流实现
	public static void coypFile_char(String src, String dist) throws IOException {
		// 获取字符输入流对象
		FileReader fr = new FileReader(src);
		// 获取字符输出流对象(追加)
		FileWriter fw = new FileWriter(dist, true);
		char[] c = new char[3];
		int len = 0;
		// 每读取c字符数组长度的字符
		while ((len = fr.read(c)) != -1) {
			// 将读取的字节写入内存缓冲区（字符转字节的过程），此时要写入的目的文件里面还没有内容
			System.out.println(len);
			fw.write(c, 0, len);
			fw.flush();
		}
		fw.flush();// 将内存缓冲区的文件刷新到目的文件，此时流对象还可以继续使用
		fw.write("\r\n");
		fw.write("杨哈哈哈曾4894ji@!#");
		fw.write("\r\n");
		fw.write(new char[] { 'a', '杨', '@' });
		fw.write("\r\n");
		fw.write("你猜我是谁呀猜到的话我就告诉你一个秘密！", 0, 5);
		fw.close();// 关闭资源,同时将内存缓冲区刷新，但是关闭之后流对象就不能用了
		fr.close();

	}

}
