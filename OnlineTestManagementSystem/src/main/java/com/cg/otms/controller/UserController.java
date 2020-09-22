package com.cg.otms.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.otms.dto.User;
import com.cg.otms.service.UserService;

@RestController
@RequestMapping("/users")
@CrossOrigin("http://localhost:4200")
public class UserController {
@Autowired
UserService userservice;
    //user login method
/*@GetMapping("/UserLogin/{userId}/{password}")  //Mapping the url
public String userLogin(@PathVariable("userId") String userId,@PathVariable("password") String password) {
	
	Optional<User> userDetails = userservice.userLogin(userId,password); //Invoking a method userLogin
	//Condition - Checking whether the obtained object is null
	if(userDetails.isPresent())
	{
		return "valid";
	}
	else
	{
	return "invalid";
	}
}
}*/



@GetMapping("/UserLogin/{userId},{password}")
public String userLogin(@PathVariable("userId") String userId,@PathVariable("password") String password) {
	Optional<User> userDetails = userservice.userLogin(userId,password);
	
	return userDetails.toString();
}}