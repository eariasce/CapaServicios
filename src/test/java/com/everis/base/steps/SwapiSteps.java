package com.everis.base.steps;

import io.cucumber.java.Before;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import io.vavr.control.Try;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class SwapiSteps {

    private static final Logger LOGGER = LoggerFactory.getLogger(SwapiSteps.class);
    static private final String BASE_URL = "https://swapi.dev/api/";

    private static RequestSpecification requestSpec;
    private static ResponseSpecification responseSpec;

    private Response response;
    //private RequestSpecBuilder builder;
    //private RequestSpecification requestSpecification;
    //private String bodyPost;

    @Before
    public void init() {

        LOGGER.info(" Inicializa el constructor request ");
        requestSpec = new RequestSpecBuilder()
                .setBaseUri(BASE_URL)
                .build();

        LOGGER.info(" Inicializa el constructor response ");
        responseSpec = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectContentType(ContentType.JSON)
                .build();
    }

    public void obtieneLaListaDePersonajes() {
        response = given().log().all().spec(requestSpec).when().get("people").then()
                .contentType(ContentType.JSON).extract().response();
    }

    public void validoNombreElemento(int elemento, String tipo, String valor) {
        List<Map<String,String>> personajes = response.jsonPath().getList("results");


        assertThat(personajes.get(elemento).get(tipo), is(valor));
    }

    public void validoQueLaRespuestaFinalObtenidaEs(int respuesta) {

        assertThat(lastResponse().statusCode(), is(respuesta));
    }

    public void obtengoLaListaDePlanetas(int pagina) {
        response = given().log().all().spec(requestSpec).queryParam("page", pagina)
                .when().get("planets").then().contentType(ContentType.JSON).extract().response();
    }

    public void validoQueElNumeroDeResultadosEs(int cantidad) {
        assertThat( response.jsonPath().getList("results").size(), is(cantidad));
    }

    public void obtengoAlPersonajeNumero(int id) {
        response = given().spec(requestSpec).pathParam("id", id).when().get("people/{id}").
                then().contentType((ContentType.JSON)).extract().response();
    }

    public void validoQueLaPeliculaNumeroEs(int posicion, String valor) {
        List<String> films = response.jsonPath().getList("films");

        assertThat(films.get(posicion), is(valor));
    }

    public void obtengoElPersonajeConId(int id) {
        response = given().spec(requestSpec).pathParam("id", id).when().get("planets/{id}").
                then().contentType((ContentType.JSON)).extract().response();
    }

    public void validoQueElPlanetaEs(String tipo, String valor) {
        assertThat(lastResponse().getBody().path(tipo), is(valor));
    }

    public void obtengoElStarshipConId(int id) {
        response = given().spec(requestSpec).pathParam("id", id).when().get("starships/{id}").
                then().contentType((ContentType.JSON)).extract().response();
    }

    public void validoQueElValorDelStarshipEsMayorA(String tipo, int valor) {

        if( Integer.parseInt(lastResponse().getBody().path(tipo).toString()) < valor)
        {
            //Pasa la prueba

        }
        else
        {
            //Falla prueba
        }

    }
}
