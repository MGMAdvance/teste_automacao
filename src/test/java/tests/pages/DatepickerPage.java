package tests.pages;

import org.openqa.selenium.By;

public class DatepickerPage {
    System.out.println("Terceiro Cenario - Iniciando");

        this.browser.get("http://demo.automationtesting.in/Datepicker.html");

        Thread.sleep(3000);

    /* DatePicker */
        try{
        this.browser.findElement(new By.ByXPath("//*[@id=\"datepicker1\"]"))
                .click();

        while( !this.browser.findElement(new By.ByXPath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText().equals("1998")){
            this.browser.findElement(new By.ByXPath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
        }

        while(!this.browser.findElement(new By.ByXPath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText().equals("April")){
            this.browser.findElement(new By.ByXPath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
        }

        this.browser.findElement(new By.ByXPath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[2]/a")).click();
    }catch(Exception E){
        System.out.println("Falha ao tentar usar o primeiro DatePicker");
    }

    /* DatePicker Digitado */
        try{
        this.browser.findElement(new By.ByXPath("//*[@id=\"datepicker2\"]"))
                .sendKeys("05/04/1993");
    }catch(Exception E){
        System.out.println("Falha ao digitar a data no segundo DatePicker");
    }

        System.out.println("Terceiro Cenario - Finalizado");
}
