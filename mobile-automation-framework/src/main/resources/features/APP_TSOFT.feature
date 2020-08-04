Feature: FLUJOS APP DEMO TSOFT

  @TSOFT_1
  Scenario Outline: Nuevo Registro

    Given   se ingresa a la APP DEMO TSOFT
    When    se ingresa a la opción Registrarse
    And     se ingresan los datos, nombre "<caso_prueba>", id "<caso_prueba>", contraseñas "<caso_prueba>" "<caso_prueba>" y se aceptan los términos
    Then    se da clic en el botón Registrarse y se valida mensaje

    Examples:
      | caso_prueba |
      | 1           |

  @TSOFT_2
  Scenario Outline: Login

    Given   se ingresa a la APP DEMO TSOFT
    When    se ingresa a la opción Iniciar Sesión
    And     se ingresan los datos, usuario "<caso_prueba>" y contraseña "<caso_prueba>"
    Then    se da clic en el botón iniciar y se verifica ingreso

    Examples:
      | caso_prueba |
      | 1           |