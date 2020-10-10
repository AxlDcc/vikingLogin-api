package com.viking.Viking.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.viking.Viking.Entity.User;
import com.viking.Viking.IRepository.UserListRepository;

@Service(value = "userService")
public class UserServiceImpl implements UserDetailsService, UserService {
	
	@Autowired
	private UserListRepository userListRepo;
	
	@Autowired
	private BCryptPasswordEncoder bcryptEncoder;

	private List<SimpleGrantedAuthority> getAuthority() {
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
	}
	

	@Override
	public User save(User user) {
	    User newUser = new User();
	    newUser.setUserName(user.getUserName());
	    newUser.setEmail(user.getEmail());
	    newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
	    newUser.setRol(user.getRol());
        return userListRepo.save(newUser);
	}

	@Override
	public List<User> findAll() {
		List<User> list = new ArrayList<>();
		userListRepo.findAll().iterator().forEachRemaining(list::add);
		return list;
	}

	@Override
	public void delete(int id) {
		userListRepo.deleteById(id);
		
	}

	@Override
	public User findOne(String name) {
		return userListRepo.findByUserName(name);
	}

	@Override
	public User findById(int id) {
		Optional<User> optionalUser = userListRepo.findById(id);
		return optionalUser.isPresent() ? optionalUser.get() : null;
	}

	@Override
	public User update(User user) {
        User newUser = findById(user.getId());
        if(user != null) {
            BeanUtils.copyProperties(newUser, user, "password");
            userListRepo.save(user);
        }
        return newUser;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userListRepo.findByUserName(username);
		if(user == null) {
			throw new UsernameNotFoundException("Nombre de usuario o password invalido");
		}
		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),getAuthority());

	}

}
