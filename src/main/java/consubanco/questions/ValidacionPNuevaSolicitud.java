package consubanco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static consubanco.usertInterface.BienvenidaPage.BTN_NUEVA_SOLICITUD;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidacionPNuevaSolicitud implements Question<Boolean> {
    public static ValidacionPNuevaSolicitud valida() {
        return new ValidacionPNuevaSolicitud();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_NUEVA_SOLICITUD, isVisible()).forNoMoreThan(20).seconds()
        );

        return BTN_NUEVA_SOLICITUD.resolveFor(actor).isDisplayed();
    }
}
