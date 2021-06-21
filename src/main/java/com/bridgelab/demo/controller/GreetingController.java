package com.bridgelab.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelab.demo.model.Greeting;
import com.bridgelab.demo.model.User;
import com.bridgelab.demo.service.IGreetingService;

@RestController
@RequestMapping("/GreetingController")
public class GreetingController {
	@Autowired
	private IGreetingService greeting;

	
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "Spring")String name,@RequestParam(value = "lname", defaultValue = "world")String lname) {
		User user = new User();
		user.setFirstName(name);
		user.setLastName(lname);		
		return greeting.addGreeting(user);
	}
	
	@GetMapping("/find/{id}")
	public Greeting findById(@PathVariable long id) {
		return greeting.getGreetingById(id);
	}
	
	@GetMapping("/findall")
	public List<Greeting> findAllEntries(){
		return greeting.findAllEntries();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteElements(@PathVariable long id) {
		greeting.deleteEntries(id);
	}
}