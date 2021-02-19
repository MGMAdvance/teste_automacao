package tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SliderPage {
    System.out.println("Quarto Cenario - Iniciando");

        this.browser.get("http://demo.automationtesting.in/Slider.html");

        Thread.sleep(3000);

    /* Slider */
        try{
        WebElement slider = this.browser.findElement(new By.ByXPath("//*[@id=\"slider\"]"));
        Actions move = new Actions(this.browser);
        Action action = (Action) move.dragAndDropBy(slider, -100, 0).build();
        action.perform();
    }catch(Exception E){
        System.out.println("Falha ao tentar usar o Slider");
    }

        System.out.println("Quarto Cenario - Finalizado");
}
