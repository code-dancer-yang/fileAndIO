package com.isoftstones.apps.filecopy;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;
import java.util.Set;

public class PropertiesUtil {
	public static void main(String[] args) throws Exception{
		
		show01();
	}
    /**
     * Properties集合对象的使用  继承与 hashtable
     */
	private static void show01() throws Exception {
		Properties pro=new Properties();
		pro.setProperty("key1", "杨增辉");
		pro.setProperty("key2", "蔡徐坤");
		pro.setProperty("key3", "吴亦凡");
		Set<String> keys = pro.stringPropertyNames();
		for (String string : keys) {
			System.out.println("键："+string);
			System.out.println("值："+pro.getProperty(string));
			System.out.println("—————————华丽的分割线——————————");
		}
		//创建一个文件字符输出流,追加写
//		FileWriter fw=new FileWriter("properties.txt",true);
		
		//创建一个文件字节输出流，非追加写
		FileOutputStream fos=new FileOutputStream("properties2.txt",false);
		//存储properties对象到指定文件
		//pro.store(fw, "store data");
		pro.store(fos, "stores data");
		
	}

}
