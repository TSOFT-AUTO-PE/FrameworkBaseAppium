package com.tsoft.bot.frontend.steps.APP_TSOFT;

import com.tsoft.bot.frontend.pageobject.APP_TSOFT.PageLogIn;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class StepsLogIn extends PageLogIn{

    @And("^se ingresan los datos, usuario \"([^\"]*)\" y contraseña \"([^\"]*)\"$")
    public void seIngresanLosDatosUsuarioYContraseña(String casoDePrueba, String casoDePrueba1) throws Throwable {
        PageLogIn.Ingreso_DatosInicioSesion(casoDePrueba, casoDePrueba1);
    }

    @Then("^se da clic en el botón iniciar y se verifica ingreso$")
    public void seDaClicEnElBotónIniciarYSeVerificaIngreso() throws Exception {
        PageLogIn.Iniciar_Verificar();
    }
}
