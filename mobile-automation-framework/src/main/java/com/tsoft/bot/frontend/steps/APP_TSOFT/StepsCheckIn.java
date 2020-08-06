package com.tsoft.bot.frontend.steps.APP_TSOFT;

import com.tsoft.bot.frontend.pageobject.APP_TSOFT.PageCheckIn;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class StepsCheckIn extends PageCheckIn{

    @And("^se ingresan los datos, nombre \"([^\"]*)\", id \"([^\"]*)\", contraseñas \"([^\"]*)\" \"([^\"]*)\" y se aceptan los términos$")
    public void seIngresanLosDatosNombreIdContraseñasYSeAceptanLosTérminos(String casoDePrueba, String casoDePrueba1, String casoDePrueba2, String casoDePrueba3) throws Throwable {
        PageCheckIn.ingresoDeDatos(casoDePrueba, casoDePrueba1, casoDePrueba2, casoDePrueba3);
    }


    @Then("^se da clic en el botón Registrarse y se valida mensaje$")
    public void seDaClicEnElBotónRegistrarseYSeValidaMensaje() throws Exception {
        PageCheckIn.validacionRegistro();
    }
}
