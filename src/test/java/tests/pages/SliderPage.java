package tests.pages;

import core.Dsl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SliderPage {

    private Dsl browser = new Dsl();

    private String sliderUrl = "http://demo.automationtesting.in/Slider.html";

    private By sliderElement = new By.ByXPath("//*[@id=\"slider\"]");
    private int sliderPorcentagem = 50;

    public void utilizarSlider(){
        navegar();
        arrastarSlider();
        fecharNavegador();
    }

    public void navegar(){
        browser.ir(sliderUrl);
    }

    private void arrastarSlider(){
        browser.slider(sliderElement, sliderPorcentagem);
    }

    private void fecharNavegador(){
        browser.fechar();
    }
}
