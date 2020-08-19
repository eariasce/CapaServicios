package com.everis.base.pageobject;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.cuponatic.com.pe/")
public class CuponaticPage extends PageObject {

    //CUPO1
    @FindBy(id="txtBuscar")
    public WebElementFacade txtProducto;

    @FindBy(xpath = "//*[@id='btnBuscarHome']")
    public WebElementFacade lupa;

    @FindBy(xpath = "//*[@id=\"list\"]/section/article/a/div[1]/img")
    public WebElementFacade imagenProducto;

    @FindBy(xpath = "//*[@id=\"carro-agregar-item\"]/button")
    public WebElementFacade btnAgregarAlCarro;

    @FindBy(xpath = "//*[@id=\"navCarro\"]/li/a/div")
    public WebElementFacade btnMiCarro;

    //CUPO2
    @FindBy(id = "id=\"suscribete\"")
    public WebElementFacade suscribete;

    @FindBy(id = "modalSuscripcion_email")
    public WebElementFacade txtCorreo;

    @FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
    public WebElementFacade captcha;

    @FindBy(xpath = "//*[@id=\"form_suscribir\"]/div[7]/div/label")
    public WebElementFacade terminos;

    @FindBy(id = "modal_suscripcion")
    public WebElementFacade btnSuscribirme;
}
