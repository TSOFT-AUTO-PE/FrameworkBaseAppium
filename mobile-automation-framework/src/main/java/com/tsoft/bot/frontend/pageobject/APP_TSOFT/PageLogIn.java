package com.tsoft.bot.frontend.pageobject.APP_TSOFT;

import com.tsoft.bot.frontend.helpers.Hook;
import com.tsoft.bot.frontend.utility.ExcelReader;
import com.tsoft.bot.frontend.utility.ExtentReportUtil;
import com.tsoft.bot.frontend.utility.GenerateWord;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.List;

public class PageLogIn {

    private static final String EXCEL_APK = "excel/App_TSOFT.xlsx";
    private static final String LOGIN_APK = "Login";
    private static final String COLUMNA_USUARIO = "USUARIO";
    private static final String COLUMNA_PASSWORD = "PASSWORD";

    public static GenerateWord generateWord = new GenerateWord();
    public static AppiumDriver<MobileElement> driver;


    public PageLogIn() {
        this.driver = Hook.getDriver();
    }

    private static List<HashMap<String, String>> getData1() throws Throwable {
        return ExcelReader.data(EXCEL_APK, LOGIN_APK);
    }

    public static String TXT_USUARIO            = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.View/android.widget.ScrollView/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[5]/android.widget.LinearLayout/android.widget.EditText";
    public static String TXT_PASSWORD           = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.View/android.widget.ScrollView/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[6]/android.widget.LinearLayout/android.widget.EditText";
    public static String BTN_INICIO             = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.View/android.widget.ScrollView/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[8]/android.widget.LinearLayout/android.widget.Button[2]";
    public static String LBL_TITLE              = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.View/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.TextView";


    public static void Ingreso_DatosInicioSesion(String casoDePrueba, String casoDePrueba1) throws Throwable{
        try{
            int tsoft = Integer.parseInt(casoDePrueba) - 1;
            String usuario = getData1().get(tsoft).get(COLUMNA_USUARIO);
            int tsoft1 = Integer.parseInt(casoDePrueba1) - 1;
            String password = getData1().get(tsoft1).get(COLUMNA_PASSWORD);

            driver.findElement(By.xpath(TXT_USUARIO)).sendKeys(usuario);
            driver.findElement(By.xpath(TXT_PASSWORD)).sendKeys(password);

            ExtentReportUtil.INSTANCE.stepPass(driver, "Se llenan los datos de Login");
            generateWord.sendText("Se llenan los datos de Login");
            generateWord.addImageToWord(driver);

        }catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            throw e;
        }
    }

    public static void Iniciar_Verificar() throws Exception {
        try{
            driver.findElement(By.xpath(BTN_INICIO)).click();
            String textoToSearch = "TSOFT make it real";
            MobileElement element = driver.findElement(By.xpath(LBL_TITLE));
            String elText = element.getText();
            if(elText.equals(textoToSearch)){
                ExtentReportUtil.INSTANCE.stepPass(driver, elText);
                generateWord.sendText(elText);
                generateWord.addImageToWord(driver);
            }else{
                ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : No se presentó el mensaje esperado: "+elText);
                generateWord.sendText("Fallo el caso de prueba : No se presentó el mensaje esperado; "+elText);
                generateWord.addImageToWord(driver);
                driver.close();
            }

        }catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            throw e;
        }
    }
}
