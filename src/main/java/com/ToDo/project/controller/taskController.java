package com.ToDo.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ToDo.project.model.Tasks;
import com.ToDo.project.model.User;
import com.ToDo.project.repository.userRepository;
import com.ToDo.project.sevice.taskService;

@RestController
@CrossOrigin
@RequestMapping("/task")
public class taskController {

	@Autowired
	private taskService taskService;

	private userRepository userRepository;

	@PostMapping("/saveTask")
	public ResponseEntity<Tasks> saveTask(@RequestBody Tasks task, @RequestParam int id) {

		User user1 = this.userRepository.findById(id).get();
		task.setUser(user1);
		return ResponseEntity.ok().body(this.taskService.saveTask(task));
	}

	@GetMapping("/update/{id}")
	public ResponseEntity<Tasks> updateTask(@RequestBody Tasks task, @RequestParam int id) {

		task.setUser(this.userRepository.getById(id));

		return ResponseEntity.ok().body(this.taskService.saveTask(task));
	}

	@DeleteMapping("/deleteTask/{id}")
	public void deleteTaskById(@RequestParam int id) {

		this.taskService.deleteTaskById(id);
	}

	@GetMapping("/getTasks")
	public ResponseEntity<Iterable<Tasks>> getTasks() {

		Iterable<Tasks> tasks = this.taskService.getTasks();
		return ResponseEntity.ok().body(tasks);
	}
	
	@GetMapping("/getTasks/{id}")
	public ResponseEntity<Tasks> getTaskById(@PathVariable int id){
		Tasks taskById = this.taskService.getTaskById(id);
		return ResponseEntity.ok().body(taskById);
		
	}

}
