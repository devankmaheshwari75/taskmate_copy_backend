package com.taskmate.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taskmate.entities.Comment;

@Repository
public interface CommentsRepository  extends JpaRepository<Comment, Long>{

	List<Comment> findAllByTaskId(Long taskId);
	
	

}
