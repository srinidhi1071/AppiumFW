package com.app.androidapp.pages;

import org.openqa.selenium.support.PageFactory;

import com.app.androidapp.util.MobileActionUtil;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class VookLandingPage {
	
	AndroidDriver driver;
	
	
	public VookLandingPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='T-shirts']")
	private MobileElement t_shirtsbtn;
	
	public void scrollToMen()
	{
		MobileActionUtil.scrollToElement(driver, "text", "T-shirts");
	}
	
	public void tapOnTshirtBtn()
	{
		MobileActionUtil.tapOnElement(t_shirtsbtn, driver);
	}
}
