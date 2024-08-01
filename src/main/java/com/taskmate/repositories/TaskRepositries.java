package com.taskmate.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taskmate.entities.Task;

@Repository
public interface TaskRepositries extends JpaRepository<Task, Long>{

	List<Task> findAllByTitleContaining(String title);

	List<Task>  findAllByUserId(Long id);

	

}
