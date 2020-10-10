package com.viking.Viking.IRepository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.viking.Viking.Entity.User;

public interface UserListRepository extends JpaRepository<User, Integer>{
	User  findByUserName(String username);

}
