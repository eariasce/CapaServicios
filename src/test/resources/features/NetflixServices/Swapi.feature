@swapi
Feature: Api de starwars para el uso multiplataforma

  @scenario1sw
  Scenario: Usuario obtiene la lista de personaje
    Given el api esta operativo
    When obtiene la lista de personajes
    And valido que el nombre del elemento 3 de tipo "height" es "202"
    Then valido que la respuesta final obtenida es 200

  @scenario2sw
  Scenario: Obtener la lista de planetas de una pagina y validar cantidad
    Given el api esta operativo
    When obtengo la lista 4 de planetas
    And valido que el numero de resultados es 10
    Then valido que la respuesta final obtenida es 200

  @scenario3sw
  Scenario: Obtenre la lista de un personaje especifico y valida campo
    Given el api esta operativo
    When obtengo al personaje numero 3
    And valido que la pelicula numero 2 es "http://swapi.dev/api/films/3/"
    Then valido que la respuesta final obtenida es 200

  @scenario4sw
  Scenario: Obtener un personaje y validar el nombre
    Given el api esta operativo
    When obtengo el planeta con id 3
    And valido que el valor "diameter" del planeta es "10200"
    Then valido que la respuesta final obtenida es 200

  @scenario5sw
  Scenario: Obtener un personaje y validar el nombre
    Given el api esta operativo
    When obtengo el starship con id 9
    And valido que el valor "length" del starship es mayor a 10000
    Then valido que la respuesta final obtenida es 200

