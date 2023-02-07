package com.ToDo.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ToDo.project.model.User;
import com.ToDo.project.sevice.userService;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class userController {

	@Autowired
	private userService userService;

	@PostMapping("/saveUser")
	public ResponseEntity<User> saveUser(@RequestBody User user) {

		User user1 = this.userService.saveUser(user);
		return ResponseEntity.ok().body(user1);
	}

	@GetMapping("/getUser")
	public ResponseEntity<Iterable<User>> getAllUsers() {

		Iterable<User> allUsers = this.userService.getAllUsers();
		return ResponseEntity.ok().body(allUsers);

	}

	@GetMapping("/getUser/{id}")
	public ResponseEntity<User> getUserById(@PathVariable int id) {

		User userById = this.userService.getUserById(id);

		return ResponseEntity.ok().body(userById);
	}

	@PutMapping("/updateUser")
	public ResponseEntity<User> updateUser(User user) {

		User user2 = this.userService.saveUser(user);
		return ResponseEntity.ok().body(user2);
	}

	public void deleteUserById(@RequestParam int id) {

		this.userService.deleteUserById(id);
	}

}
