package com.cjc.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.User;
import com.cjc.main.repository.UserRepository;
import com.cjc.main.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository ur;

	@Override

	public User davedata(User u) {
	User use=	ur.save(u);
		
		return use;
	}
	public Iterable<User> getAllData() {
		Iterable<User> user=ur.findAll();
		return user;

	}

}
