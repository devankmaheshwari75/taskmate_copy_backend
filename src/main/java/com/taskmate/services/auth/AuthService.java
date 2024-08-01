package com.taskmate.services.auth;

import com.taskmate.dto.SignupRequest;
import com.taskmate.dto.UserDto;

public interface AuthService {

	UserDto signupUser(SignupRequest signupRequest);
	
	boolean hasUserWithEmail(String email);
}
