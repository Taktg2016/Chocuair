package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.nio.file.Path;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static userinterfaces.HomePage.*;

public class CuartoTask implements Task {
    protected String firstname;
    protected String middlename;
    protected String lastname;
    protected String email;
    protected String phonenumber;
    protected String keyword;
    protected String note;


    public CuartoTask(String firstname, String middlename, String lastname, String email, String phonenumber, String keyword, String note){
        this.firstname= firstname;
        this.middlename= middlename;
        this.lastname= lastname;
        this.email= email;
        this.phonenumber= phonenumber;
        this.keyword= keyword;
        this.note= note;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LBL_NOMBRE,isCurrentlyVisible()).forNoMoreThan(50).seconds(),
                Enter.theValue(firstname).into(LBL_NOMBRE),
                Enter.theValue(middlename).into(LBL_MIDDLENAME),
                Enter.theValue(lastname).into(LBL_LASTNAME),
                Enter.theValue(email).into(LBL_EMAIL),
                Enter.theValue(phonenumber).into(LBL_CONTACTNUMBER),
                Enter.theValue(keyword).into(LBL_KEYWORD),
                Upload.theFile(Path.of(uploadfile)).to(BTN_UPLOAD),
                Enter.theValue(note).into(LBL_MESSAGE),
                Click.on(BTN_OPTIONS),
                Hit.the(Keys.ARROW_DOWN).into(BTN_FIRSTOPTION),
                Click.on(BTN_FIRSTOPTION),
                Click.on(BTN_ACCEPT),
               WaitUntil.the(BTN_SAVE,isPresent()).forNoMoreThan(50).seconds(),
               // SelectFromOptions.byVisibleText("QA engineer").from(SELECT_OPTIONS),
                Click.on(BTN_SAVE)
                      );
    }
    public static CuartoTask diligenciarDatos(String firstname, String middlename, String lastname, String email, String phonenumber, String keyword, String note){
        return instrumented(CuartoTask.class, firstname, middlename, lastname, email, phonenumber, keyword, note);
    }
}
