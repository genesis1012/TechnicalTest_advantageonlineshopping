package com.test.automation.step_definitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.is;

import com.test.automation.questions.productAddedToShoppingCart;
import com.test.automation.questions.shoppingCartDetail;
import com.test.automation.tasks.BuyThe;
import com.test.automation.tasks.GoTo;
import com.test.automation.user_interfaces.homePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AddProductToShoppingCartStepDefinition {
	
	private Integer quantity;
	private String productName;
	
	@Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }
	
	@Given("^I am in the (.*) catalog$")
	public void i_am_in_the_catalog(String catalogProduct) {
		theActorCalled("Heriberto").wasAbleTo(Open.browserOn().the(homePage.class));
		theActorInTheSpotlight().wasAbleTo(GoTo.CatalogPage(catalogProduct));
	}
	
	@When("^Buy the product (.*) with quantity (.*)$")
	public void buy_the_product_with_quantity(String productName, Integer quantity) {
		this.productName = productName;
		this.quantity = quantity;
		theActorInTheSpotlight().attemptsTo(BuyThe.product(productName, quantity));
	}
	@Then("^The product added to the shopping cart must be with the selected quantity and the total value\\.$")
	public void the_product_added_to_the_shopping_cart_must_be_with_the_selected_quantity_and_the_total_value() {
		theActorInTheSpotlight().should(seeThat(productAddedToShoppingCart.Performed(quantity), is(true)));
		theActorInTheSpotlight().should(seeThat(shoppingCartDetail.Quantity(), is(quantity.toString())));
		theActorInTheSpotlight().should(seeThat(shoppingCartDetail.ProductName(), is(productName.toUpperCase())));
	}

}
