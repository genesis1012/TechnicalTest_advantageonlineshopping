package com.test.automation.user_interfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProductDetailPage extends PageObject{
	
	public static final Target QUANTITY = Target.the("Quantity")
			.located(By.name("quantity"));
	
	public static final Target SAVE_TO_CART = Target.the("save to cart")
			.located(By.name("save_to_cart"));
	
	public static final Target PRODUCT_PRICE = Target.the("Total Price")
			.locatedBy("//*[@id='Description']/h2");
	
	public static final Target PRODUCT_NAME = Target.the("Product Name")
			.locatedBy("//*[@id='Description']/h1");

}
