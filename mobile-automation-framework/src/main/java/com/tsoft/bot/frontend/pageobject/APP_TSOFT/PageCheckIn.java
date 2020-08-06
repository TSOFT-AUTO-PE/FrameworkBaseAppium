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

public class PageCheckIn {

    private static final String EXCEL_APK = "excel/App_TSOFT.xlsx";
    private static final String REGISTRO_APK = "Registro";
    private static final String COLUMNA_NOMBRE = "NOMBRE";
    private static final String COLUMNA_ID = "ID";
    private static final String COLUMNA_PASS1 = "PASSWORD_1";
    private static final String COLUMNA_PASS2 = "PASSWORD_2";

    public static GenerateWord generateWord = new GenerateWord();
    public static AppiumDriver<MobileElement> driver;


    public PageCheckIn() {
        this.driver = Hook.getDriver();
    }


    private static List<HashMap<String, String>> getData() throws Throwable {
        return ExcelReader.data(EXCEL_APK, REGISTRO_APK);
    }

    public static String TXT_NOMBRE             = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.View/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.EditText[1]";
    public static String TXT_ID                 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.View/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.EditText[2]";
    public static String TXT_PASS1              = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.View/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.EditText[3]";
    public static String TXT_PASS2              = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.View/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.EditText[4]";
    public static String CHK_TERMINOS           = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.View/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[4]/android.widget.LinearLayout/android.widget.CheckBox";
    public static String BTN_REGISTRO           = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.View/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[6]/android.widget.LinearLayout/android.widget.Button[2]";
    public static String LBL_MSG                = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.View/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.TextView[5]";


    public static void ingresoDeDatos(String casoDePrueba, String casoDePrueba1, String casoDePrueba2, String casoDePrueba3) throws Throwable {
        try{
            int tsoft = Integer.parseInt(casoDePrueba) - 1;
            String nombre = getData().get(tsoft).get(COLUMNA_NOMBRE);
            int tsoft1 = Integer.parseInt(casoDePrueba1) - 1;
            String id = getData().get(tsoft1).get(COLUMNA_ID);
            int tsoft2 = Integer.parseInt(casoDePrueba2) - 1;
            String pass1 = getData().get(tsoft2).get(COLUMNA_PASS1);
            int tsoft3 = Integer.parseInt(casoDePrueba3) - 1;
            String pass2 = getData().get(tsoft3).get(COLUMNA_PASS2);

            driver.findElement(By.xpath(TXT_NOMBRE)).sendKeys(nombre);
            driver.findElement(By.xpath(TXT_ID)).sendKeys(id);
            driver.findElement(By.xpath(TXT_PASS1)).sendKeys(pass1);
            driver.findElement(By.xpath(TXT_PASS2)).sendKeys(pass2);
            driver.findElement(By.xpath(CHK_TERMINOS)).click();

            ExtentReportUtil.INSTANCE.stepPass(driver, "Se llenan los datos de Registro");
            generateWord.sendText("Se llenan los datos de Registro");
            generateWord.addImageToWord(driver);

        }catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            throw e;
        }
    }

    public static void validacionRegistro() throws Exception {
        try{
            driver.findElement(By.xpath(BTN_REGISTRO)).click();
            String textoToSearch = "Usted se ha registrado correctamente.";
            MobileElement element = driver.findElement(By.xpath(LBL_MSG));
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
