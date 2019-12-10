package com.app.androidapp.init;

import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.app.android.lib.GenericLibrary;

import io.appium.java_client.android.AndroidDriver;

public class GlobalVariables {
	
//	Global Variables
	public AndroidDriver driver;
	public DesiredCapabilities capabilities;
	
//	DesiredCapabilities Variables
	public int port =Integer.parseInt(GenericLibrary.getProprtyValue(Constants.DCfile, "port"));
	public String deviceName=GenericLibrary.getProprtyValue(Constants.DCfile, "devicename");
	public String platformName=GenericLibrary.getProprtyValue(Constants.DCfile, "platformname");;
	public String platforVersion=GenericLibrary.getProprtyValue(Constants.DCfile, "platformversion");;
	public String automationName=GenericLibrary.getProprtyValue(Constants.DCfile, "automationname");;
	public String appPackage=GenericLibrary.getProprtyValue(Constants.DCfile, "apppackage");;
	public String appActivity=GenericLibrary.getProprtyValue(Constants.DCfile, "appactivity");;
	public String UDID=GenericLibrary.getProprtyValue(Constants.DCfile, "udid");
	
	
}
