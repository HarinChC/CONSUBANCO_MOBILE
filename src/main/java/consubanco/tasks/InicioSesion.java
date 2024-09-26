package consubanco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static consubanco.usertInterface.InicioPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class InicioSesion implements Task {
    private String usuario;
    private String clave;

    public InicioSesion(String usuario, String Clave) {
        this.usuario = usuario;
        this.clave = Clave;
    }
    public static InicioSesion con(String usuario, String Clave) {
        return Tasks.instrumented(InicioSesion.class, usuario,Clave);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(TXT_NOMBRE_USUARIO, isVisible()).forNoMoreThan(10).seconds(),
              Enter.theValue(usuario).into(TXT_NOMBRE_USUARIO),
              Enter.theValue(clave).into(TXT_CLAVE_USUARIO),
              Click.on(BTN_INICIO_SESION)
        );

    }
}
