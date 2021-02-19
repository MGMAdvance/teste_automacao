package tests.pages;

import core.Dsl;
import org.openqa.selenium.By;

public class FramePage {

    private Dsl browser = new Dsl();

    private String frameUrl = "http://demo.automationtesting.in/Frames.html";

    private String frameElement = "singleframe";
    private By frameInput = new By.ByXPath("//input[@type='text']");

    public void preencherFrame(){
        navegar();
        frame();
        fecharNavegador();
    }

    public void navegar(){
        browser.ir(frameUrl);
    }

    private void fecharNavegador(){
        browser.fechar();
    }

    private void frame(){
        browser.frame(frameElement, frameInput, "Está funcionando");
    }
}
