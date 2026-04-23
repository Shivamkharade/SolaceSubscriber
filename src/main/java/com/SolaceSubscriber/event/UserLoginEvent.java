package com.SolaceSubscriber.event;

import java.time.LocalDateTime;

public class UserLoginEvent {

	private String id;
	
	private String username;
	
	private String email;
	
	private String role;
	
	private LocalDateTime logintime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getLogintime() {
		return logintime;
	}

	public void setLogintime(LocalDateTime logintime) {
		this.logintime = logintime;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public UserLoginEvent(String id, String username, String email, LocalDateTime logintime) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.logintime = logintime;
	}
	
	
	
	public UserLoginEvent(String id, String username, String email, String role) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.role = role;
	}

	public UserLoginEvent() {
		
	}
}
