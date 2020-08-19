package com.everis.base.steps;

import com.everis.base.pageobject.CyberWowPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.concurrent.TimeUnit;

public class CyberWowSteps {
    private static final Logger LOGGER = LoggerFactory.getLogger(CyberWowSteps.class);

    private CyberWowPage page;

    public void open()
    {
        LOGGER.info("abre pagina de inicio");
        page.open();
    }

    public void escriboNombre(String nombre) {
        //Por si se demora en cargar
        page.txtNombre.waitUntilVisible();
        //Enviar lo que se escribe
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

        //page.popupRegistro.waitUntilNotVisible(); -> Espera hasta que no este visible
    }

    public void seleccionoTiendaPlazaVea() {
        page.imagenPlazaVea.waitUntilVisible();
        page.imagenPlazaVea.click();
    }

    public void cambioVentana() {
      //  ArrayList<String> tabspage = page.getDriver().getWindowHandles();
       // page.getDriver().switchTo().window(tabspage.get());
       // page.waitFor(6000);
    }

    public void seleccionoNoEnPopupNotificaciones() {
        page.popupNo.waitUntilVisible();
        page.popupNo.click();
    }

    public void realizoBusquedaEnPlazaVea(String texto) {
        page.busquedaPlazaVea.waitUntilVisible();
        page.busquedaPlazaVea.sendKeys(texto);
    }

    public void agregoAlCarrito() {
        page.agregarAlCarrito.waitUntilVisible();
        page.agregarAlCarrito.click();
        page.metodoEntrega.click();
        page.opciondosMetodoEntrega.click();
        page.btnConfirmar.click();
    }

    public void hagoClickEnVerProducto() {
        page.verProducto.waitUntilVisible();
        page.verProducto.click();
    }

    public void cierroPopupDePlazaVea() {
        page.cerrarModal.waitUntilVisible();
        page.cerrarModal.click();
    }
}
