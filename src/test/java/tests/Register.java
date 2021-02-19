package tests;

import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import tests.pages.CadastroPage;
import tests.pages.DatepickerPage;
import tests.pages.FramePage;
import tests.pages.SliderPage;

public class Register {
    WebDriver browser;

    public Register(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathe\\Desktop\\teste\\chrome\\chromedriver.exe");
        this.browser = new ChromeDriver();
    }

    @Test
    public void registrarFormulario(){
        CadastroPage registrar = new CadastroPage();
        registrar.preencherFormulario();
    }

    @Test
    public void preenchendoFrames(){
        FramePage frame = new FramePage();
        frame.preencherFrame();
    }

    @Test
    public void widgetsDataNascimento(){
        DatepickerPage datePicker = new DatepickerPage();
        datePicker.utilizarDatePicker();
    }

    @Test
    public void slider(){
        SliderPage slider = new SliderPage();
        slider.utilizarSlider();
    }
}
