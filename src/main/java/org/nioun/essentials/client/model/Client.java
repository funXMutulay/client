package org.nioun.essentials.client.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Client {

 @Id
@GeneratedValue
 Long clientId ;
 String firstName;
 String lastName;
 String email;
 String phone;
 String addresse;

 public Client() {
	 
 }
 
 public Client( String firstName, String lastName, String email, String phone, String addresse) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.phone = phone;
	this.addresse = addresse;
}

public Long getClientId() {
	return clientId;
}

public void setClientId(Long clientId) {
	this.clientId = clientId;
}

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

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getAddresse() {
	return addresse;
}

public void setAddresse(String addresse) {
	this.addresse = addresse;
}
 
 
 
 
}
