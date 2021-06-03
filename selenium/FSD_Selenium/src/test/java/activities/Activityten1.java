package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activityten1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		Actions actions = new Actions(driver);
		driver.get("https://www.training-support.net/selenium/input-events");
		
		System.out.println(driver.getTitle());
		WebElement cube = driver.findElement(By.id("wrapD3Cube"));
		actions.click(cube);
		
		System.out.println(driver.findElement(By.className("active")).getText());
		
		
		actions.doubleClick(cube).perform();
		System.out.println(driver.findElement(By.className("active")).getText());
		
		actions.contextClick(cube).perform();
		System.out.println(driver.findElement(By.className("active")).getText());
		driver.close();
		
		

	}

}
