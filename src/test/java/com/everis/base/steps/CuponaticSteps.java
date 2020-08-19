package com.everis.base.steps;

import com.everis.base.pageobject.CuponaticPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CuponaticSteps {

    private static final Logger LOGGER = LoggerFactory.getLogger(CuponaticSteps.class);

    private CuponaticPage page;

    //CUPO1

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

    public void seleccionarProducto() {
        page.imagenProducto.click();
    }

    public void AgregarCarroCompras() {
        page.btnAgregarAlCarro.click();
    }

    public void visualizarProductoCarroCompras() {
        page.btnMiCarro.click();
    }

    //CUPO2
    public void seleccionarSuscribete() {
        try {
            page.suscribete.click();
        }
        catch(Exception e){
        }
    }

    public void ingresarCorreo(String correo) {
        page.txtCorreo.sendKeys(correo);
    }

    public void seleccionarCaptcha() {
            page.captcha.click();
    }

    public void seleccionarTerminos() {
        page.terminos.click();
    }

    public void presionarBotonSuscribirme() {
        page.btnSuscribirme.click();
    }
}
