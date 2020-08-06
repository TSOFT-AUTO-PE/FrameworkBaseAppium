package com.tsoft.bot.frontend.steps.APP_TSOFT;

import com.tsoft.bot.frontend.pageobject.APP_TSOFT.PageChooseOption;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepsChooseOption extends PageChooseOption{

    @Given("^se ingresa a la APP DEMO TSOFT$")
    public void seIngresaALaAPPDEMOTSOFT() throws Exception{
        PageChooseOption.elijaUnaOpcion();
    }

    @When("^se ingresa a la opción Registrarse$")
    public void seIngresaALaOpciónRegistrarse() throws Exception {
        PageChooseOption.ingresoRegistro();
    }

    @When("^se ingresa a la opción Iniciar Sesión$")
    public void seIngresaALaOpciónIniciarSesión() throws Exception {
        PageChooseOption.ingresoInicioSesion();
    }
}
