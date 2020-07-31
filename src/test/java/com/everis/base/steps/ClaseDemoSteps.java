package com.everis.base.steps;

import com.everis.base.pageobject.MercadoLibrePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClaseDemoSteps {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClaseDemoSteps.class);

    public MercadoLibrePage page;
    public void ingresoEdad(int edad) {
        LOGGER.info("ingreso la edadd");
        page.btnCrearCuenta.click();
    }
}
