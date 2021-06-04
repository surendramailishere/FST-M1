package activities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity_GoogleKeep {
	   AppiumDriver<MobileElement> driver = null;
	    
	    @BeforeClass
	    public void beforeClass() throws MalformedURLException {
	        // Set the Desired Capabilities
	        DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("deviceName", "Pixel 4 A11");
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("appPackage", "com.google.android.keep");
	        caps.setCapability("appActivity", ".activities.BrowseActivity");
	        caps.setCapability("noReset", true);

	        // Instantiate Appium Driver
	        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
	        driver = new AndroidDriver<MobileElement>(appServer, caps);
	    }
	
	    @Test()
	    public void secondTask() throws InterruptedException {
	    	//driver.findElement(By.xpath("//*[@text='Get started']")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@bounds='[838,1906][992,1977]']")).click();
	    	Thread.sleep(1000);
	    	driver.findElement(By.id("com.google.android.keep:id/edit_note_text")).sendKeys("First Note description");
	    	driver.findElement(By.xpath("//*[@bounds='[55,193][209,325]']")).click();
	    	String text = driver.findElement(By.xpath("//*[@[@content-desc='Flight note description']")).getText();
	    	Assert.assertEquals(text, "First Note description");
	    }
	    @Test
	    public void thirdTask() throws InterruptedException {
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@bounds='[838,1906][992,1977]']")).click();
	    	Thread.sleep(1000);
	    	driver.findElement(By.id("com.google.android.keep:id/edit_note_text")).sendKeys("Note with reminder");
	    	driver.findElement(By.id("com.google.android.keep:id/menu_switch_to_list_view")).click();
	    	Thread.sleep(1000);
	    	driver.findElement(By.xpath("//*[@bounds='[0,1224][1080,1356]']")).click();
	    	driver.findElement(By.xpath("//*[@bounds='[55,193][209,325]']")).click();
	    	String reminder = driver.findElement(By.xpath("//*[@text='Note with reminder']")).getText();
	    	Assert.assertEquals(reminder, "Note with reminder");	
	    }

}
