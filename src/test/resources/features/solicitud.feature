# language: es
#Author:Harin Chaverra Coronado
    #Correo:Harin911227@hotmail.com
    #Correo:Harinchc11@gmail.com
@Regresion
Característica: Solicitud de Cotizacion
  Como  usuario de la aplicación Consubanco y que
  Quiero realizar diferentes tareas en su aplicativo
  Requiero realizar la solicitud de Contizacion  en el aplicativo

   @NuevaSolicitudDeCredito
  Esquema del escenario: Generar nueva solicitud de cotizacion exitosa en consubanco promotor
    Dado que abrimos la apk de Consubanco
    Cuando hacemos el inicio de sesion con las credenciales"<usuario>""<clave>"
    Entonces se mostrará la pantalla inicial con la opción “Nueva Solicitud”
    Cuando hacemos clic la opción “Nueva Solicitud”
    Entonces nos abrirá la pantalla del Cotizador
    Cuando seleccionamos una Sucursal, Grupo de convenios y Convenio.
    Entonces al llenar los campos requeridos para realizar una cotización.
    Cuando hacemos click en el botón “Cotizar”
    Entonces redirecciona a la pantalla de “Resultados de cotizaciones”
    Ejemplos:
      | usuario    | clave     |
      | 0010007424 | Promotor1 |