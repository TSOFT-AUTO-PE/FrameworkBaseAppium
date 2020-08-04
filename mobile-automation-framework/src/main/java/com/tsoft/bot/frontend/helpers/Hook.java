package com.tsoft.bot.frontend.helpers;

import com.tsoft.bot.frontend.listener.Listener;
import com.tsoft.bot.frontend.utility.FileHelper;
import com.tsoft.bot.frontend.utility.GenerateWord;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class Hook extends Listener {


	public static AppiumDriver<MobileElement> driver;
	static GenerateWord generateWord = new GenerateWord();

	@Before
	public void Scenario(Scenario scenario){
		onTestStart(scenario.getName());
	}

	@Before
	public void setUpAppium(){

		driver = new AppiumDriver<MobileElement>(Config_Caps.appiumServerUrl(), Config_Caps.dcAndroid_SMJ320M_App_TSOFT());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		generateWord.startUpWord();
	}

	@After
	public void tearDown() throws IOException {
		driver.quit();
		onFinish();
		generateWord.endToWord();
	}

	public static AppiumDriver<MobileElement> getDriver()
	{
		return driver;
	}

}
