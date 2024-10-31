package utils;

import org.openqa.selenium.WebDriver;

public class ClaseExpandirNavegador {
    private ClaseExpandirNavegador(){

    }
    public static void maximizarNavegador(WebDriver driver){
        driver.manage().window().maximize();
    }
}
