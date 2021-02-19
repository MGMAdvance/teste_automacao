package tests;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.pages.CadastroPage;
import tests.pages.FramePage;

public class Register {
    WebDriver browser;

    public Register(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathe\\Desktop\\teste\\chrome\\chromedriver.exe");
        this.browser = new ChromeDriver();
    }

    public void registrarFormulario(){
        CadastroPage registrar = new CadastroPage();
        registrar.preencherFormulario();
    }

    public void preenchendoFrames() throws InterruptedException {
        FramePage frame = new FramePage();
        frame.preencherFrame();
    }

    public void widgetsDataNascimento() throws InterruptedException {

    }

    public void slider() throws InterruptedException {

    }
}
