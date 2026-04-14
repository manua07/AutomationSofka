package com.opencart.tasks;

import com.opencart.userinterfaces.CheckoutPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Checkout implements Task {

    private final String nombre;
    private final String apellido;
    private final String email;
    private final String telefono;
    private final String direccion;
    private final String ciudad;
    private final String codigoPostal;

    public Checkout(String nombre, String apellido, String email, String telefono,
                    String direccion, String ciudad, String codigoPostal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    public static Checkout realizarConDatos(String nombre, String apellido, String email,
                                            String telefono, String direccion,
                                            String ciudad, String codigoPostal) {
        return Tasks.instrumented(Checkout.class, nombre, apellido, email,
                telefono, direccion, ciudad, codigoPostal);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

            Click.on(CheckoutPage.BUTTON_CHECKOUT),
            WaitUntil.the(CheckoutPage.BUTTON_GUEST_CHECKOUT, isVisible()).forNoMoreThan(10).seconds(),
            Click.on(CheckoutPage.BUTTON_GUEST_CHECKOUT),
            Click.on(CheckoutPage.BUTTON_CONTINUAR_ACCOUNT),

            WaitUntil.the(CheckoutPage.INPUT_FIRST_NAME, isVisible()).forNoMoreThan(10).seconds(),

            Enter.theValue(nombre).into(CheckoutPage.INPUT_FIRST_NAME),
            Enter.theValue(apellido).into(CheckoutPage.INPUT_LAST_NAME),
            Enter.theValue(email).into(CheckoutPage.INPUT_EMAIL),
            Enter.theValue(telefono).into(CheckoutPage.INPUT_TELEPHONE),
            Enter.theValue(direccion).into(CheckoutPage.INPUT_ADDRESS1),
            Enter.theValue(ciudad).into(CheckoutPage.INPUT_CITY),
            Enter.theValue(codigoPostal).into(CheckoutPage.INPUT_POST_CODE),

            SelectFromOptions.byValue("10").from(CheckoutPage.INPUT_COUNTRY),
            SelectFromOptions.byValue("157").from(CheckoutPage.INPUT_REGION),

            Click.on(CheckoutPage.BUTTON_CONTINUAR_BILLING),

            WaitUntil.the(CheckoutPage.BUTTON_CONTINUAR_DELIVERY, isVisible()).forNoMoreThan(20).seconds(),
            Click.on(CheckoutPage.BUTTON_CONTINUAR_DELIVERY),

            WaitUntil.the(CheckoutPage.BUTTON_ACEPTAR_TERMINOS, isVisible()).forNoMoreThan(10).seconds(),
            Click.on(CheckoutPage.BUTTON_ACEPTAR_TERMINOS),
            Click.on(CheckoutPage.BUTTON_CONTINUAR_PAYMENT),

            WaitUntil.the(CheckoutPage.CONFIRMAR_ORDEN, isVisible()).forNoMoreThan(10).seconds(),
            Click.on(CheckoutPage.CONFIRMAR_ORDEN)
        );
    }
}