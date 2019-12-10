package com.app.androidapp.util;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.app.androidapp.init.Constants;
import com.app.androidapp.reports.ExtentManager;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class MobileActionUtil {
	
	/**
	 * Description: This method is to long press on element upto 3 seconds then
	 * release
	 */
	public static void LongPressAction(AndroidDriver driver, WebElement element) throws IOException {

		try {
			TouchAction act1 = new TouchAction(driver);
			act1.longPress(element).waitAction(3000).release().perform();
		} catch (Exception e) {

		}
	}

	/**
	 * Description: Scroll to an Element
	 */
		public static void scrollToElement(AndroidDriver driver,String an,String av)
	{
		try {
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
		}
		catch(InterruptedException ie)
		{
			
		}
	}
	
	
	public static void tapOnElement(WebElement element, AndroidDriver driver)  {
		try
		{
		Thread.sleep(3000);
		TouchAction act1 = new TouchAction(driver);
		act1.press(element).release().perform();
		}
		catch(InterruptedException ie)
		{
			
		}
	}
		
	/**
	 * Description: this method Takes ScreenShots
	 * 
	 */
	public static String capture(AndroidDriver driver, String screenShotName) throws IOException {
		File source = driver.getScreenshotAs(OutputType.FILE);
		String dest = Constants.screenShotPath + screenShotName + ".png";
		File destination = new File(dest);
		FileUtils.copyFile(source, destination);
		return dest;
	}
	
	
	/**
	 * Description: this method hides keyboard
	 *
	 */
	public static void hideKeyboard(AndroidDriver driver) {
		try {
			driver.hideKeyboard();
			Thread.sleep(2000);
		} catch (Throwable e) {

		}
	}
	
	
	
	/**
	 * Description: Fetch text from element and return as string
	 * 
	 */

	public static String getText(WebElement elename, AndroidDriver driver, String elementName) {
		String eleText = null;
		eleText = elename.getText();
		return eleText;
	}
	
	/**
	 * 
	 * Description: This method to scroll left side based on device height and
	 * width
	 */

	public static void swipeRightToLeft(int value, double startX, double endX, AndroidDriver driver) throws Exception {
		try {
			Thread.sleep(1000);
			System.out.println("inside swipe");
			for (int i = 1; i <= value; i++) {
				Dimension dSize = driver.manage().window().getSize();
				int startx = (int) (dSize.width * startX);
				int endx = (int) (dSize.width * endX);
				int starty = dSize.height / 2;
				driver.swipe(startx, starty, endx, starty, 1000);

			}
		} catch (Exception e) {

		}
	}
	
	
	
	
}