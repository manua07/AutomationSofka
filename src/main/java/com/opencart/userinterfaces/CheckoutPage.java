package com.opencart.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutPage {
    
        public static final Target MENSAJE_CONFIRMACION = Target.the("mensaje de confirmacion")
        .located(By.id("content"));

        public static final Target BUTTON_CHECKOUT = Target.the("boton checkout")
        .located(By.xpath("//a[contains(@href, 'route=checkout/checkout')]"));

        public static final Target BUTTON_GUEST_CHECKOUT = Target.the("boton checkout guess")
        .located(By.xpath("//label[contains(., 'Guest Checkout')]"));

        public static final Target INPUT_FIRST_NAME = Target.the("campo primer nombre")
        .located(By.id("input-payment-firstname"));
        
        public static final Target INPUT_LAST_NAME = Target.the("campo apellido")
        .located(By.id("input-payment-lastname"));

        public static final Target INPUT_EMAIL= Target.the("campo email")
        .located(By.id("input-payment-email"));

        public static final Target INPUT_TELEPHONE= Target.the("campo telefono")
        .located(By.id("input-payment-telephone"));

        public static final Target INPUT_ADDRESS1= Target.the("campo direccion 1")
        .located(By.id("input-payment-address-1"));

        public static final Target INPUT_CITY= Target.the("campo ciudad")
        .located(By.id("input-payment-city"));

        public static final Target INPUT_POST_CODE= Target.the("campo codigo postal")
        .located(By.id("input-payment-postcode"));

        public static final Target INPUT_COUNTRY= Target.the("campo pais")
        .located(By.id("input-payment-country"));

        public static final Target INPUT_REGION= Target.the("campo region")
        .located(By.id("input-payment-zone"));

        public static final Target BUTTON_CONTINUAR_ACCOUNT = Target.the("boton continuar cuenta")
        .located(By.id("button-account"));

        public static final Target BUTTON_CONTINUAR_BILLING = Target.the("boton continuar pagos")
        .located(By.id("button-guest"));

        public static final Target BUTTON_CONTINUAR_DELIVERY = Target.the("boton continuar envios")
        .located(By.id("button-shipping-method"));

        public static final Target BUTTON_ACEPTAR_TERMINOS = Target.the("opcion aceptar terminos")
        .located(By.name("agree"));

        public static final Target BUTTON_CONTINUAR_PAYMENT = Target.the("boton continuar metodo de pago")
        .located(By.id("button-payment-method"));

        public static final Target CONFIRMAR_ORDEN = Target.the("boton confirmar orden")
        .located(By.id("button-confirm"));

    public class MENSAJE_CONFIRMACION {
    }
}
