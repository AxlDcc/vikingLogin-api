package com.viking.Viking.Service;

import java.util.List;

import com.viking.Viking.Entity.User;

public interface UserService {
	
	User save(User user);
	List<User> findAll();
	void delete(int id);
	User findOne(String name);
	User findById(int id);
	User update(User user);

}
