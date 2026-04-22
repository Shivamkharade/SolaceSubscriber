package com.SolaceSubscriber.Services;

import org.springframework.stereotype.Service;

import com.SolaceSubscriber.database.EventSaveEntity;
import com.SolaceSubscriber.database.EventSaveRepository;
import com.SolaceSubscriber.event.UserLoginEvent;

@Service
public class DatabaseService {
	
	private final EventSaveRepository repository;
	
	public DatabaseService(EventSaveRepository repository1) {
		this.repository = repository1;
	}
	
	public void saveEvent(UserLoginEvent userLoginEvent) {
		EventSaveEntity eventSaveEntity = new EventSaveEntity();
		eventSaveEntity.setUser_id(userLoginEvent.getId());
		eventSaveEntity.setEmail(userLoginEvent.getEmail());
		eventSaveEntity.setUsername(userLoginEvent.getUsername());
		repository.save(eventSaveEntity);
	}
	
}
