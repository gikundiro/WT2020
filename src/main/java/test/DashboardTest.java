package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardTest {
	
}


//3. type user name and password and submit,
driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("techfiosdemo@gmail.com");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc123");
driver.findElement(By.xpath("//button[contains(text(),'sign')]")).click(
		
//Explicit wait time give to
WebDriverWait wait = new WebDriverWait(driver, 60);