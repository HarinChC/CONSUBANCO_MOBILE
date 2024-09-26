# Caso de Prueba CA01: Solicitud de cotizacion en  Consubanco

## Descripción General
Este caso de prueba tiene como objetivo verificar el correcto funcionamiento del flujo de cotización en la aplicación móvil de Consubanco, desde el inicio de sesión hasta la visualización de los resultados de la cotización.

## Precondiciones
* Aplicación Consubanco instalada en el dispositivo.
* Credenciales de acceso válidas:
    * Usuario: 0010007424
    * Contraseña: Promotor1
* Conexión a internet estable.

Para la  ejecucion del proyecto tener presente la modificacion de la ruta appium.app="C:/Users/Harin/IdeaProjects/Consubanco/src/test/resources/app.apk"
que esta ubicada en src\test\resources\serenity.conf

y que 
## Pasos a Seguir
1. **Iniciar Sesión:**
    * Abrir la aplicación Consubanco.
    * Ingresar las credenciales proporcionadas en los campos correspondientes.
    * Tocar el botón "Iniciar sesión" o similar.
2. **Acceder a Nueva Solicitud:**
    * Una vez dentro de la aplicación, ubicar y seleccionar la opción "Nueva Solicitud".
3. **Seleccionar Parámetros de Cotización:**
    * En la pantalla del cotizador, seleccionar los siguientes valores:
        * Sucursal: Consupago Cd. de México, D.F. - Corporativo
        * Grupo de convenios: Educación SNTE
        * Convenio: SNTE SECC. 35, COAHUILA
        * ¿Es una renovación Intercompañia y/o CNCA?: No
        * ¿Cómo desea cotizar?: Por monto
        * Monto: 50000
4. **Realizar la Cotización:**
    * Verificar que todos los campos estén correctamente seleccionados.
    * Tocar el botón "Cotizar".
5. **Validar Resultados:**
    * La aplicación debe redirigir a una pantalla que muestre los resultados de la cotización.
    * Verificar que la información presentada sea coherente con los parámetros ingresados (monto, sucursal, convenio, etc.).

## Datos de la Aplicación
* **Paquete:** com.consubanco.ecsb
* **Actividad Inicial:** com.consubanco.ecsb.ui.activities.SplashActivity

## Resultados Esperados
* La cotización se genera correctamente y se muestran los resultados de manera clara y concisa.
* No se presentan errores durante el proceso.

## Resultados Reales
* (Anotar aquí los resultados obtenidos al ejecutar el caso de prueba, incluyendo cualquier error o desviación del comportamiento esperado)

## Observaciones
* (Añadir cualquier observación relevante, como dificultades encontradas, sugerencias de mejora, etc.)
