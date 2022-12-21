package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import suport.Utils;

public class HomePage extends Utils {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarPublicacao(){
        driver.get("https://qazando.com.br/curso.html");
        esperarElementoEstarPresente(By.id("btn-ver-cursos"),10);
        Assert.assertEquals("Nao acessou a aplicação",true,driver.findElement(By.id("btn-ver-cursos")).isDisplayed());
    }
    public void scrollPage() throws InterruptedException {
        JavascriptExecutor jse =(JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, 10000)");
        Thread.sleep(2000);
    }
    public void preencheEmail(){
        driver.findElement(By.id("email")).sendKeys("teste@teste.com");

    }
    public void clicoEmGanharDesconto(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button"))).click();
    }
    public void verificarCupomDEDesconto(){
        String texto_cupom = driver.findElement(By.cssSelector("#cupom >h2 >span")).getText();
        System.out.println(texto_cupom);

        Assert.assertEquals("o cupom esta errado", "QAZANDO15OFF", texto_cupom);

    }
    public void euFalho() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("buttonx"))).click();
}}
