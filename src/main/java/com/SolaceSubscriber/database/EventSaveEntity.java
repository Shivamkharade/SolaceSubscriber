package com.SolaceSubscriber.database;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class EventSaveEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String user_id;
	
	private String username;
	
	private String email;
	
	private String role;
	
	@Column(
			name = "event_time",
			columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP",
			insertable = false,
			updatable = false
			)
	private LocalDateTime eventTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
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

	public LocalDateTime getEventTime() {
		return eventTime;
	}

	public void setEventTime(LocalDateTime eventTime) {
		this.eventTime = eventTime;
	}
	

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public EventSaveEntity(Long id, String user_id, String username, String email, LocalDateTime eventTime) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.username = username;
		this.email = email;
		this.eventTime = eventTime;
	}
	
	public EventSaveEntity(Long id, String user_id, String username, String email, String role) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.username = username;
		this.email = email;
		this.role = role;
	}

	public EventSaveEntity() {
		
	}
	
}
