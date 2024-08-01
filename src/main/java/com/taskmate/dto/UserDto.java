package com.taskmate.dto;

import com.taskmate.enums.UserRole;

import lombok.Data;

@Data
public class UserDto {

	private Long id;
	private String name;
	private String email;
	private String password;
	private UserRole userRole;
}
