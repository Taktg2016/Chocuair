package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.WebDriver;
import tasks.CuartoTask;
import tasks.PrimerTask;
import tasks.SegundoTask;
import tasks.TercerTask;
import userinterfaces.HomePage;
import utils.ClaseExpandirNavegador;
import utils.ClaseTiempo;

public class StepClass {
    @Managed(driver = "chrome")
    private WebDriver driver;
    private Actor actor = Actor.named("global");
    private HomePage homePage = new HomePage();


    @Given("Se ingresa a la URL de OrangeHRM")
    public void seIngresaALaURLDeOrangeHRM() {
        actor.can(BrowseTheWeb.with(driver));
        actor.wasAbleTo(Open.browserOn(homePage));
        ClaseExpandirNavegador.maximizarNavegador(driver);
        ClaseTiempo.waits(5);
    }

    @And("^Se inicia sesion con el usuario (.*) y contraseña (.*)$")
    public void seIniciaSesionConElUsuarioYContrasena(String usuario, String contrasena) {
    actor.wasAbleTo(PrimerTask.loginUsuario(usuario,contrasena));
    }

    @And("Le doy clic en el apatado de Recruitment")
    public void leDoyClicEnElApatadoDeRecruitment() {
        actor.wasAbleTo(SegundoTask.clicRecruitment());
    }

    @When("Le de clic al botón de agregar")
    public void leDeClicAlBotonDeAgregar() {
        actor.wasAbleTo(TercerTask.botonAgregar());

    }

    @And("^Rellene los campos de primer nombre (.*), segundo nombre (.*), apellido (.*), correo (.*), numero de contacto (.*), palabra clave (.*), nota (.*)$")
    public void relleneLosCamposDePrimerNombreSegundoNombreApellidoCorreoNumeroDeContactoPalabraClaveYNota(String firstname, String middlename, String lastname, String email, String phonenumber, String keyword, String note) {
    actor.wasAbleTo(CuartoTask.diligenciarDatos(firstname, middlename, lastname, email, phonenumber, keyword, note));
    ClaseTiempo.waits(15);
    }

    @And("Le de clic en el botón de guardar")
    public void leDeClicEnElBotonDeGuardar() {

    }

    @Then("Debe de visualizarse el registro guardado de manera exitosa")
    public void debeDeVisualizarseElRegistroGuardadoDeManeraExitosa() {
    }
}

