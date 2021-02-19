package tests.pages;

import org.openqa.selenium.By;

public class FramePage {

    System.out.println("Segundo Cenario - Iniciando");

        this.browser.get("http://demo.automationtesting.in/Frames.html");

        Thread.sleep(3000);

        try{
        this.browser.switchTo().frame("singleframe");

        this.browser.findElement(new By.ByXPath("/html/body/section/div/div/div/input"))
                .sendKeys("Está funcionando");
    }catch (Exception E){
        System.out.println("Falha ao tentar escrever no Frame");
    }

        System.out.println("Segundo Cenario - Finalizado");
}
