package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://www.training-support.net/selenium/selects");
        WebElement chosen = driver.findElement(By.id("single-value"));
        Select dropdown = new Select(driver.findElement(By.id("single-select")));
        dropdown.selectByVisibleText("Option 2");
        System.out.println(chosen.getText());
        
        
        

	}

}
