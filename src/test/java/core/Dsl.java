package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dsl {
    private WebDriver browser = new ChromeDriver();

    public Dsl(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathe\\Desktop\\teste\\chrome\\chromedriver.exe");
    }

    /**
     * Ir para determinado URL.
     * @param url
     */
    public void ir(String url){
        browser.get(url);
    }

    /**
     * Clicar em um determinado elemento.
     * @param by Caminho do elemento.
     */
    public void clicar(By by){
        browser.findElement(by).click();
    }

    /**
     * Escrever algo em um determinado elemento.
     * @param by Caminho do elemento.
     * @param texto Texto para ser inserido.
     */
    public void escrever(By by, String texto){
        browser.findElement(by).sendKeys(texto);
    }

    /**
     * Selecionar uma opção.
     * @param by Caminho do elemento.
     * @param texto Texto referente a opção.
     */
    public void selecao(By by, String texto){
        Select select = new Select(browser.findElement(by);
        select.selectByVisibleText(texto);
    }

    public void frame(By by, String texto){

    }

    public void slider(){

    }
}
