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
     * Fechar o navegador
     */
    public void fechar(){
        browser.quit();
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
        Select select = new Select(browser.findElement(by));
        select.selectByVisibleText(texto);
    }

    /**
     * Acessar um IFrame
     * @param frame Elemento do frame.
     * @param by Caminho do elemento.
     * @param texto Texto a ser inserido dentro do frame.
     */
    public void frame(String frame, By by, String texto){
        browser.switchTo().frame(frame);

        browser.findElement(by).sendKeys(texto);
    }

    /**
     * Utilizar o DatePicker
     * @param by Caminho do elemento.
     * @param byAno Caminho do elemento onde fica identificado o ano.
     * @param byMes Caminho do elemento onde fica identificado o mes.
     * @param bySeta Caminho do elemento onde fica posiciondo a seta do calendario.
     * @param byDia Caminho do elemento onde fica a Dia de nascimento.
     * @param mes Mes de nascimento.
     * @param ano Ano de nascimento.
     */
    public void datePicker(By by, By byAno, By byMes, By bySeta, By byDia, String mes, String ano){
        browser.findElement( by ).click();

        while(!browser.findElement( byAno ).getText().equals( ano )){
            browser.findElement( bySeta ).click();
        }

        while(!browser.findElement( byMes ).getText().equals( mes )){
            browser.findElement( bySeta ).click();
        }

        browser.findElement( byDia ).click();
    }

    public void slider(){

    }
}
