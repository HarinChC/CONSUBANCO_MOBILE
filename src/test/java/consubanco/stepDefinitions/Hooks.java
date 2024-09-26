package consubanco.stepDefinitions;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hooks {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @After
    public void doAfter(){
      OnStage.drawTheCurtain();
    }
}
