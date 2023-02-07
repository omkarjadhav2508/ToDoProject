package com.ToDo.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ToDo.project.model.Tasks;

@Repository
public interface taskRepository extends JpaRepository<Tasks, Integer> {

}
