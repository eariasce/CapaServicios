package com.everis.base.steps;

import com.everis.base.pageobject.CuponaticPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CuponaticSteps {

    private static final Logger LOGGER = LoggerFactory.getLogger(CuponaticSteps.class);

    private CuponaticPage page;

    public void open() {
        LOGGER.info("abre pagina de inicio");
        page.open();
    }

    public void ingresarProducto(String producto) {
        page.txtProducto.sendKeys(producto);
    }

    public void presionarLupa() {
        page.lupa.click();
    }
}
