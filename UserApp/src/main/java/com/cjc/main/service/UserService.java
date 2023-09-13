package com.cjc.main.service;

import com.cjc.main.model.User;

public interface UserService {



	public User davedata(User u);

	Iterable<User> getAllData();

	public User getSingle(int id);
  

	public void deletedata(int uId);


}
