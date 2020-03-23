package com.test.automation.step_definitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.is;

import com.test.automation.models.UserPersonalInformation;
import com.test.automation.questions.userInSession;
import com.test.automation.tasks.GoTo;
import com.test.automation.tasks.EnterPersonal;
import com.test.automation.user_interfaces.homePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Steps;

public class RegisterAUserStepDefinition {
	
	@Steps
	UserPersonalInformation user = new UserPersonalInformation();
	
	@Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }
	
	@Given("^I'm on the registration screen$")
	public void i_m_on_the_registration_screen() {
		theActorCalled("Heriberto").wasAbleTo(Open.browserOn().the(homePage.class));
		theActorInTheSpotlight().wasAbleTo(GoTo.registrationPage());
	}

	@When("^Enter the user's personal information$")
	public void enter_the_user_s_personal_information() {
		theActorInTheSpotlight().attemptsTo(EnterPersonal.Information(user));
	}

	@Then("^Successful registration and automatic login$")
	public void successful_registration_and_automatic_login() {
		theActorInTheSpotlight().should(seeThat(userInSession.Performed(), is(user.getUserName())));
	}

}
