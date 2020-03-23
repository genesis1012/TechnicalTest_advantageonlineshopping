package com.test.automation.tasks;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.test.automation.user_interfaces.homePage.USER;
import static com.test.automation.user_interfaces.homePage.CREATE_NEW_ACCOUNT;
import static com.test.automation.user_interfaces.homePage.PRODUCTS_CATALOG;

public class GoTo {

	public static Task registrationPage() {
		return Task.where("Go to registration page",
				WaitUntil.the(USER, isClickable()),
				Click.on(USER),
				Click.on(CREATE_NEW_ACCOUNT)
				);
	}
	
	public static Task CatalogPage(String catalogProduct) {
		return Task.where("Go to catalog page",
				WaitUntil.the(PRODUCTS_CATALOG.of(catalogProduct), isClickable()),
				Click.on(PRODUCTS_CATALOG.of(catalogProduct))
				);
	}
}
