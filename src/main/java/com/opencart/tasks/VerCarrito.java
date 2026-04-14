package com.opencart.tasks;

import com.opencart.userinterfaces.CarritoPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class VerCarrito implements Task {

    public static VerCarrito ver() {
        return Tasks.instrumented(VerCarrito.class);
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(CarritoPage.BUTTON_CARRITO),
            Click.on(CarritoPage.OPTION_VER_CARRITO)
        );
    }
}