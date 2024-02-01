#language: es
Característica: Login de usuario

  Antecedentes:
    Dado que el usuario ingresa a la pagina web

  Escenario: Login de usuario exitosa

    Cuando el ingrese las credenciales
      | usuario | clave    |
      | Bony    | b123456 |

    Entonces El usuario visualizara un mensaje de bienvenida