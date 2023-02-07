package com.ToDo.project.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ToDo.project.model.User;
import com.ToDo.project.repository.userRepository;

@Service
public class userServiceImpl implements userService {

	@Autowired
	private userRepository userRepository;

	@Override
	public User saveUser(User user) {
		return this.userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return this.userRepository.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public User getUserById(int id) {
		return this.userRepository.getById(id);
	}

	@Override
	public void deleteUserById(int id) {

		this.userRepository.deleteById(id);
	}

}
