package com.test.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static com.test.automation.user_interfaces.homePage.USER_SESSION;

public class userInSession implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		actor.attemptsTo(WaitUntil.the(USER_SESSION, isVisible()));
		return USER_SESSION.resolveFor(actor).getText();
	}
	
	public static userInSession Performed() {
		return new userInSession();
	}

}
