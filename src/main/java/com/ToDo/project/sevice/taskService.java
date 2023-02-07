package com.ToDo.project.sevice;

import com.ToDo.project.model.Tasks;

public interface taskService {

	public Tasks saveTask(Tasks task);
	
	public void deleteTaskById(int id);
	
	public Iterable<Tasks> getTasks();
	
	public Tasks getTaskById(int id);
}
	