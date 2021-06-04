package activities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class ActivityChrome {
		AppiumDriver<MobileElement> driver = null;
	    
	    @BeforeClass
	    public void initiateDriver() throws InterruptedException, IOException {
	    	DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("deviceName", "Pixel 4 A11");
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("appPackage", "com.android.chrome");
	        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
	        caps.setCapability("noReset", true);
	        // Instantiate Appium Driver
	        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
	        driver = new AndroidDriver<MobileElement>(appServer, caps);  
	    }
	 
	    @Test(enabled = false)
	    public void firstTask() throws InterruptedException, AWTException {
	    	Thread.sleep(2000);
	    	driver.findElement(By.id("com.android.chrome:id/search_box_text")).click();
	    	Thread.sleep(1000);
	    	driver.get("https://www.training-support.net/selenium");
	    	Thread.sleep(2000);
	    	
	    }
	    @Test
	    public void secondTask() throws InterruptedException {
	    	driver.get("https://www.training-support.net/selenium");
	    	Thread.sleep(2000);
	    	WebElement elem = driver.findElement(By.xpath("//*[@bounds='[855,344][1072,446]']"));
	    	elem.click();
	    	
	    	
	    }
	    

}
