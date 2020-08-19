Feature: Busqueda Cuponatic

  @Cupo1
  Scenario: Cliente realiza busqueda en la pagina de Cuponatic
    Given que el cliente accede a la web de Cuponatic
    When el cliente ingresa nombre producto "Televisor"
    Then presiona la lupa
