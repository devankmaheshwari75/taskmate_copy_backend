package com.taskmate.services.employee;

import java.util.List;

import com.taskmate.dto.CommentDTO;
import com.taskmate.dto.TaskDto;

public interface EmployeeService {
		List<TaskDto> getTaskByUserId();
		
	  TaskDto updateTask(Long id, String status);

	TaskDto getTaskById(Long id);
    
    CommentDTO createComment(Long taskId, String content);
    
   List<CommentDTO> getCommentsByTaskId(Long taskId);

//Map<String, Long> getTaskCountByPriorityForEmployee();

//Map<String, Long> getTaskCountByStatusForEmployee();

}
