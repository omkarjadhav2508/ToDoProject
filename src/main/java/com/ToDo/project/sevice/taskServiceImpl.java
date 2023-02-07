package com.ToDo.project.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ToDo.project.model.Tasks;
import com.ToDo.project.repository.taskRepository;

@Service
public class taskServiceImpl implements taskService {

	@Autowired
	private taskRepository taskRepository;

	@Override
	public Tasks saveTask(Tasks task) {
		return this.taskRepository.save(task);
	}

	@Override
	public void deleteTaskById(int id) {

		this.taskRepository.deleteById(id);

	}

	@Override
	public Iterable<Tasks> getTasks() {

		return this.taskRepository.findAll();
	}

	@Override
	public Tasks getTaskById(int id) {
		return this.taskRepository.getById(id);
	}

}
