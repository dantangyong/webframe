package com.sunshine.wiser.service;

import java.util.List;
import java.util.Map;

import com.sunshine.wiser.model.User;
/*
 * 提供用户数据服务
 */
public class UserService {
    
	/*
	 * 获取用户列表
	 */
	public List<User> getUserlist(String keyword){
		//to do
		return null;
		
	}
	
	/*
	 * 获取用户
	 */
	public User getUser(int id) {
		return null;
	}
	
	/*
	 * 创建用户
	 */
	public boolean createUser(Map<String,Object> fieldMap) {
		return false;
	}
	
	/*
	 * 更新用户
	 */
	public boolean updateUser(int id,Map<String,Object> fieldMap) {
		return false;
	}
	
	/*
	 * 删除用户
	 */
	public boolean deleteUser(int id) {
		return false;
	}
}
