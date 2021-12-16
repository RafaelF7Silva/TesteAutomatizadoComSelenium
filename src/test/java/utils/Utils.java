package utils;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunTest;

import java.util.Random;

public class Utils extends RunTest {
    public void esperarElemento(By element, Integer tempo){
        WebDriverWait wait = new WebDriverWait (driver,tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

        public String getRamdonEmail(){

        String email_init = "rafael_";
        String email_final = "@teste.com.br";

        Random random = new Random();
        int minimo = 8;
        int maximo = 999999;
        int resultado = random.nextInt(maximo - minimo) + minimo;

        return email_init + resultado + email_final;
        }
}
