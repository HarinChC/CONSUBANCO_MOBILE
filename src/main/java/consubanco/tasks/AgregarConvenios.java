package consubanco.tasks;

import consubanco.interactions.ClickAbajo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Mouse;

import java.awt.event.MouseEvent;

import static consubanco.usertInterface.CotizadorPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarConvenios implements Task {


    public static AgregarConvenios convenio() {
        return Tasks.instrumented(AgregarConvenios.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(LBL_COTIZADOR, isVisible()).forNoMoreThan(15).seconds(),
              Click.on(CBB_SUCURSAL),
                Click.on(SUCURSAL),
                Click.on(CBB_GRUP_CONVENIO),
                Click.on(GRUP_CONVENIO),
                Click.on(CBB_CONVENIO),
                ClickAbajo.ir()
        );

    }
}
