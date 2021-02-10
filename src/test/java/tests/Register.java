package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
    @Test
    public void registrarFormulario(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathe\\Desktop\\teste\\chrome\\chromedriver.exe");

        WebDriver browser = new ChromeDriver();

        browser.get("http://demo.automationtesting.in/");

        browser.findElement(new By.ByXPath("//*[@id=\"btn2\"]")).click();
    }
}
