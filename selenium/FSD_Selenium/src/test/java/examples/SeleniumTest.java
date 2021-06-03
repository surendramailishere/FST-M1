package examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://www.google.com");
        
        //Close the browser
        driver.close();
		
	}

}
