@Servicios
Feature: Apis de Netflix para consumo masivo

  Background:
    Given que la aplicación esta operativa
  @t1
  Scenario: Operador lista clientes de Netflix
    #When obtiene la lista: 2 de clientes suscritos
    And obtengo la pagina numero 2
    Then valida que la respuesta es 200

  @t2
  Scenario: Operador no encuentra cliente en la lista
    When obtiene al cliente: 23 suscrito
    Then valida que la respuesta es 404

  @t3
  Scenario: Operador valida su correo
    Given que la aplicación esta operativa
    When obtiene al cliente: 3 suscrito
    Then valida que el correo es "emma.wong@reqres.in"

  @t4
  Scenario: Obtener lista como objeto java
    When obtiene la lista: 1 de clientes suscritos como objeto
    Then valida que la respuesta es 200

  @t5
  Scenario Outline: Obtener un cliente especifico y comparar el campo nombre y apellido y finalmente la respuesta obtenida
    When obtiene al cliente: <id> suscrito
    Then valida que el nombre es "<nombre>"
    Then valida que el apellido es "<apellido>"
    Then valida que la respuesta es 200

    Examples:
    | id | nombre | apellido |
    | 12 | Rachel | Howell   |


    @t6
    Scenario: Insertar un cliente en el servicio
      And inicializo request en post
      And agrega la cabecera key: "Content-Type", y valor: "application/json;charset=UTF-8"
      And inserto los valores del cliente con nombre "Juan" y trabajo "QA"
      And ejecuta la creacion "api/users"
      Then valida que la respuesta es 201
      And valida el "name" sea "Juan"
      And valida el "job" sea "QA"
