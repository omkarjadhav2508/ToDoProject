package com.ToDo.project.model;

import java.util.Date;
import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Entity
@Table(name = "tasks")
@Data
public class Tasks {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tId;
	private String taskName;
	private Date dueDate;
	@ManyToOne()
	private User user;
	
	public Tasks(int tId, String taskName, Date dueDate, User user) {
		super();
		this.tId = tId;
		this.taskName = taskName;
		this.dueDate = dueDate;
		this.user = user;
	}

	public Tasks() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Date getTodate() {
		return dueDate;
	}

	public void setTodate(Date dueDate) {
		this.dueDate = dueDate;
	}

	@JsonBackReference
	public User getUser() {
		return user;
	}

	public void setUser(User user2) {
		this.user = user2;
	}
	
	
}
