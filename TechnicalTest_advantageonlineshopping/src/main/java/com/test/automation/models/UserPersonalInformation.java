package com.test.automation.models;

import java.util.Locale;

import com.github.javafaker.Faker;

public class UserPersonalInformation {
	
	Faker faker = new Faker(new Locale("en-US"));
	
	private String userName;
	private String email;
	private String password;
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	
	private String country;
	private String city;
	private String address;
	private String state;
	private String postalCode;
	
	public UserPersonalInformation() {
		
		this.userName = faker.name().username();
		if(userName.length()>15) {
			this.userName = userName.substring(0, 15);
		}
		System.out.println("userName : "+userName);
		this.email = faker.internet().emailAddress();
		System.out.println("email : "+email);
		this.password = faker.name().prefix() + faker.number().digits(5);
		System.out.println("password : "+password);
		
		this.firstName = faker.name().firstName();
		if(firstName.length()>30) {
			this.firstName = firstName.substring(0, 30);
		}
		System.out.println("firstName : "+firstName);
		this.lastName = faker.name().lastName();
		if(lastName.length()>30) {
			this.lastName = lastName.substring(0, 30);
		}
		System.out.println("lastName : "+lastName);
		this.phoneNumber = faker.phoneNumber().cellPhone();
		if(phoneNumber.length()>20) {
			this.phoneNumber = phoneNumber.substring(0, 20);
		}
		System.out.println("phoneNumber : "+phoneNumber);
		
		this.country = faker.country().name();
		if(country.length()>25) {
			this.country = country.substring(0, 25);
		}
		System.out.println("country : "+country);
		this.city = faker.country().capital();
		System.out.println("city : "+city);
		this.address = faker.address().streetAddress();
		if(address.length()>50) {
			this.address = address.substring(0, 50);
		}
		System.out.println("address : "+address);
		this.state = faker.address().state();
		if(state.length()>10) {
			this.state = state.substring(0, 10);
		}
		System.out.println("state : "+state);
		this.postalCode = faker.address().zipCode();
		if(postalCode.length()>10) {
			this.postalCode = postalCode.substring(0, 10);
		}
		System.out.println("postalCode : "+postalCode);
		
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getState() {
		return state;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	
	

}
