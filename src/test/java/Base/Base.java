package Base;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
	
	public WebDriver driver = new ChromeDriver();	
	
	@BeforeTest
	public void setup()
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //expecting to be used by every statement in child test class

		String URL = "http://automationexercise.com";
		driver.get(URL);
		
	}
	@AfterTest
	public void tearDown()
	{
		//WebDriver driver = new ChromeDriver();
		//driver.close();
	
	}
	
	///////////////////////////////////////////////////////////////////////////////
	//Setting up common optimized methods that will be used by all childs.
	
	public void checkVisibility(WebElement element) {
		boolean visibility = true;

			try{
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
				wait.until(ExpectedConditions.visibilityOf(element));
			
				visibility = false;
			}
			catch(Exception e) {
				
			}
		if(visibility) {	
			System.out.println(" The WebElement"+ element.toString()+ "is not Visible. Tried For 10 Seconds");
		}
	
		
	}
	
	public void click(WebElement element) {
		boolean clickable = true;
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		clickable = false;
		}catch(Exception e) {
			
		}
		if(clickable) {
			System.out.println("The WebElement"+ element.toString() +"is not clickable. Tried for 10 seconds");
		}
	}
	
	
	
	public void Assert(String Actual, String Expected) {
		
	}

}
