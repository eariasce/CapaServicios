package com.everis.base.stepDefinitions;

import com.everis.base.steps.ClaseDemoSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class ClaseDemoSD {

    public ClaseDemoSteps steps;

    @Given("cualquier cosa")
    public void meEncuentroEnLaPaginaDeLinio() {

    }

    @And("escribo segundo nombre de usuario {string}")
    public void escriboSegundoNombreDeUsuario(String segundonombre) {

    }

    @And("escribo segundo nombre de usuario {int}")
    public void escriboSegundoNombreDeUsuario(int edad) {
        steps.ingresoEdad(edad);
    }
}
