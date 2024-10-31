package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;
import static userinterfaces.HomePage.*;

public class PrimerTask implements Task {
    protected String username;
    protected String password;
    public PrimerTask(String username, String password){
        this.username= username;
        this.password= password;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LBL_USUARIO,isCurrentlyVisible()).forNoMoreThan(30).seconds(),
                Enter.theValue(username).into(LBL_USUARIO),
                Enter.theValue(password).into(LBL_PASSWORD),
                Click.on(BTN_LOGIN)
        );
    }
    public static PrimerTask loginUsuario(String username, String password){
        return instrumented(PrimerTask.class, username, password);
    }

}
