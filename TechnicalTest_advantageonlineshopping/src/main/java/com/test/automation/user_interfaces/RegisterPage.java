package com.test.automation.user_interfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage extends PageObject{
	
	public static final Target USER_NAME = Target.the("User Name")
			.located(By.name("usernameRegisterPage"));
	
	public static final Target EMAIL = Target.the("Email")
			.located(By.name("emailRegisterPage"));
	
	public static final Target PASSWORD = Target.the("Passowrd")
			.located(By.name("passwordRegisterPage"));
	
	public static final Target PASSWORD_CONFIRM = Target.the("Passowrd Confirm")
			.located(By.name("confirm_passwordRegisterPage"));
	
	public static final Target FIRST_NAME = Target.the("First Name")
			.located(By.name("first_nameRegisterPage"));
	
	public static final Target LAST_NAME = Target.the("Last Name")
			.located(By.name("last_nameRegisterPage"));
	
	public static final Target PHONE_NUMBER = Target.the("Phone Number")
			.located(By.name("phone_numberRegisterPage"));
	
	public static final Target COUNTRY = Target.the("Country")
			.located(By.name("countryListboxRegisterPage"));
	
	public static final Target CITY = Target.the("City")
			.located(By.name("cityRegisterPage"));
	
	public static final Target ADDRESS = Target.the("Address")
			.located(By.name("addressRegisterPage"));
	
	public static final Target STATE = Target.the("State")
			.located(By.name("state_/_province_/_regionRegisterPage"));
	
	public static final Target POSTAL_CODE = Target.the("Postal Code")
			.located(By.name("postal_codeRegisterPage"));
	
	public static final Target I_AGREE = Target.the("i agree")
			.located(By.name("i_agree"));
	
	public static final Target REGISTER = Target.the("Register")
			.located(By.id("register_btnundefined"));
	
}
