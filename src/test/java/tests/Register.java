package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {
    WebDriver browser;

    public Register(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathe\\Desktop\\teste\\chrome\\chromedriver.exe");
        this.browser = new ChromeDriver();
    }

    @Test
    public void registrarFormulario(){
        this.browser.get("http://demo.automationtesting.in/");

        this.browser.findElement(new By.ByXPath("//*[@id=\"btn2\"]")).click();

        /* Full Name */
        try {
            this.browser.findElement(new By.ByXPath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"))
                    .sendKeys("Matheus");
            this.browser.findElement(new By.ByXPath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"))
                    .sendKeys("Gonçalves Mourão Rodrigues");
        }catch (Exception E){
            System.out.println("Falha ao escrever o nome");
        }

        /* Address */
        try{
            this.browser.findElement(new By.ByXPath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"))
                  .sendKeys("Rua Santo Agostinho");
        }catch (Exception E){
            System.out.println("Falha ao escrever o endereço");
        }

        /* Email Address */
        try{
            this.browser.findElement(new By.ByXPath("//*[@id=\"eid\"]/input"))
                    .sendKeys("matheusgt4@hotmail.com");
        }catch (Exception E){
            System.out.println("Falha ao escrever o email");
        }

        /* Phone */
        try{
            this.browser.findElement(new By.ByXPath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"))
                    .sendKeys("1234567899");
        }catch (Exception E){
            System.out.println("Falha ao escrever o telefone");
        }

        /* Gender */
        try{
            this.browser.findElement(new By.ByXPath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"))
                    .click();
        }catch (Exception E){
            System.out.println("Falha ao escolher o genero");
        }

        /* Hobbies */
        try{
            this.browser.findElement(new By.ByXPath("//*[@id=\"checkbox2\"]"))
                    .click();
        }catch (Exception E){
            System.out.println("Falha ao selecionar os hobbies");
        }

        /* Languages */
        try{
            this.browser.findElement(new By.ByXPath("//*[@id=\"msdd\"]"))
                    .click();
            this.browser.findElement(new By.ByXPath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a"))
                    .click();
            this.browser.findElement(new By.ByXPath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[29]/a"))
                    .click();
            this.browser.findElement(new By.ByXPath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"))
                    .click();
        }catch (Exception E){
            System.out.println("Falha ao escolher a linguagem");
        }

        /* Skills */
        try{
            this.browser.findElement(new By.ByXPath("//*[@id=\"Skills\"]"))
                    .click();
            this.browser.findElement(new By.ByXPath("//*[@id=\"Skills\"]/option[59]"))
                    .click();
        }catch (Exception E){
            System.out.println("Falha ao escolher a habilidade");
        }

        /* Country */
        try{
            this.browser.findElement(new By.ByXPath("//*[@id=\"countries\"]"))
                    .click();
            this.browser.findElement(new By.ByXPath("//*[@id=\"countries\"]/option[33]"))
                    .click();
        }catch (Exception E){
            System.out.println("Falha ao escolher o pais");
        }

        /* Select Country */
        try{
            this.browser.findElement(new By.ByXPath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span"))
                    .click();
            this.browser.findElement(new By.ByXPath("/html/body/span/span/span[1]/input"))
                    .sendKeys("Japan");
            if (this.browser.findElement(new By.ByXPath("//*[@id=\"select2-country-results\"]/li")).getText().equals("Japan")){
                this.browser.findElement(new By.ByXPath("//*[@id=\"select2-country-results\"]/li")).click();
            }
        }catch (Exception E){
            System.out.println("Falha ao selecionar o pais");
        }

        /* Date of Birth */
        try{
            Select yearbox = new Select(this.browser.findElement(new By.ByCssSelector("#yearbox")));
            yearbox.selectByVisibleText("1998");

            Select monthbox = new Select(this.browser.findElement(new By.ByCssSelector("#basicBootstrapForm > div:nth-child(11) > div:nth-child(3) > select")));
            monthbox.selectByVisibleText("November");

            Select daybox = new Select(this.browser.findElement(new By.ByXPath("//*[@id=\"daybox\"]")));
            daybox.selectByVisibleText("3");
        }catch (Exception E){
            System.out.println("Falha ao colocar a data de nascimento");
        }

        /* Password */
        try{
            this.browser.findElement(new By.ByXPath("//*[@id=\"firstpassword\"]")).sendKeys("Teste123@");
            this.browser.findElement(new By.ByXPath("//*[@id=\"secondpassword\"]")).sendKeys("Teste123@");
        }catch (Exception E){
            System.out.println("Falha ao digitar a senha");
        }

        /* Submit */
        this.browser.findElement(new By.ByXPath("//*[@id=\"submitbtn\"]")).click();
    }
}
