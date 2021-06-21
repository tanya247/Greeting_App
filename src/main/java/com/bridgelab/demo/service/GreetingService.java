package com.bridgelab.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelab.demo.model.Greeting;
import com.bridgelab.demo.model.User;
import com.bridgelab.demo.repository.GreetingRepository;

@Service
public class GreetingService implements IGreetingService{
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	@Autowired
	private GreetingRepository greetingRepository;
	public Greeting addGreeting(User user) {
		String message = String.format(template, (user.toString().isEmpty())?"Hello World" : user.toString());
		return greetingRepository.save(new Greeting(counter.incrementAndGet(), message));
	}
	public Greeting getGreetingById(long id) {
		return greetingRepository.findById(id).get();
	}
	@Override
	public List<Greeting> findAllEntries() {
		return greetingRepository.findAll();
	}


	
}
