package consubanco.interactions;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static consubanco.usertInterface.BienvenidaPage.BTN_NUEVA_SOLICITUD;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class IrNuevaSolicitud implements Task {


    public static IrNuevaSolicitud ir() {
        return Tasks.instrumented(IrNuevaSolicitud.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_NUEVA_SOLICITUD,isClickable()).forNoMoreThan(5).seconds(),
                Click.on(BTN_NUEVA_SOLICITUD));

    }


}
