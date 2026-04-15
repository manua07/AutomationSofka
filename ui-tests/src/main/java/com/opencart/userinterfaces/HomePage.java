package com.opencart.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

        public static final Target PRIMER_PRODUCTO = Target.the("primer producto")
        .located(By.xpath("//a[contains(@href, 'product_id=43')]"));

        public static final Target SEGUNDO_PRODUCTO = Target.the("segundo producto")
        .located(By.xpath("//a[contains(@href, 'product_id=40')]"));

        public static final Target BUTTON_AGREGAR_AL_CARRITO = Target.the("boton agregar al carrito")
        .located(By.id("button-cart"));

        public static final Target BUTTON_HOME_PAGE = Target.the("Boton para ir a home page")
        .located(By.xpath("//a[contains(@href, 'route=common/home')]"));
}
