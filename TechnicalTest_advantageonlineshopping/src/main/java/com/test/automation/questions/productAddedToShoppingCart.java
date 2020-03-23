package com.test.automation.questions;

import static com.test.automation.user_interfaces.ProductDetailPage.PRODUCT_PRICE;
import static com.test.automation.user_interfaces.homePage.SHOPPING_CART;
import static com.test.automation.user_interfaces.ShoppingCartPage.TOTAL_PRICE;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

public class productAddedToShoppingCart implements Question<Boolean>{
	
	private Integer quantity;
	private Double ProductPrice;
	private Double totalPrice;
	
	public productAddedToShoppingCart(Integer Quantity) {
		this.quantity = Quantity;
	}
	
	@Override
	public Boolean answeredBy(Actor actor) {
		this.ProductPrice = Double.parseDouble(PRODUCT_PRICE.resolveFor(actor).getText().toString().substring(1));
		this.totalPrice = quantity * ProductPrice;
		actor.attemptsTo(Click.on(SHOPPING_CART));
		this.ProductPrice = Double.parseDouble(TOTAL_PRICE.resolveFor(actor).getText().substring(1));
		return ProductPrice.equals(totalPrice);
	}
	
	public static productAddedToShoppingCart Performed(Integer quantity) {
		return new productAddedToShoppingCart(quantity);
	}

}
