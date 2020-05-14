package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckSearchBox {

	@Test
	public void searchcustomer() {
		
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	
	WebDriver driver = new ChromeDriver();
	
    driver.get("http://techfios.com/test/billing/?ng=login/");
    
  

    driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");


    driver.findElement(By.id("password")).sendKeys("abc123");

    driver.findElement(By.name("login")).click();
    
    driver.findElement(By.name("name")).sendKeys("jack");
    
    driver.close();

 
    driver.quit();

	
	}

}
