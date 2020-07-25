package com.everis.base.stepDefinitions;

import com.everis.base.steps.NetflixSteps;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ServicioPruebaSD {

    @Steps
    public NetflixSteps servicio;

    @When("obtiene la lista: {int} de clientes suscritos")
    public void obtieneLaListaDeClientesSuscritos(int arg0) {
        servicio.listUser(arg0);
    }
}
