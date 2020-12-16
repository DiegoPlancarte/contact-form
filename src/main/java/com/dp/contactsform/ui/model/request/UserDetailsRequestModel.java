package com.dp.contactsform.ui.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDetailsRequestModel {
	
	@NotNull(message="First name cannot be empty.")
	private String firstName;
	
	@NotNull(message="Last name cannot be empty.")
	private String lastName;
	
	@NotNull(message="Email cannot be empty.")
	@Email
	private String email;
	
	@NotNull(message="Password cannot be empty.")
	@Size(min=8, max=16, message="Password must be between 8 and 16 characters long.")
	private String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
