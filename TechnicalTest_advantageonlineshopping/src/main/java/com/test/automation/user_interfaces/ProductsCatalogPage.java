package com.test.automation.user_interfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProductsCatalogPage extends PageObject{
	
	public static final Target PRODUCT_NAME = Target.the("Product Name")
			.located(By.className("productName"));
	
	@SuppressWarnings("static-access")
	public static final Target PRODUCT_NAMET = PRODUCT_NAME.the("TEST")
			.locatedBy("//*[text()='{0}']");

}
