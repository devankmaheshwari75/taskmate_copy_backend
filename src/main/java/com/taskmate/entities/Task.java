package com.taskmate.entities;

import java.util.Date;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.taskmate.dto.TaskDto;
import com.taskmate.enums.TaskStatus;

import jakarta.persistence.*;

import lombok.Data;

@Entity
@Data
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	private String title;
	private String description;
	private Date dueDate;
	private Date assignedDate;
	private String priority;
	private TaskStatus taskStatus;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "user_id",nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIgnore
	private User user ;
	
	public TaskDto getTaskDto() {
		TaskDto taskDto =new TaskDto();
		taskDto.setId(id);
		taskDto.setTitle(title);
		taskDto.setDescription(description);
		taskDto.setEmployeeName(user.getName());
		taskDto.setEmployeeId(user.getId());
		taskDto.setTaskStatus(taskStatus);
		taskDto.setDueDate(dueDate);
		taskDto.setAssignedDate(assignedDate);
		taskDto.setPriority(priority);
		return taskDto;
	}
	
}
