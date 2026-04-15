package com.opencart.userinterfaces;
import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoPage {

        public static final Target BUTTON_CARRITO = Target.the("boton carrito")
        .located(By.id("cart-total"));

        public static final Target OPTION_VER_CARRITO = Target.the("opcion ver carrito")
        .located(By.xpath("//a[contains(@href, 'route=checkout/cart')]"));
}
