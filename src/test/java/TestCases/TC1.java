package TestCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;

public class TC1 extends Base {
	
	@Test
	public void test01RegisterUser() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //expecting to be used by every statement in child test class

		 String actualTitle = driver.getTitle();
	     String expectedTitle = "Automation Exercise";  // Expected title
	     Assert.assertEquals(actualTitle, expectedTitle, "Home Page is not loaded successfully");
	     System.out.println("The Homepage is visible");
	     
	     
	     
	     
		 
		
	}
	

}
