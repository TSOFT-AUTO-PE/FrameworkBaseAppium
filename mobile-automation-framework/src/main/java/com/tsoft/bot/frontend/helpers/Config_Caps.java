package com.tsoft.bot.frontend.helpers;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Config_Caps {

    static String url = "http://127.0.0.1:4723/wd/hub";


            public static final URL appiumServerUrl(){
                try{
                    return new URL(url);
                }catch(MalformedURLException e){
                    e.printStackTrace();
                }
                return null;
            }

    public static final DesiredCapabilities dcAndroid_SMJ320M_App_USSD(){

                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"SM J320M");
                capabilities.setCapability(MobileCapabilityType.UDID, "42009d83a8a61400");
                capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
                capabilities.setCapability("appPackage", "com.android.contacts"); //USSD
                capabilities.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity"); // USSD
                return capabilities;
    }

    public static final DesiredCapabilities dcAndroid_SMJ320M_App_MIMOVISTAR(){

                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"SM J320M");
                capabilities.setCapability(MobileCapabilityType.UDID, "42009d83a8a61400");
                capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
                capabilities.setCapability("appPackage", "tdp.app.col.enterprise"); //Mi Movistar
                capabilities.setCapability("appActivity", "com.tuenti.messenger.ui.activity.MainActivity"); //Mi Movistar
                return capabilities;
    }

    public static final DesiredCapabilities dcAndroid_SMJ320M_App_APPVENTAS(){

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"SM J320M");
        capabilities.setCapability(MobileCapabilityType.UDID, "42009d83a8a61400");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
		capabilities.setCapability("appPackage", "pe.vasslatam.movistar.mobile.sales.debug"); //APP VENTAS
		capabilities.setCapability("appActivity", "pe.vasslatam.movistar.mobile.sales.activities.SplashActivity"); // APP VENTAS
        return capabilities;
    }

    public static final DesiredCapabilities dcAndroid_SMJ320M_App_TSOFT(){

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"SM J320M");
        capabilities.setCapability(MobileCapabilityType.UDID, "42009d83a8a61400");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
        capabilities.setCapability("appPackage", "appinventor.ai_aalexriverar.Tsoft_Test");
        capabilities.setCapability("appActivity", "appinventor.ai_aalexriverar.Tsoft_Test.Screen1");
        return capabilities;
    }
}
