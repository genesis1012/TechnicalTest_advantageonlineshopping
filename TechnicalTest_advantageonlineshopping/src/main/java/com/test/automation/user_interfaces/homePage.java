package com.test.automation.user_interfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;

@DefaultUrl("https://www.advantageonlineshopping.com")
public class homePage extends PageObject{
	
	@WhenPageOpens
	public void waitUntilMainElementsAppears() {
		getDriver().manage().window().maximize();
	}
		
	public static final Target USER = Target.the("user")
			.located(By.id("menuUser"));
	
	public static final Target CREATE_NEW_ACCOUNT = Target.the("Create new account")
			.located(By.className("create-new-account"));
	
	public static final Target USER_SESSION = Target.the("User Session")
			.locatedBy("//*[@id='menuUserLink']/span");
	
	public static final Target SIGN_OUT = Target.the("Sign Out")
			.locatedBy("//*[@id='loginMiniTitle']/label[@translate='Sign_out']");
	
	public static final Target USER_NAME = Target.the("User Name")
			.located(By.name("username"));
	
	public static final Target PASSWORD = Target.the("Password")
			.located(By.name("password"));
	
	public static final Target SIGN_IN = Target.the("Sign In")
			.located(By.id("sign_in_btnundefined"));
	
	public static final Target PRODUCTS_CATALOG = Target.the("Products Ctalog")
			.locatedBy("//*[text()='{0}']");
	
	public static final Target SHOPPING_CART = Target.the("SHOPPING CART")
			.located(By.id("menuCart"));

}
