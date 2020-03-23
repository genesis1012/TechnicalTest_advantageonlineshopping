package com.test.automation.step_definitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.is;

import com.test.automation.models.UserPersonalInformation;
import com.test.automation.questions.userInSession;
import com.test.automation.tasks.Closed;
import com.test.automation.tasks.EnterPersonal;
import com.test.automation.tasks.GoTo;
import com.test.automation.tasks.LogIn;
import com.test.automation.user_interfaces.homePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Steps;

public class LogInStepDefinition {
	
	@Steps
	UserPersonalInformation user = new UserPersonalInformation();
	
	@Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }
	
	@Given("^Register a user$")
	public void register_a_user() {
		theActorCalled("Heriberto").wasAbleTo(Open.browserOn().the(homePage.class));
		theActorInTheSpotlight().wasAbleTo(GoTo.registrationPage());
		theActorInTheSpotlight().wasAbleTo(EnterPersonal.Information(user));
		theActorInTheSpotlight().should(seeThat(userInSession.Performed(), is(user.getUserName())));
	}
	
	@Given("^Close session$")
    public void close_session() {
		 theActorInTheSpotlight().wasAbleTo(Closed.session());
    }


    @When("^Enter the registered user and password$")
    public void enter_the_registered_user_and_password() {
    	theActorInTheSpotlight().attemptsTo(LogIn.whit(user));
    }

    @Then("^Successful login$")
    public void successful_login() {
    	theActorInTheSpotlight().should(seeThat(userInSession.Performed(), is(user.getUserName())));
    }

}
