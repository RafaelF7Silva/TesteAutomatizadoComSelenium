package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Utils;

public class LoginPage extends Utils {

    WebDriver driver;
    private By emailCriado = By.id("email_create");
    private By emailButton = By.id("SubmitCreate");


    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }
    public void acessarTelaLogin(){
            driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
            esperarElemento(emailCriado,20);
    }

    public void preencherEmail(){
        driver.findElement(emailCriado).sendKeys(getRamdonEmail());
    }
    public void clicarBotao(){
        driver.findElement(emailButton).click();
    }
}
