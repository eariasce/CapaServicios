package com.everis.base.pageobject;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.cuponatic.com.pe/")
public class CuponaticPage extends PageObject {

    @FindBy(id="txtBuscar")
    public WebElementFacade txtProducto;

    @FindBy(xpath = "//*[@id='btnBuscarHome']")
    //*[@id="btnBuscarHome"]
    public WebElementFacade lupa;

}
