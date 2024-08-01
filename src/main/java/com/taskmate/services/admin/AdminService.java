package com.taskmate.services.admin;

import java.util.List;

import com.taskmate.dto.CommentDTO;
import com.taskmate.dto.TaskDto;
import com.taskmate.dto.UserDto;

public interface AdminService {
	
	List<UserDto> getUsers();

    UserDto updateUser(Long id, UserDto userDto);

    void deleteUser(Long id);

    TaskDto  createTask(TaskDto taskDto);
	
	List<TaskDto> getAllTasks();
	
    void deleteTask(Long id);   
   
    
    TaskDto updateTask(Long id , TaskDto taskDto) ;
    
    
    
    
    List<TaskDto> searchTaskByTitle(String title);
    
    TaskDto getTaskById(Long id);
    
    CommentDTO createComment(Long taskId, String content);
    
   List<CommentDTO> getCommentsByTaskId(Long taskId);
   	 
}
