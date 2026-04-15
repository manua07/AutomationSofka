package com.opencart.questions;

import com.opencart.userinterfaces.CheckoutPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ConfirmarCompra implements Question<Boolean> {

    public static ConfirmarCompra exitosa() {
        return new ConfirmarCompra();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String mensaje = Text.of(CheckoutPage.MENSAJE_CONFIRMACION)
                        .answeredBy(actor);

        return mensaje.contains("Your order has been placed!");
    }
}
