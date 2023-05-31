package com.exam.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

	public UserController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private UserService userService;

	@PostMapping("/")
	public User createUser(@RequestBody User user) throws Exception {
		// Create User Role Set
		
		System.out.println(user);
		
		user.setProfile("default.png");
		Set<UserRole> userRoleSet = new HashSet<>();

		// For user Role set we need ROLE
		Role role = new Role();
		role.setRoleId(54L);
		role.setRoleName("staff");

		// For user ROLE SET we need USER
		UserRole userRole = new UserRole();
		userRole.setRole(role);
		userRole.setUser(user);

		// Then set ROLE & USER into the userRoleSet
		userRoleSet.add(userRole);

		return this.userService.createUser(user, userRoleSet);
	}

	@GetMapping("/{username}")
	public User getUserDetails(@PathVariable("username") String username) {
		return this.userService.getUser(username);
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@DeleteMapping("/{userId}")
	public void deleteUser(@PathVariable("userId") Long userId) {
		this.userService.deleteUser(userId);
	}

	@PutMapping("/{userId}")
	public User updateUser(@RequestBody User user, @PathVariable("userId") Long userId) {
		return this.userService.updateUser(user, userId);
	}

}
