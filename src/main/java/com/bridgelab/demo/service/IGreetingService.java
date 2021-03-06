package com.bridgelab.demo.service;

import java.util.List;

import com.bridgelab.demo.model.Greeting;
import com.bridgelab.demo.model.User;

public interface IGreetingService {
	Greeting addGreeting(User user);
	Greeting getGreetingById(long id);
	List<Greeting> findAllEntries();
	Greeting editEntries(User user,long id);
	void deleteEntries(long id);

}
