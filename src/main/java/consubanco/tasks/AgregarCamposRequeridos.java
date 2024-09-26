package consubanco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static consubanco.usertInterface.CotizadorPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarCamposRequeridos implements Task {


    public static AgregarCamposRequeridos llenar() {
        return Tasks.instrumented(AgregarCamposRequeridos.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(LBL_COTIZADOR, isVisible()).forNoMoreThan(15).seconds(),
              Click.on(RENOVACION_NO),
                Click.on(DESEA_COTIZAR_POR),
                Click.on(COTIZAR_MONTO),
                Clear.field(MONTO),
                Enter.keyValues("50000").into(MONTO)
        );

    }
}
