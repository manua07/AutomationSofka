package com.opencart.stepdefinitions;

import com.opencart.questions.ConfirmarCompra;
import com.opencart.tasks.AgregarProductos;
import com.opencart.tasks.Checkout;
import com.opencart.tasks.VerCarrito;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.Actor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CompraStepDefinitions {

    private Actor usuario;
    private WebDriver driver;

    @Before
    public void setStage() {
        OnStage.setTheStage(new Cast());

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");

        driver = new ChromeDriver(options);

        usuario = OnStage.theActorCalled("Usuario");
        usuario.can(BrowseTheWeb.with(driver));
    }

    @Given("el usuario abre la pagina de OpenCart")
    public void abrirPagina() {
        usuario.attemptsTo(
            Open.url("http://opencart.abstracta.us/")
        );
    }

    @When("agrega dos productos al carrito")
    public void agregarProductos() {
        usuario.attemptsTo(
            AgregarProductos.alCarrito()
        );
    }

    @And("visualiza el carrito")
    public void verCarrito() {
        usuario.attemptsTo(
            VerCarrito.ver()
        );
    }

    @And("realiza el checkout como invitado")
    public void checkoutInvitado() {
        usuario.attemptsTo(
            Checkout.realizarConDatos(   // ✅ ahora parametrizado
                "Manuela",
                "Acevedo",
                "test@test.com",
                "3214563232",
                "carrera 23 45a-32",
                "Catamarca",
                "030042"
            )
        );
    }

    @Then("la compra se realiza correctamente")
    public void validarCompra() {
        usuario.should(
            seeThat(ConfirmarCompra.exitosa())
        );
    }
}