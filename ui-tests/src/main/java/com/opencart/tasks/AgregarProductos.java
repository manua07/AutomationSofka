package com.opencart.tasks;

import com.opencart.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class AgregarProductos implements Task {

    public static AgregarProductos alCarrito() {
        return Tasks.instrumented(AgregarProductos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
            Click.on(HomePage.PRIMER_PRODUCTO),
            Click.on(HomePage.BUTTON_AGREGAR_AL_CARRITO),
            Click.on(HomePage.BUTTON_HOME_PAGE),

            Click.on(HomePage.SEGUNDO_PRODUCTO),
            Click.on(HomePage.BUTTON_AGREGAR_AL_CARRITO)
        );
    }
}
