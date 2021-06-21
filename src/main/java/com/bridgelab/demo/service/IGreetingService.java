package com.bridgelab.demo.service;

import com.bridgelab.demo.model.Greeting;
import com.bridgelab.demo.model.User;

public interface IGreetingService {
	Greeting addGreeting(User user);
	Greeting getGreetingById(long id);

}
