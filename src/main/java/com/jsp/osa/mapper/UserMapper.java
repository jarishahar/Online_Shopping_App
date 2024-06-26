package com.jsp.osa.mapper;

import org.springframework.stereotype.Component;

import com.jsp.osa.entity.User;
import com.jsp.osa.requestdto.UserRequest;
import com.jsp.osa.responsedto.UserResponse;
@Component
public class UserMapper {
//	@Autowired
//	private PasswordEncoder passwordEncoder;
	public User mapToUser(UserRequest userRequest, User user) {
		user.setUserName(userRequest.getUserName());
		user.setEmail(userRequest.getEmail());
		user.setPassword(userRequest.getPassword());
		user.setEmailVerified(false);
		user.setDeleted(false);
		return user;
		
	}

	public  UserResponse mapToUserResponse(User user) {
		return UserResponse.builder()
				.userId(user.getUserId())
				.userName(user.getUserName())
				.email(user.getEmail())
				.userRole(user.getUserRole())
				.isEmailVerified(false)
				.isDeleted(false)
				.build();
	}
}
