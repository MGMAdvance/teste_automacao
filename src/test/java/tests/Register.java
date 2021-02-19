package tests;

import org.junit.Test;

import tests.pages.CadastroPage;
import tests.pages.DatepickerPage;
import tests.pages.FramePage;
import tests.pages.SliderPage;

public class Register {

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
