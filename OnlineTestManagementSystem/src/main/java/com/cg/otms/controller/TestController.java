package com.cg.otms.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cg.otms.dto.Test;
import com.cg.otms.exception.IdNotFoundException;
import com.cg.otms.service.TestService;

@RestController
@RequestMapping("/test")
@CrossOrigin("http://localhost:4200")
public class TestController {

	@Autowired
	
	TestService testservice;
	
	//Adding Test details into database
		@PostMapping("/addTest")
		public ResponseEntity<String> addTest(@RequestBody Test test) {
			Test testDetails = testservice.addTest(test);
			if (testDetails == null) {

				throw new IdNotFoundException("Test not added");

			} else {
				return new ResponseEntity<String>("Test added successfully", new HttpHeaders(), HttpStatus.OK);
			}
		}
		
	
}
