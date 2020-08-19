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

    @Then("muestra el resultado de la busqueda")
    public void muestraElResultadoDeLaBusqueda() {

    }
}
