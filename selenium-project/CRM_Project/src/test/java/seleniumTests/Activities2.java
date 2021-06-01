package seleniumTests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activities2 {
WebDriver driver;
	
	@BeforeMethod
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm/index.php?action=Login&module=Users");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
	}
	@Test(enabled = false)
	public void activity7() throws InterruptedException {
		driver.findElement(By.id("user_name")).click();
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).click();
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("grouptab_0")));
		driver.findElement(By.id("grouptab_0")).click();
		driver.findElement(By.id("moduleTab_9_Leads")).click();
		WebDriverWait wait1 = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Additional Details']")));
		List<WebElement> list = driver.findElements(By.xpath("//*[@title='Additional Details']"));
		list.get(2).click();
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.className("phone")));
		String mobile = driver.findElement(By.xpath("//span[@class='phone']")).getText();
		System.out.println(mobile);
	}
	@Test(enabled = false)
	public void activity8() {
		driver.findElement(By.id("user_name")).click();
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).click();
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("grouptab_0")));
		driver.findElement(By.id("grouptab_0")).click();
		driver.findElement(By.id("moduleTab_9_Accounts")).click();
		for(int i=1; i<=9; i+=2) {
			WebElement w = driver.findElement(By.xpath("//*[@class='list view table-responsive']/tbody/tr["+i+"]/td[3]"));
			String text = w.getText();
			System.out.println(text);}
		}
	@Test
	public void activity9() {
		driver.findElement(By.id("user_name")).click();
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).click();
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("grouptab_0")));
		driver.findElement(By.id("grouptab_0")).click();
		driver.findElement(By.id("moduleTab_9_Leads")).click();
		for(int i=1; i<=10; i++) {
			WebElement w = driver.findElement(By.xpath("//*[@class='list view table-responsive']/tbody/tr["+i+"]/td[3]"));
			String text = w.getText();
			System.out.println(text);}
		}	
	@AfterMethod
	public void afterTest() {
		driver.close();
	}
}
