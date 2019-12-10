package com.app.androidapp.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.app.androidapp.util.MobileActionUtil;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LandingPage {
	
	AndroidDriver driver;
	@AndroidFindBy(accessibility = "Views")
	private MobileElement viewsbtn;
	
	public LandingPage(AndroidDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

	
	public void tapOnViewsMenu() throws IOException, InterruptedException
	{
		MobileActionUtil.tapOnElement(viewsbtn, driver);
	}
}
