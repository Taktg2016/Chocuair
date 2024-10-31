package userinterfaces;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
public class HomePage extends PageObject {
public static final Target LBL_USUARIO = Target.the("Elemento para ingresar el usuario").locatedBy("//input[@name=\"username\"]");
public static final Target LBL_PASSWORD = Target.the("Elemento para digitar la contraseña").locatedBy("//input[@name=\"password\"]");
public static final Target BTN_LOGIN= Target.the("Botón para iniciar sesión").locatedBy("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]");
public static final Target BTN_RECRUITMENT= Target.the("Botón para redirigir al usuario al módulo de recruitment").locatedBy("//a[@href=\"/web/index.php/recruitment/viewRecruitmentModule\"]");
public static final Target BTN_ADD= Target.the("Botón de agregar candidato").locatedBy("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]");
public static final Target LBL_NOMBRE= Target.the("Elemento para digitar el primer nombre").locatedBy("//input[@name=\"firstName\"]");
public static final Target LBL_MIDDLENAME= Target.the("Elemento para digitar el segundo nombre").locatedBy("//input[@name=\"middleName\"]");
public static final Target LBL_LASTNAME = Target.the("Elemento para digitar el apellido").locatedBy("//input[@name=\"lastName\"]");
public static final Target SELECT_OPTIONS = Target.the("Elemento para seleccionar las opciones").locatedBy("//div[@id='app']/div/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div/div\n" +
        " ");
public static final Target LBL_EMAIL = Target.the("Elemento para escribir el campo email").locatedBy("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]");
public static final Target LBL_CONTACTNUMBER= Target.the("Elemento para escribir el campo de número telefónico").locatedBy("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[2]/input[1]");
public static final Target BTN_UPLOAD= Target.the("Elemento para subir el archivo").locatedBy("//input[@type=\"file\"]");
public static final Target LBL_KEYWORD= Target.the("Elemento para escribir la palabra clave").locatedBy("//input[@placeholder=\"Enter comma seperated words...\"]");
public static final Target LBL_MESSAGE= Target.the("Elemento para escribir un mensaje").locatedBy("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[6]/div[1]/div[1]/div[1]/div[2]/textarea[1]");
public static final Target BTN_ACCEPT= Target.the("Elemento para selecciona el check de aceptar").locatedBy("//i[@class=\"oxd-icon bi-check oxd-checkbox-input-icon\"]");
public static final Target BTN_SAVE= Target.the("Elemento para guardar registro").locatedBy("//button[@type=\"submit\"]");
public static final Target BTN_OPTIONS= Target.the("Elemento para seleccionar las opciones").locatedBy("//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]");
public static final Target BTN_FIRSTOPTION= Target.the("Elemento para seleccionar la opción").locatedBy("//div[@class=\"oxd-select-wrapper\"]//div[@tabindex=\"0\"]");
public static final String uploadfile = System.getProperty("user.dir") + "./src/test/resources/data/Reto Técnico Analista pruebas generalista con automatización.pdf";
}
