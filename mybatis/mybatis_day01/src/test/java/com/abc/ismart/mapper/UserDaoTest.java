package com.abc.ismart.mapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.abc.ismart.domain.User;

public class UserDaoTest {
    private InputStream is;
    private SqlSession session;
    private UserDao mapper ;
	@Before
	public void setup() throws Exception {
		//读取配置文件
		is=Resources.getResourceAsStream("sqlMapperConfig.xml");
		//获取session工厂
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
		//获取session
		 session=factory.openSession();
		//获取代理对象
		 mapper = session.getMapper(UserDao.class);
	}
    /**
     * 获取所有
     * @throws Exception
     */
	@Test
	public void testFindAllUser()throws Exception {

		//执行方法
		List<User> users = mapper.findAllUser();
		for (User user : users) {
			System.out.println(user);
		}
	}
	@Test
	public void testFindUserById() throws Exception {
		User user=mapper.findUserById("1");
		System.out.println(user);
	}
	@Test
	public void testInsertOne() throws Exception {
		User user=new User("445","杨增辉",27);
		mapper.insertOne(user);
		session.commit();
	}
	@After
	public void destroy() throws Exception {
		session.close();
		is.close();
	}

}
