package com.tsoft.bot.frontend.helpers;

import com.tsoft.bot.frontend.listener.Listener;
import com.tsoft.bot.frontend.utility.GenerateWord;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


import java.io.IOException;
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

		driver = new AppiumDriver<MobileElement>(ConfigCaps.appiumServerUrl(), ConfigCaps.dcAndroid_SMJ320M_App_TSOFT());
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
