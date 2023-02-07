package com.ToDo.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ToDo.project.model.User;

@Repository
public interface userRepository extends JpaRepository<User, Integer> {

}
