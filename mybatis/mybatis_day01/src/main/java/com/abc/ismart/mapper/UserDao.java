package com.abc.ismart.mapper;

import java.util.List;

import com.abc.ismart.domain.User;

public interface UserDao {
	
	public List<User> findAllUser()throws Exception;
	public User findUserById(String id)throws Exception;
	public void insertOne(User user)throws Exception;

}
