Feature: Registro Cyber Wow

  @CybewWow1
  Scenario: Cliente se registra en la pagina de CyberWow
    Given que el cliente accede a la web de Cyberwow
    When el cliente escribe "Eduardo" de nombre
    And escribe apellido "Arias" en el campo
    And escribe correo electronico "eariasce@everis.com" en el campo
    And acepta terminos y condiciones
    And presiona boton registro
    Then cierro popup de registro