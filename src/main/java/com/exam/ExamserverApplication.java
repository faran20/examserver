package com.exam;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {

//	@Autowired
//	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		// Demo Test User Added
//		User user = new User();
//		user.setFirstName("Faran");
//		user.setLastName("Ahmed");
//		user.setEmail("faran@gmail.com");
//		user.setPassword("123123");
//		user.setPhone("+971505004136");
//		user.setUserName("faranahmed");
//		user.setProfile("this is the link to profile image");
//
//		Role role = new Role();
//		role.setRoleId(44L);
//		role.setRoleName("admin");
//
//		Set<UserRole> userRoleSet = new HashSet<>();
//		UserRole userRole = new UserRole();
//		userRole.setRole(role);
//		userRole.setUser(user);
//
//		userRoleSet.add(userRole);
//
//		User newUser = userService.createUser(user, userRoleSet);
//		System.out.println("Successfully Created a user: " + newUser.getUserName());

	}

}
