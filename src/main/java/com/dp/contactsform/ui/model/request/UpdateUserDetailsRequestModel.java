package com.dp.contactsform.ui.model.request;

import javax.validation.constraints.NotNull;

public class UpdateUserDetailsRequestModel {
	
	@NotNull(message = "First name cannot be empty.")
	private String firstName;

	@NotNull(message = "Last name cannot be empty.")
	private String lastName;

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
}
