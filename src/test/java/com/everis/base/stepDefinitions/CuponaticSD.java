package com.everis.base.stepDefinitions;

import com.everis.base.steps.CuponaticSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CuponaticSD {

    @Steps
    CuponaticSteps cuponaticSteps;

    //CUPO1

    @Given("que el cliente accede a la web de Cuponatic")
    public void queElClienteAccedeALaWebDeCuponatic() {
        cuponaticSteps.open();
    }

    @When("el cliente ingresa nombre producto {string}")
    public void elClienteIngresaNombreProducto(String producto) {
        cuponaticSteps.ingresarProducto(producto);
    }

    @And("presiona la lupa")
    public void presionaLaLupa() {
        cuponaticSteps.presionarLupa();
    }

    @And("seleccionar producto")
    public void seleccionarProducto() {
        cuponaticSteps.seleccionarProducto();
    }

    @And("agregar a carro de compras")
    public void agregarACarroDeCompras() {
        cuponaticSteps.AgregarCarroCompras();
    }

    @Then("visualizar producto en carro de compras")
    public void visualizarProductoEnCarroDeCompras() {
        cuponaticSteps.visualizarProductoCarroCompras();
    }

    //CUPO2
    @When("selecciona la opcion Suscribete")
    public void seleccionaLaOpcionSuscribete() {
        cuponaticSteps.seleccionarSuscribete();
    }

    @And("ingresar correo {string}")
    public void ingresarCorreo(String correo) {
        cuponaticSteps.ingresarCorreo(correo);
    }

    @And("seleccionar captcha")
    public void seleccionarCaptcha() {
        cuponaticSteps.seleccionarCaptcha();
    }

    @And("seleccionar terminos y condiciones")
    public void seleccionarTerminosYCondiciones() {
        cuponaticSteps.seleccionarTerminos();
    }

    @Then("presionar boton Suscribirme")
    public void presionarBotonSuscribirme() {
        cuponaticSteps.presionarBotonSuscribirme();
    }
}
