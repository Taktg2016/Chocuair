package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;
import static userinterfaces.HomePage.BTN_RECRUITMENT;

public class SegundoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_RECRUITMENT,isCurrentlyVisible()).forNoMoreThan(30).seconds(),
                Click.on(BTN_RECRUITMENT)
        );
    }
    public static SegundoTask clicRecruitment(){
        return instrumented(SegundoTask.class);
    }
}
