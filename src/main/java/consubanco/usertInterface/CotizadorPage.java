package consubanco.usertInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CotizadorPage {

    public static final Target LBL_COTIZADOR = Target.the("TXT nombre de usuario").
            located(By.xpath("//android.widget.TextView[@text='Cotizador']"));
    public static final Target CBB_SUCURSAL = Target.the("TXT nombre de usuario").
            located(By.id("com.consubanco.ecsb:id/selectorAgreementSucursal"));
    public static final Target SUCURSAL = Target.the("TXT nombre de usuario").
            located(By.id("com.consubanco.ecsb:id/selectorAgreementGroups"));

    public static final Target CBB_GRUP_CONVENIO = Target.the("TXT nombre de usuario").
            located(By.id("com.consubanco.ecsb:id/selectorAgreementGroups"));

    public static final Target GRUP_CONVENIO = Target.the("TXT nombre de usuario").
            located(By.id("com.consubanco.ecsb:id/selectorAgreements"));

    public static final Target CBB_CONVENIO = Target.the("CBO Convenio").
            located(By.id("com.consubanco.ecsb:id/selectorAgreements"));

    public static final Target RENOVACION_NO = Target.the("BTN No requiero renovacion").
            located(By.id("com.consubanco.ecsb:id/buttonNo"));

    public static final Target DESEA_COTIZAR_POR = Target.the("TXT nombre de usuario").
            located(By.id("com.consubanco.ecsb:id/selectorQuoterType"));

    public static final Target COTIZAR_MONTO = Target.the("CBO por monto").
            located(By.id("com.consubanco.ecsb:id/checkBoxSameDiscount"));

    public static final Target MONTO = Target.the("TXT ingresar el monto solicitado").
            located(By.id("com.consubanco.ecsb:id/editTextAmountLoan"));

    public static final Target BTN_COTIZAR = Target.the("BTN Cotizar").
            located(By.id("com.consubanco.ecsb:id/btnNext"));





}
