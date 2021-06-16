package com.bridgelab.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelab.demo.model.UserGreeting;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
	@RequestMapping(value = {"","/","/home"})
	public String sayGreetings() {
		return "Greetings";
	}
	@RequestMapping(method = RequestMethod.GET, value = {"/query"})
	public String sayGreeting(@RequestParam(value = "name") String name) {
		return "Greeting "+name+"!";
		
	}
	@GetMapping("/param/{name}")
	public String sayGreetingParam(@PathVariable String name) {
		return "Greeting "+name+ "!";
		
	}
	
	@PostMapping("/post")
	public String sayGreeting(@RequestBody UserGreeting user) {
		return "Greeting"+ user.getFirstName() + " "+user.getLastName() + "!";
		
	}
	
	
	@PutMapping("/put/{firstName}")
	public String sayGreetingPut(@PathVariable String firstName, @RequestParam(value= "lastName") String lastName) {
		return "Greeting" + firstName + " " + lastName + "!";
	}
	

}