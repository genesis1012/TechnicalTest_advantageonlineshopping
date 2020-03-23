package com.test.automation.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.test.automation.models.UserPersonalInformation;

import static com.test.automation.user_interfaces.RegisterPage.USER_NAME;
import static com.test.automation.user_interfaces.RegisterPage.EMAIL;
import static com.test.automation.user_interfaces.RegisterPage.PASSWORD;
import static com.test.automation.user_interfaces.RegisterPage.PASSWORD_CONFIRM;
import static com.test.automation.user_interfaces.RegisterPage.FIRST_NAME;
import static com.test.automation.user_interfaces.RegisterPage.LAST_NAME;
import static com.test.automation.user_interfaces.RegisterPage.PHONE_NUMBER;
import static com.test.automation.user_interfaces.RegisterPage.COUNTRY;
import static com.test.automation.user_interfaces.RegisterPage.CITY;
import static com.test.automation.user_interfaces.RegisterPage.ADDRESS;
import static com.test.automation.user_interfaces.RegisterPage.STATE;
import static com.test.automation.user_interfaces.RegisterPage.POSTAL_CODE; 
import static com.test.automation.user_interfaces.RegisterPage.I_AGREE;
import static com.test.automation.user_interfaces.RegisterPage.REGISTER;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class EnterPersonal implements Task{
	
	UserPersonalInformation user;
	
	public EnterPersonal(UserPersonalInformation user ) {
		this.user = user;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(user.getUserName()).into(USER_NAME));
		actor.attemptsTo(Enter.theValue(user.getEmail()).into(EMAIL));
		actor.attemptsTo(Enter.theValue(user.getPassword()).into(PASSWORD));
		actor.attemptsTo(Enter.theValue(user.getPassword()).into(PASSWORD_CONFIRM));
		actor.attemptsTo(Enter.theValue(user.getFirstName()).into(FIRST_NAME));
		actor.attemptsTo(Enter.theValue(user.getLastName()).into(LAST_NAME));
		actor.attemptsTo(Enter.theValue(user.getPhoneNumber()).into(PHONE_NUMBER));
		actor.attemptsTo(SelectFromOptions.byVisibleText(user.getCountry()).from(COUNTRY));
		actor.attemptsTo(Enter.theValue(user.getCity()).into(CITY));
		actor.attemptsTo(Enter.theValue(user.getAddress()).into(ADDRESS));
		actor.attemptsTo(Enter.theValue(user.getState()).into(STATE));
		actor.attemptsTo(Enter.theValue(user.getPostalCode()).into(POSTAL_CODE));
		actor.attemptsTo(Click.on(I_AGREE));
		actor.attemptsTo(Click.on(REGISTER));
	}
	
	public static EnterPersonal Information(UserPersonalInformation user) {
		return instrumented(EnterPersonal.class, user);
	}

}
