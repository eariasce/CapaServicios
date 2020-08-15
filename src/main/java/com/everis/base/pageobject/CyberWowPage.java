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

    @FindBy(xpath = "//div[@class='modal fade show']//a[@class='btn btn-close close']")
    public WebElementFacade popupRegistro;

    @FindBy(xpath = "//a[@href=\"https://www.plazavea.com.pe/\"]")
    public WebElementFacade imagenPlazaVea;

    //Plaza Vea
    @FindBy(id = "onesignal-slidedown-cancel-button")
    public WebElementFacade popupNo;

    @FindBy(id = "search_box")
    public WebElementFacade busquedaPlazaVea;

    @FindBy(xpath = "//img[@class=\"CustomModal__close\"]")
    public WebElementFacade cerrarModal;

    @FindBy(xpath = " //*[@id=\"search\"]/div[2]/div[2]/div/div/div[1]/div[2]/div/div/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/a")
    public WebElementFacade verProducto;

    @FindBy(id = "ProductCard__add-to-cart")
    public WebElementFacade agregarAlCarrito;

     @FindBy(xpath = "//*[@id=\"header-root\"]/header/div[2]/div/div[1]/div/div[1]/div[1]/select")
    public WebElementFacade metodoEntrega;


    @FindBy(xpath = "//*[@id=\"header-root\"]/header/div[2]/div/div[1]/div/div[1]/div[1]/select/option[3]")
    public WebElementFacade opciondosMetodoEntrega;


    @FindBy(xpath = "//*[@id=\"header-root\"]/header/div[2]/div/div[1]/div/div[2]/button")
    public WebElementFacade btnConfirmar;


}
