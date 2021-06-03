package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activityExample {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium");
		//driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/button")).click();
		//driver.findElement(By.xpath("//button[contains(@class, 'blue')]")).click();
		//driver.findElement(By.xpath("//button[@onclick='showContent()']")).click();
		driver.findElement(By.xpath("//button[text()='Get Started!']")).click();
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]")).getText());
		driver.close();
	}

}
