package com.bjsxt.boot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bjsxt.boot.pojo.User;

public interface UserMapper {

	void insertUser(User user);
	void updateUser(User user);
	User selectUsersById(Long id);
	List<User> selectUsersByPage(@Param("user")User example, 
			@Param("startIndex")int startIndex, @Param("size")int size);
	void deleteUserById(Long id);
	
}
