package com.test.automation.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.test.automation.user_interfaces.homePage.USER;
import static com.test.automation.user_interfaces.homePage.SIGN_OUT;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Closed implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.wasAbleTo(
				Click.on(USER),
				Click.on(SIGN_OUT));
	}
	
	public static Closed session() {
		return instrumented(Closed.class);
	}

}
