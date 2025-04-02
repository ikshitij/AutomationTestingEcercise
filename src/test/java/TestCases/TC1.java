package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Base;

public class TC1 extends Base {
	
	@Test
	public void test01RegisterUser() {
		
		 String actualTitle = driver.getTitle();
	     String expectedTitle = "Automation Exercise";  // Expected title
	     Assert.assertEquals(actualTitle, expectedTitle, "Title does not match!");
	     System.out.println("The Homepage is visible");
	     
	     
		 
		
	}
	

}
