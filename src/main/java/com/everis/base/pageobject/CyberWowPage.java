package com.everis.base.pageobject;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://cyberwow.pe/")
public class CyberWowPage extends PageObject {

    @FindBy(id="name")
    public WebElementFacade txtNombre;

    @FindBy(id="last_name")
    public WebElementFacade txtApellido;

    @FindBy(id="email")
    public WebElementFacade txtEmail;

    @FindBy(xpath="//*[@id=\"form-subscription\"]/div/div[1]/div[2]/div/div/span")
    public WebElementFacade aceptarTerminos;

    @FindBy(xpath = "//*[@id=\"form-subscription\"]/div/div[2]/button")
    public WebElementFacade registrarme;

    @FindBy(xpath = "//*[@id=\"modalConfirmationSubscription\"]/div/div/div/a")
    public WebElementFacade popupRegistro;


}
