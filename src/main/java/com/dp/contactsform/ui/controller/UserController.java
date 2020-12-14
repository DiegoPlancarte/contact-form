package com.dp.contactsform.ui.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dp.contactsform.ui.model.request.UserDetailsRequestModel;
import com.dp.contactsform.ui.model.response.UserRest;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@GetMapping
	public String getUsers(@RequestParam(value="page", defaultValue="1") int page, @RequestParam(value="limit", defaultValue="10") int limit) {
		return "Get user was called with page = " + page + " and limit = " + limit;
	}
	
	@GetMapping(path="/{userId}",
			produces = {
				MediaType.APPLICATION_XML_VALUE,
				MediaType.APPLICATION_JSON_VALUE,					
				})
	public ResponseEntity<UserRest> getUser(@PathVariable String userId) {
		UserRest returnValue = new UserRest();
		returnValue.setEmail("test@email.com");
		returnValue.setFirstName("Test");
		returnValue.setLastName("Name");
		returnValue.setUserId("1");
		return new ResponseEntity<UserRest>(returnValue, HttpStatus.OK);
	}
	
	@PostMapping(
			consumes = {
					MediaType.APPLICATION_XML_VALUE,
					MediaType.APPLICATION_JSON_VALUE,					
					}, 
			produces = {
					MediaType.APPLICATION_XML_VALUE,
					MediaType.APPLICATION_JSON_VALUE,					
					})
	public ResponseEntity<UserRest> createUser(@RequestBody UserDetailsRequestModel userDetails) {
		UserRest returnValue = new UserRest();
		returnValue.setFirstName(userDetails.getFirstName());
		returnValue.setLastName(userDetails.getLastName());
		returnValue.setEmail(userDetails.getEmail());
		returnValue.setUserId(userDetails.getPassword());
		return new ResponseEntity<UserRest>(returnValue, HttpStatus.OK);
	}
	
	@PutMapping
	public String updateUser() {
		return "Update user was called";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "Delete user was called";
	}
}
