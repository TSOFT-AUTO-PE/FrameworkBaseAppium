package com.tsoft.bot.frontend.pageobject.APP_TSOFT;

import com.tsoft.bot.frontend.helpers.Hook;
import com.tsoft.bot.frontend.utility.ExtentReportUtil;
import com.tsoft.bot.frontend.utility.GenerateWord;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class PageChooseOption {

    public static GenerateWord generateWord = new GenerateWord();
    public static AppiumDriver<MobileElement> driver;

    public PageChooseOption() {
        this.driver = Hook.getDriver();
    }

    public static String btnRegistrarse        = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.View/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[4]/android.widget.LinearLayout/android.widget.Button[1]";
    public static String btnIniciarSesion      = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.View/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[4]/android.widget.LinearLayout/android.widget.Button[2]";


    public static void elijaUnaOpcion() throws Exception {
        try {
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se ingresa a la APP TSOFT");
            generateWord.sendText("Se ingresa a la APP TSOFT");
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            throw e;
        }

    }

    public static void ingresoRegistro() throws Exception {
        try{
            driver.findElement(By.xpath(btnRegistrarse)).click();
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se da click en el botón Registrarse");
            generateWord.sendText("Se da click en el botón Registrarse");
            generateWord.addImageToWord(driver);

        }catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            throw e;
        }
    }

    public static void ingresoInicioSesion() throws Exception {
        try{
            driver.findElement(By.xpath(btnIniciarSesion)).click();
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se da click en el botón Iniciar Sesión");
            generateWord.sendText("Se da click en el botón Iniciar Sesión");
            generateWord.addImageToWord(driver);

        }catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            throw e;
        }
    }
}
