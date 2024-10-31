#author: Talia Torres
  #language: en
Feature: Validar funcionalidad del apartado Recruitment en la página OrangeRHM
  Scenario Outline: Validar la funcionalidad de agregar candidtao en el apartado Recruitment
    Given Se ingresa a la URL de OrangeHRM
    And Se inicia sesion con el usuario <usuario> y contraseña <contrasena>
    And Le doy clic en el apatado de Recruitment
    When Le de clic al botón de agregar
    And Rellene los campos de primer nombre <primernombre>, segundo nombre <segundonombre>, apellido <apellido>, correo <correo>, numero de contacto <numerocontacto>, palabra clave <palabraclave>, nota <nota>
    And Le de clic en el botón de guardar
    Then Debe de visualizarse el registro guardado de manera exitosa
    Examples:
      | usuario |  | contrasena |  | primernombre |  | segundonombre |  | apellido |  | correo                   |  | numerocontacto |  | palabraclave      |  | nota           |
      | Admin   |  | admin123   |  | Talia        |  | Nombre        |  | Torres   |  | correoprueba@yopmail.com |  | 3212079724     |  | palabra de prueba |  | nota de prueba |

