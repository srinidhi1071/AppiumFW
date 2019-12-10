package com.app.android.lib;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.app.androidapp.init.Constants;
import com.app.androidapp.init.GlobalVariables;

import io.appium.java_client.android.AndroidDriver;

public class BaseLib{
	public static  GlobalVariables gv = new GlobalVariables();
	@BeforeClass
	public void _LaunchApp() throws MalformedURLException
	{
		gv.capabilities = new DesiredCapabilities();
		gv.capabilities.setCapability("deviceName", gv.deviceName);
		gv.capabilities.setCapability("platformName", gv.platformName);
		gv.capabilities.setCapability("platformVersion", gv.platforVersion);
		gv.capabilities.setCapability("automationName", gv.automationName);
		gv.capabilities.setCapability("appPackage", gv.appPackage);
		gv.capabilities.setCapability("appActivity", gv.appActivity);
		gv.capabilities.setCapability("UDID", gv.UDID);
		gv.capabilities.setCapability("fullReset", false);
		gv.capabilities.setCapability("noReset", true);
		gv.capabilities.setCapability("appWaitDuration", 180000);
		gv.capabilities.setCapability("autoGrantPermissions", true);
		gv.capabilities.setCapability("autoAcceptAlerts", true);
		System.out.println("http://127.0.0.1:"+gv.port+"/wd/hub");
		gv.driver = new AndroidDriver(new URL("http://127.0.0.1:"+gv.port+"/wd/hub"), gv.capabilities);
		gv.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
	}
	
	@AfterClass
	public void shutDownApp()
	{
	
			
	}
	
	

}
