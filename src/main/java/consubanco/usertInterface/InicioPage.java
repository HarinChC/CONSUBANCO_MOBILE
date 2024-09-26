package consubanco.usertInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioPage {

    public static final Target TXT_NOMBRE_USUARIO = Target.the("TXT nombre de usuario").
            located(By.id("com.consubanco.ecsb:id/editTextUser"));

    public static final Target TXT_CLAVE_USUARIO = Target.the("TXT clave de usuario").
            located(By.id("com.consubanco.ecsb:id/editTextPass"));

    public static final Target BTN_INICIO_SESION = Target.the("BTN inicio sesion").
            located(By.id("com.consubanco.ecsb:id/btnLogin"));



}
