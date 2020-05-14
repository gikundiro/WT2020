package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddContactTest {
	

	@Test  
    public void userShouldBeAbleToAddContact() throws InterruptedException {
    	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe"); 
   	    WebDriver driver =new ChromeDriver();
	 
	 //set certain properties
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	//Implicit wait,Applies to all, set it once at the beginning
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 
	 //2. Go to techfios site,
	 driver.get("http://techfios.com/test/billing/?ng=admin/");
	 //3. type user name and password and submit,
	 driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("techfiosdemo@gmail.com");
     driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc123");
	 driver.findElement(By.xpath("//button[contains(text(), 'Sign')]")).click();
	 
	//Store an Element
	 WebElement PAGE_TITLE_ELEMENT = driver.findElement(By.xpath("//h2[contains(),'Dashboard')]"));
	 By PAGE_TITLE_LOCATOR = By.xpath("//h2[contains(),'Dashboard')]");
	 
	 
	// Explicit wait given to the driver
	 int number = 98734;
	 String something = "sljdflsjdfldslfj";
	 
	 WebDriverWait wait = new WebDriverWait(driver, 60);
	 
	 //store an Element
	 WebElement PAGE_TITLE_ELEMENT1 = driver.findElement(By.xpath("//h2[contains(text(),'Dashboard')]"));	 
	 PAGE_TITLE_ELEMENT1.isDisplayed();
	 
//	 //To stop and observe, but do not use unless you have to
//	 Thread.sleep(3000);
//	 
//	 //Close the browser
//	 driver.close();	 //End the webDriver session
//	 driver.quit();


	

	

    }	
	
}
