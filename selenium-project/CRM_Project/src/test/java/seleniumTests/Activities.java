package seleniumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activities {
	WebDriver driver;
	
	@BeforeMethod
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm/index.php?action=Login&module=Users");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
	}
	@Test
	public void activity1() {
		Assert.assertEquals(driver.getTitle(), "SuiteCRM");
	}
	
	@Test
	public void activity2() {
		WebElement l = driver.findElement(By.xpath("//img"));
		System.out.println(l.getAttribute("src"));		
	}
	@Test
	public void activity3() {
		WebElement l = driver.findElement(By.id("admin_options"));
		System.out.println(l.getText());
	}
	@Test
	public void activity4() {
		driver.findElement(By.id("user_name")).click();
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).click();
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("grouptab_0")));	
	}
	@Test
	public void activity5() {
		driver.findElement(By.id("user_name")).click();
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).click();
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("grouptab_0")));
		WebElement l = driver.findElement(By.id("toolbar"));
		System.out.println(l.getCssValue("color"));
	}
	@Test
	public void activtiy6() {
		driver.findElement(By.id("user_name")).click();
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).click();
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("grouptab_0")));
		driver.findElement(By.id("grouptab_3")).isDisplayed();	
	}
	@Test(priority = 0)
	public void activity7() {
		driver.findElement(By.id("user_name")).click();
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).click();
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("grouptab_0")));
		driver.findElement(By.id("moduleTab_9_Leads")).click();;
	}
	@AfterMethod
	public void afterTest() {
		driver.close();
	}
	
}