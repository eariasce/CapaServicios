package com.everis.base.steps;

import com.everis.base.pageobject.CyberWowPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CyberWowSteps {
    private static final Logger LOGGER = LoggerFactory.getLogger(ClaseDemoSteps.class);

    private CyberWowPage page;

    public void open()
    {
        LOGGER.info("abre pagina de inicio");
        page.open();
    }

    public void escriboNombre(String nombre) {
        page.txtNombre.waitUntilVisible();
        page.txtNombre.sendKeys(nombre);
    }

    public void escriboApellido(String apellido) {
        page.txtApellido.waitUntilVisible();
        page.txtApellido.sendKeys(apellido);
    }

    public void escriboCorreo(String correo) {
        page.txtEmail.waitUntilVisible();
        page.txtEmail.sendKeys(correo);
    }

    public void presionaBotonRegistro() {
        page.registrarme.waitUntilVisible();
        page.registrarme.click();
    }

    public void aceptaTerminosYCondiciones() {
        page.aceptarTerminos.waitUntilVisible();
        page.aceptarTerminos.click();
    }

    public void cierroPopupDeRegistro() {
        page.popupRegistro.waitUntilVisible();
        page.popupRegistro.click();

        page.popupRegistro.waitUntilNotVisible();
    }
}
