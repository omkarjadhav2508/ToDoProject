package com.ToDo.project.sevice;


import com.ToDo.project.model.User;

public interface userService {

	public User saveUser(User user);
	public Iterable<User> getAllUsers();
	public User getUserById(int id);
	public void deleteUserById(int id);
}
