package com.test.automation.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.test.automation.user_interfaces.ProductsCatalogPage.PRODUCT_NAMET;
import static com.test.automation.user_interfaces.ProductDetailPage.QUANTITY;
import static com.test.automation.user_interfaces.ProductDetailPage.SAVE_TO_CART;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class BuyThe implements Task{
	
	private String productName;
	private Integer quantity;
	
	public BuyThe(String ProductName, Integer Quantity) {
		this.productName = ProductName;
		this.quantity = Quantity;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(PRODUCT_NAMET.of(productName)));
		actor.attemptsTo(Enter.theValue(quantity.toString()).into(QUANTITY));
		actor.attemptsTo(Click.on(SAVE_TO_CART));
		
	}
	
	public static BuyThe product(String productName, int quantity) {
		return instrumented(BuyThe.class, productName, quantity);
	}

}
