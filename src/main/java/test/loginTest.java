package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginTest {

	@Test
	public void logintotechfios() {
		
		//Setting ChromeDriver properties
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
        // Create an object of ChromeDriver. will open ChromeDriver
	      WebDriver driver = new ChromeDriver();
	      
	      // Go to a specific url_
	      driver.get("http://techfios.com/test/billing/?ng=login/");
	      
	    //for identifying a certain element we are using findelement
	      //for typing in the element we are using sendkeys.

	      driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");


	      driver.findElement(By.id("password")).sendKeys("abc123");

	      //use use click on an element.
	      driver.findElement(By.name("login")).click();

	      //driver.close will close the browser
	      driver.close();

	      //driver.quit will end the test case
	      driver.quit();

	      
	      
	     

	}	
}
