package com.exam.service.impl;

import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.repo.RoleRepository;
import com.exam.repo.UserRepository;
import com.exam.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	public UserServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
		// TODO Auto-generated method stub
		User localUser = userRepository.findByUserName(user.getUserName());

		if (localUser != null) {
			System.out.println("User Already exists");
			throw new Exception("User Already Exists");
		} else {
			for (UserRole ur : userRoles)
				roleRepository.save(ur.getRole());

			user.getUserRoles().addAll(userRoles);
			localUser = this.userRepository.save(user);
		}
		return localUser;
	}

	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		return this.userRepository.findByUserName(username);
	}

	@Override
	public void deleteUser(Long userId) {
		// TODO Auto-generated method stub
		this.userRepository.deleteById(userId);
	}

	@Override
	public User updateUser(User user, Long userId) {
		// TODO Auto-generated method stub
		user.setUserId(userId);
		return this.userRepository.save(user);
	}

}
