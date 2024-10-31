package tasks;

import io.cucumber.java.sl.Ter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;
import static userinterfaces.HomePage.BTN_ADD;
import static userinterfaces.HomePage.BTN_RECRUITMENT;

public class TercerTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_ADD,isCurrentlyVisible()).forNoMoreThan(30).seconds(),
                Click.on(BTN_ADD)
        );
    }
    public static TercerTask botonAgregar(){
        return instrumented(TercerTask.class);
    }
}
