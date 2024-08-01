package com.taskmate.dto;

import java.util.Date;

import com.taskmate.enums.TaskStatus;

import lombok.Data;


@Data
public class TaskDto {
	
	private Long id;
	
	private String title;
	private String description;
	private Date dueDate;
	private Date assignedDate;
	private String priority;
	private TaskStatus taskStatus;
	private Long employeeId;
	private String employeeName;
}
