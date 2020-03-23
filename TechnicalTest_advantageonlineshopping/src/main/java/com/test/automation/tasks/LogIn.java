package com.test.automation.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.test.automation.user_interfaces.homePage.USER_NAME;
import static com.test.automation.user_interfaces.homePage.PASSWORD;
import static com.test.automation.user_interfaces.homePage.SIGN_IN;
import static com.test.automation.user_interfaces.homePage.USER;

import com.test.automation.models.UserPersonalInformation;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LogIn implements Task{
	
	private UserPersonalInformation User;
	
	public LogIn(UserPersonalInformation user) {
		this.User = user;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(USER),
				Enter.theValue(User.getUserName()).into(USER_NAME),
				Enter.theValue(User.getPassword()).into(PASSWORD));
		actor.attemptsTo(Click.on(SIGN_IN));
	}
	
	public static LogIn whit(UserPersonalInformation user) {
		return instrumented(LogIn.class, user);
	}

}
