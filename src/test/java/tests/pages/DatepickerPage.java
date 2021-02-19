package tests.pages;

import core.Dsl;
import org.openqa.selenium.By;

public class DatepickerPage {

    private Dsl browser = new Dsl();

    private String datePickerUrl = "http://demo.automationtesting.in/Datepicker.html";

    private By datePickerElement = new By.ByXPath("//img[@class='imgdp']");

    private By datePickerTextYear = new By.ByXPath("//span[@class='ui-datepicker-year']");
    private By datePickerTextMonth = new By.ByXPath("//span[@class='ui-datepicker-month']");
    private By datePickerTextArrow = new By.ByXPath("//a[@data-handler='prev']");

    private By datePickerTextDay = new By.ByXPath("//a[@class='ui-state-default'][text()='3']");
    private String datePickerStringMonth = "November";
    private String datePickerStringYear = "1998";

    private By datePickerInput = new By.ByXPath("//input[@id='datepicker2']");
    private String datePickerBirth = "03/11/1998";

    public void utilizarDatePicker(){
        navegar();
        datePickerManual();
        datePickerDigitado();
        fecharNavegador();
    }

    public void navegar(){
        browser.ir(datePickerUrl);
    }

    private void fecharNavegador(){
        browser.fechar();
    }

    private void datePickerManual(){
        browser.datePicker( datePickerElement,
                            datePickerTextYear,
                            datePickerTextMonth,
                            datePickerTextArrow,
                            datePickerTextDay,
                            datePickerStringMonth,
                            datePickerStringYear );
    }

    private void datePickerDigitado(){
        browser.escrever(datePickerInput, datePickerBirth);
    }
}
