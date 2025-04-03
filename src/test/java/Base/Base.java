package base;


import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base extends coreFunctionalities{
	
	
	@BeforeTest
	public void setup()
	{
		

		String URL = "http://automationexercise.com";
		driver.get(URL);
		
	}
	@AfterTest
	public void tearDown()
	{
		//WebDriver driver = new ChromeDriver();
		//driver.close();
	
	}
	
	
	

}
