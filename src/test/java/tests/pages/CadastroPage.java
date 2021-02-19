package tests.pages;

import core.Dsl;
import org.openqa.selenium.By;

public class CadastroPage {

    private Dsl browser = new Dsl();

    private String cadastroUrl = "http://demo.automationtesting.in/";

    private By cadastroBtnSkip = new By.ByXPath("//button[@id='btn2']");
    private By cadastroInputName = new By.ByXPath("//input[@placeholder='First Name']");
    private By cadastroInputLastName = new By.ByXPath("//input[@placeholder='Last Name']");

    private By cadastroInputAddress = new By.ByXPath("//textarea");
    private By cadastroInputEmailAddress = new By.ByXPath("//input[@type='email']");
    private By cadastroInputPhone = new By.ByXPath("//input[@type='tel']");
    private By cadastroRadioGender = new By.ByXPath("//input[@name='radiooptions']");
    private By cadastroSelectHobbies = new By.ByXPath("//input[@id='checkbox2']");

    private By cadastroSelectLanguages = new By.ByXPath("//div[@id='msdd']");
    private By cadastroSelectLanguagesJapanese = new By.ByXPath("//a[text()='Japanese']");
    private By cadastroSelectLanguagesEnglish = new By.ByXPath("//a[text()='English']");
    private By cadastroSelectLanguagesPortuguese = new By.ByXPath("//a[text()='Portuguese']");

    private By cadastroSelectSkills = new By.ByXPath("//select[@id='Skills']");

    private By cadastroSelectCountry = new By.ByXPath("//select[@id='countries']");

    private By cadastroSelectCountry2 = new By.ByXPath("//span[@role='combobox']");
    private By cadastroSelectCountryJapan = new By.ByXPath("//li[text()='Japan']");

    private By cadastroSelectYear = new By.ByXPath("//select[@id='yearbox']");
    private By cadastroSelectMonth = new By.ByXPath("//select[@placeholder='Month']");
    private By cadastroSelectDay = new By.ByXPath("//select[@id='daybox']");

    private By cadastroInputFirstPassword = new By.ByXPath("//input[@id='firstpassword']");
    private By cadastroInputSecondPassword = new By.ByXPath("//input[@id='secondpassword']");

    private By cadastroSubmit = new By.ByXPath("//button[@id='submitbtn']");

    public void preencherFormulario(){
        navegar();
        nomeCompleto();
        endereco();
        email();
        telefone();
        genero();
        hobbies();
        linguas();
        habilidades();
        pais();
        paises();
        dataNascimento();
        senha();
        enviar();
        fecharNavegador();
    }

    public void navegar(){
        browser.ir(cadastroUrl);
        browser.clicar(cadastroBtnSkip);
    }

    private void fecharNavegador(){
        browser.fechar();
    }

    private void nomeCompleto(){
        browser.escrever(cadastroInputName, "Matheus");
        browser.escrever(cadastroInputLastName, "Gonçalves");
    }

    private void endereco(){
        browser.escrever(cadastroInputAddress, "Rua Santo Agostinho");
    }

    private void email(){
        browser.escrever(cadastroInputEmailAddress, "matheusgt4@hotmail.com");
    }

    private void telefone(){
        browser.escrever(cadastroInputPhone, "1234567899");
    }

    private void genero(){
        browser.clicar(cadastroRadioGender);
    }

    private void hobbies(){
        browser.clicar(cadastroSelectHobbies);
    }

    private void linguas(){
        browser.clicar(cadastroSelectLanguages);
        browser.clicar(cadastroSelectLanguagesEnglish);
        browser.clicar(cadastroSelectLanguagesPortuguese);
        browser.clicar(cadastroSelectLanguagesJapanese);

        browser.clicar(cadastroInputPhone);
    }

    private void habilidades(){
        browser.clicar(cadastroSelectSkills);
    }

    private void pais(){
        browser.selecao(cadastroSelectCountry, "Brazil");
    }

    private void paises(){
        browser.clicar(cadastroSelectCountry2);
        browser.clicar(cadastroSelectCountryJapan);
    }

    private void dataNascimento(){
        browser.selecao(cadastroSelectYear, "1998");
        browser.selecao(cadastroSelectMonth,"November");
        browser.selecao(cadastroSelectDay,"3");
    }

    private void senha(){
        browser.escrever(cadastroInputFirstPassword, "Teste123@");
        browser.escrever(cadastroInputSecondPassword, "Teste123@");
    }

    private void enviar(){
        browser.clicar(cadastroSubmit);
    }
}
