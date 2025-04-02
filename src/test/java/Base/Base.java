package Base;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {
	
	String URL = "";
	
	@BeforeClass
	public void setup(String URL)
	{
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		
	}
	@AfterClass
	public void tearDown()
	{
		WebDriver driver = new ChromeDriver();
		driver.close();
	
	}

}
