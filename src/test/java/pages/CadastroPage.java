package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utils.Utils;

public class CadastroPage extends Utils {

    private By titleM = By.id("id_gender1");
    private By titleF = By.id("id_gender2");
    private By firstName = By.id("customer_firstname");
    private By lastName = By.id("customer_lastname");
    private By passwordField= By.id("passwd");

    private By select_Day = By.id("days");
    private By select_Month = By.id("months");
    private By select_Year = By.id("years");


    private By adress_field = By.id("address1");
    private By city_field = By.id("city");
    private By state_field = By.id("id_state");
    private By post_field = By.id("postcode");
    private By fone_home = By.id("phone");
    private By fone_field = By.id("phone_mobile");

    private By botao_registro = By.id("submitAccount");


    WebDriver driver;
    public CadastroPage (WebDriver driver) {
    this.driver = driver;
    }

    public void selectTitle(Integer type){
        esperarElemento(titleM,20);
        if(type == 1 ){
          driver.findElement(titleM).click();
        }else if (type == 2){
            driver.findElement(titleF).click();
        }
    }

    public void preencherNome(String nome){
        driver.findElement(firstName).sendKeys(nome);

    }

    public void preencherSobreNome(String Sobrenome) {
        driver.findElement(lastName).sendKeys(Sobrenome);

    }
    public void preencherPassword(String pass) {
        driver.findElement(passwordField).sendKeys(pass);

    }
    public void preencherCampoData(Integer dia, Integer mes, String ano ) {
        Select  selectDay = new Select(driver.findElement(select_Day));
        selectDay.selectByIndex(dia);

        Select  selectmes = new Select(driver.findElement(select_Month));
        selectmes.selectByIndex(mes);

        Select  selectAno = new Select(driver.findElement(select_Year));
        selectAno.selectByValue("1988");

    }
    public void preencherEndereco(String endereco) {
        driver.findElement(adress_field).sendKeys(endereco);
    }
    public void preencherCidade (String cidade) {
        driver.findElement(city_field).sendKeys(cidade);
    }


    public void escolherEstado (String state) {
        Select  selectState = new Select(driver.findElement(state_field));
        selectState.selectByVisibleText(state);
    }

    public void preencherCodigoCidade (String codigoCidade) {
        driver.findElement(post_field).sendKeys(codigoCidade);
    }
    public void preencherFoneHome (String foneHome) {
        driver.findElement(fone_home).sendKeys(foneHome);

    }


    public void preencherFone (String fone) {
        driver.findElement(fone_field).sendKeys(fone);

    }

    public void botaoRegistro (){
        driver.findElement(botao_registro).click();
    }

    public void validaCadastro (String nome, String sobrenome) {
        esperarElemento(By.className("button-search"), 20);

            String resultado_atual = driver.findElement(By.cssSelector( "#header > div.nav > div > div > nav > div:nth-child(1) > a > span")).getText();
        Assert.assertEquals(nome + " " + sobrenome,resultado_atual);
    }


}