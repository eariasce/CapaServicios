package com.everis.base.stepDefinitions;

import com.everis.base.steps.SwapiSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SwapiSD {

    @Steps
    SwapiSteps swapiSteps;

    @Given("el api esta operativo")
    public void elApiEstaOperativo() {
    }

    @When("obtiene la lista de personajes")
    public void obtieneLaListaDePersonajes() {
        swapiSteps.obtieneLaListaDePersonajes();
    }


    @And("valido que el nombre del elemento {int} de tipo {string} es {string}")
    public void validoQueElNombreDelElementoDeTipoEs(int elemento, String tipo, String valor) {
        swapiSteps.validoNombreElemento(elemento,tipo,valor);
    }

    @Then("valido que la respuesta final obtenida es {int}")
    public void validoQueLaRespuestaFinalObtenidaEs(int respuesta) {
        swapiSteps.validoQueLaRespuestaFinalObtenidaEs(respuesta);
    }

    @When("obtengo la lista {int} de planetas")
    public void obtengoLaListaDePlanetas(int pagina) {
        swapiSteps.obtengoLaListaDePlanetas(pagina);
    }

    @And("valido que el numero de resultados es {int}")
    public void validoQueElNumeroDeResultadosEs(int cantidad) {
        swapiSteps.validoQueElNumeroDeResultadosEs(cantidad);
    }

    @When("obtengo al personaje numero {int}")
    public void obtengoAlPersonajeNumero(int id) {
        swapiSteps.obtengoAlPersonajeNumero(id);
    }

    @And("valido que la pelicula numero {int} es {string}")
    public void validoQueLaPeliculaNumeroEs(int posicion, String nombre) {
        swapiSteps.validoQueLaPeliculaNumeroEs(posicion,nombre);
    }

    @When("obtengo el planeta con id {int}")
    public void obtengoElPersonajeConId(int id) {
        swapiSteps.obtengoElPersonajeConId(id);
    }

    @And("valido que el valor {string} del planeta es {string}")
    public void validoQueElValorDelPlanetaEs(String tipo, String valor) {
        swapiSteps.validoQueElPlanetaEs(tipo, valor);
    }

    @When("obtengo el starship con id {int}")
    public void obtengoElStarshipConId(int id) {
        swapiSteps.obtengoElStarshipConId(id);
    }

    @And("valido que el valor {string} del starship es mayor a {int}")
    public void validoQueElValorDelStarshipEsMayorA(String tipo, int valor) {
        swapiSteps.validoQueElValorDelStarshipEsMayorA(tipo,valor);
    }
}
