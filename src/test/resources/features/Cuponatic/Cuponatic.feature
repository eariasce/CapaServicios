Feature: Busqueda Cuponatic

  @Cupo1
  Scenario: Cliente realiza busqueda en la pagina de Cuponatic
    Given que el cliente accede a la web de Cuponatic
    When el cliente ingresa nombre producto "Televisor"
    And presiona la lupa
    And seleccionar producto
    And agregar a carro de compras
    Then visualizar producto en carro de compras

  @Cupo2
  Scenario: Cliente se suscribe
    Given que el cliente accede a la web de Cuponatic
    When selecciona la opcion Suscribete
    And ingresar correo "pqc@gmail.com"
    And seleccionar captcha
    And seleccionar terminos y condiciones
    Then presionar boton Suscribirme

