package com.test.automation.questions;

import static com.test.automation.user_interfaces.ShoppingCartPage.PRODUCT_NAME;
import static com.test.automation.user_interfaces.ShoppingCartPage.QUANTITY;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class shoppingCartDetail {
	
	public static Question<String> ProductName() {
        return actor -> Text.of(PRODUCT_NAME).viewedBy(actor).asString();
    }
	
	public static Question<String> Quantity() {
        return actor -> Text.of(QUANTITY).viewedBy(actor).asString();
    }

}
