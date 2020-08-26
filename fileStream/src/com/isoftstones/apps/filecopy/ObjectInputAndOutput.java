package com.isoftstones.apps.filecopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 序列号和反序列化流
 * ObjectOutputStream 序列化流，将java对象存入文件
 * ObjectOutputStream 反序列化流，将文件反序列化为object对象
 * @author zhyang
 *
 */
public class ObjectInputAndOutput {

	public static void main(String[] args)throws IOException, ClassNotFoundException {
//		objectSerializable();
//		objectUnSerializable();
		serializableCollection();


	}
	/**
	 * 序列化对象到文件
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	private static void objectSerializable() throws IOException, FileNotFoundException {
		//获取序列化流对象
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("ObjectSerial.txt"));
		//将java对象写入文件
		oos.writeObject(new Person("杨增辉", 18));
		//释放资源
		oos.close();
	}
	public static void objectUnSerializable ()throws IOException, ClassNotFoundException{
		//获取反序列化流对象
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("ObjectSerial.txt"));
		//将文件对象从文件中读出
		Object o = ois.readObject();
		System.out.println(o);
		//强制转换成Person类对象
		Person p=(Person)o;
		System.out.println(p);
		//释放资源
		ois.close();
	}
	
	//序列化集合到文件并读取
	public static void serializableCollection() throws FileNotFoundException, IOException, ClassNotFoundException {
		//得到集合
		List<Person> list=new ArrayList<Person>();
		list.add(new Person("小样",18));
		list.add(new Person("校长",11));
		list.add(new Person("小王",23));
		list.add(new Person("小李",13));
		list.add(new Person("晓晓",15));
		//得到序列化流对象
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("serializabletemp.txt"));
		//序列化对象到文件
		oos.writeObject(list);
		//得到反序列化流对象
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("serializabletemp.txt"));
		//读取反序列化对象
		Object o = ois.readObject();
		List<Person> listNew=(ArrayList<Person>)o;
		for (Person person : listNew) {
			System.out.println(person);
		}
		//释放资源
		ois.close();
		oos.close();
	}

}
