package com.tsoft.bot.frontend.steps.APP_TSOFT;

import com.tsoft.bot.frontend.helpers.Hook;
import com.tsoft.bot.frontend.pageobject.APP_TSOFT.PageObject_TSOFT;
import com.tsoft.bot.frontend.utility.ExcelReader;
import com.tsoft.bot.frontend.utility.ExtentReportUtil;
import com.tsoft.bot.frontend.utility.GenerateWord;
import com.tsoft.bot.frontend.utility.scroll;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Pa;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.tsoft.bot.frontend.utility.scroll.*;


import javax.swing.text.Element;
import java.util.HashMap;
import java.util.List;

import static com.tsoft.bot.frontend.pageobject.APP_TSOFT.PageObject_TSOFT.*;

public class steps_TSOFT extends PageObject_TSOFT{


    @Given("^se ingresa a la APP DEMO TSOFT$")
    public void seIngresaALaAPPDEMOTSOFT() throws Exception {
        PageObject_TSOFT.IngresoAPP_TSOFT();
    }

    @When("^se ingresa a la opción Registrarse$")
    public void seIngresaALaOpciónRegistrarse() throws Exception {
        PageObject_TSOFT.Ingreso_Registro();
    }

    @And("^se ingresan los datos, nombre \"([^\"]*)\", id \"([^\"]*)\", contraseñas \"([^\"]*)\" \"([^\"]*)\" y se aceptan los términos$")
    public void seIngresanLosDatosNombreIdContraseñasYSeAceptanLosTérminos(String casoDePrueba, String casoDePrueba1, String casoDePrueba2, String casoDePrueba3) throws Throwable {
        PageObject_TSOFT.Ingreso_Datos(casoDePrueba, casoDePrueba1, casoDePrueba2, casoDePrueba3);
    }

    @Then("^se da clic en el botón Registrarse y se valida mensaje$")
    public void seDaClicEnElBotónRegistrarseYSeValidaMensaje() throws Exception {
        PageObject_TSOFT.Registrar_Validar();
    }

    @When("^se ingresa a la opción Iniciar Sesión$")
    public void seIngresaALaOpciónIniciarSesión() throws Exception {
        PageObject_TSOFT.Ingreso_InicioSesion();
    }

    @And("^se ingresan los datos, usuario \"([^\"]*)\" y contraseña \"([^\"]*)\"$")
    public void seIngresanLosDatosUsuarioYContraseña(String casoDePrueba, String casoDePrueba1) throws Throwable {
     PageObject_TSOFT.Ingreso_DatosInicioSesion(casoDePrueba, casoDePrueba1);
    }

    @Then("^se da clic en el botón iniciar y se verifica ingreso$")
    public void seDaClicEnElBotónIniciarYSeVerificaIngreso() throws Exception {
        PageObject_TSOFT.Iniciar_Verificar();
    }

}
