package com.exam.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
//@Table(name = "user_roles")
public class UserRole {

	public UserRole() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userRoldId;

	@ManyToOne(fetch = FetchType.EAGER)
	private User user;

	@ManyToOne
	private Role role;

	public Long getUserRoldId() {
		return userRoldId;
	}

	public void setUserRoldId(Long userRoldId) {
		this.userRoldId = userRoldId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
