package consubanco.stepDefinitions;

import consubanco.interactions.IrACotizar;
import consubanco.interactions.IrNuevaSolicitud;
import consubanco.questions.ValidacionPCotizador;
import consubanco.questions.ValidacionPNuevaSolicitud;
import consubanco.questions.ValidacionPResulCotizaciones;
import consubanco.tasks.AgregarCamposRequeridos;
import consubanco.tasks.AgregarConvenios;
import consubanco.tasks.InicioSesion;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SolicitudStepDefinitions {
    @Managed(driver = "Appium")
    public WebDriver DriverMovil;

    @Dado("^que abrimos la apk de Consubanco$")
    public void queAbrimosLaApkDeConsubanco() {
        OnStage.theActorCalled("usuario").can(BrowseTheWeb.with(DriverMovil));
    }

    @Cuando("^hacemos el inicio de sesion con las credenciales\"([^\"]*)\"\"([^\"]*)\"$")
    public void hacemosElInicioDeSesionConLasCredenciales(String usuario, String clave) throws InterruptedException {
        OnStage.theActorInTheSpotlight().attemptsTo(
                InicioSesion.con(usuario, clave));
    }

    @Entonces("^se mostrará la pantalla inicial con la opción “Nueva Solicitud”$")
    public void seMostraráLaPantallaInicialConLaOpciónNuevaSolicitud() throws InterruptedException {
        OnStage.theActorInTheSpotlight().should(
                seeThat(ValidacionPNuevaSolicitud.valida()));
            }

    @Cuando("^hacemos clic la opción “Nueva Solicitud”$")
    public void hacemosClicLaOpciónNuevaSolicitud() {
       OnStage.theActorInTheSpotlight().attemptsTo(
               IrNuevaSolicitud.ir()
       );

    }

    @Entonces("^nos abrirá la pantalla del Cotizador$")
    public void nosAbriráLaPantallaDelCotizador() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(ValidacionPCotizador.valida()));


    }

    @Cuando("^seleccionamos una Sucursal, Grupo de convenios y Convenio\\.$")
    public void seleccionamosUnaSucursalGrupoDeConveniosYConvenio() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AgregarConvenios.convenio());
    }

    @Entonces("^al llenar los campos requeridos para realizar una cotización\\.$")
    public void alLlenarLosCamposRequeridosParaRealizarUnaCotización() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AgregarCamposRequeridos.llenar());


    }

    @Cuando("^hacemos click en el botón “Cotizar”$")
    public void hacemosClickEnElBotónCotizar() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IrACotizar.ir()
        );
    }

    @Entonces("^redirecciona a la pantalla de “Resultados de cotizaciones”$")
    public void redireccionaALaPantallaDeResultadosDeCotizaciones() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(ValidacionPResulCotizaciones.valida()));


    }

}
