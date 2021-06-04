package activities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ActivityEx {
	   AppiumDriver<MobileElement> driver = null;
	    
	    @BeforeClass
	    public void beforeClass() throws MalformedURLException {
	        // Set the Desired Capabilities
	        DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("deviceName", "Pixel 4 A11");
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("appPackage", "com.google.android.apps.tasks");
	        caps.setCapability("appActivity", ".ui.TaskListsActivity");
	        caps.setCapability("noReset", true);

	        // Instantiate Appium Driver
	        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
	        driver = new AndroidDriver<MobileElement>(appServer, caps);
	    }
	
	    @Test()
	    public void firstTask() throws InterruptedException {
	    	//driver.findElement(By.xpath("//*[@text='Get started']")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//*[@bounds='[463,1884][617,1977]']")).click();
	    	Thread.sleep(1000);
	    	driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).click();
	    	driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).sendKeys("Complete Activity with Google Tasks");
	    	driver.findElement(By.id("com.google.android.apps.tasks:id/add_task_done")).click();
	    	Thread.sleep(1000);
	    	driver.findElement(By.xpath("//*[@bounds='[463,1884][617,1977]']")).click();
	    	Thread.sleep(1000);
	    	driver.findElement(By.xpath("//*[@bounds='[66,1145][1014,1277]']")).click();
	    	driver.findElement(By.xpath("//*[@bounds='[66,1145][1014,1277]']")).sendKeys("Complete Activity with Google Keep");
	    	driver.findElement(By.id("com.google.android.apps.tasks:id/add_task_done")).click();
	    	Thread.sleep(1000);
	    	driver.findElement(By.xpath("//*[@bounds='[463,1884][617,1977]']")).click();
	    	Thread.sleep(1000);
	    	driver.findElement(By.xpath("//*[@bounds='[66,1145][1014,1277]']")).click();
	    	driver.findElement(By.xpath("//*[@bounds='[66,1145][1014,1277]']")).sendKeys("Complete the second Activity Google Keep");
	    	driver.findElement(By.id("com.google.android.apps.tasks:id/add_task_done")).click();
	    	Thread.sleep(1000);
	    	String text1 = driver.findElement(By.xpath("//*[@content-desc=\'Complete Activity with Google Tasks\']")).getText();
	    	String text2 = driver.findElement(By.xpath("//*[@content-desc=\'Complete Activity with Google Keep\']")).getText();
	    	String text3 = driver.findElement(By.xpath("//*[@content-desc=\'Complete the second Activity Google Keep\']")).getText();
	    	Assert.assertEquals(text1, "Complete Activity with Google Tasks");
	    	Assert.assertEquals(text2, "Complete Activity with Google Keep");
	    	Assert.assertEquals(text3, "Complete the second Activity Google Keep");
	    }

}
