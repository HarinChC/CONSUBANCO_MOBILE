package consubanco.interactions;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static consubanco.usertInterface.CotizadorPage.BTN_COTIZAR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class IrACotizar implements Task {


    public static IrACotizar ir() {
        return Tasks.instrumented(IrACotizar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_COTIZAR,isClickable()).forNoMoreThan(5).seconds(),
                Click.on(BTN_COTIZAR));

    }


}
