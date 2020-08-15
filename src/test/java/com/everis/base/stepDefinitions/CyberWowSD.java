package com.everis.base.stepDefinitions;

import com.everis.base.steps.CyberWowSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CyberWowSD {

    @Steps
    CyberWowSteps cyberWowSteps;

    @Given("que el cliente accede a la web de Cyberwow")
    public void queElClienteAccedeALaWebDeCyberwow() {
        cyberWowSteps.open();
    }

    @When("el cliente escribe {string} de nombre")
    public void elClienteEscribeDeNombre(String nombre) {
        cyberWowSteps.escriboNombre(nombre);
    }

    @And("escribe apellido {string} en el campo")
    public void escribeApellidoEnElCampo(String apellido) {
        cyberWowSteps.escriboApellido(apellido);
    }

    @And("escribe correo electronico {string} en el campo")
    public void escribeCorreoElectronicoEnElCampo(String correo) {
        cyberWowSteps.escriboCorreo(correo);
    }

    @And("acepta terminos y condiciones")
    public void aceptaTerminosYCondiciones() {
        cyberWowSteps.aceptaTerminosYCondiciones();
    }

    @Then("presiona boton registro")
    public void presionaBotonRegistro() {
        cyberWowSteps.presionaBotonRegistro();
    }

    @Then("cierro popup de registro")
    public void cierroPopupDeRegistro() {
        cyberWowSteps.cierroPopupDeRegistro();

    }
}
