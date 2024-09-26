package consubanco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static consubanco.usertInterface.ResultadoCotizacionesPage.LBL_RESULTADO_COTIZACIONES;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidacionPResulCotizaciones implements Question<Boolean> {

    public static ValidacionPResulCotizaciones valida() {
        return new ValidacionPResulCotizaciones();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(LBL_RESULTADO_COTIZACIONES, isVisible()).forNoMoreThan(20).seconds()
        );

        return LBL_RESULTADO_COTIZACIONES.resolveFor(actor).isDisplayed();
    }
}
