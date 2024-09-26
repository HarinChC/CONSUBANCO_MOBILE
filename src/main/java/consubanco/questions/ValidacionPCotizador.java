package consubanco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static consubanco.usertInterface.CotizadorPage.LBL_COTIZADOR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidacionPCotizador implements Question<Boolean> {

    public static ValidacionPCotizador valida() {
        return new ValidacionPCotizador();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(LBL_COTIZADOR, isVisible()).forNoMoreThan(20).seconds()
        );

        return LBL_COTIZADOR.resolveFor(actor).isDisplayed();
    }
}
