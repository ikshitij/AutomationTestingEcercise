package base;

import java.time.Duration;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class coreFunctionalities {
	public static WebDriver driver = new ChromeDriver();
    public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    public static JavascriptExecutor js = (JavascriptExecutor) driver;

	public void checkVisibility(WebElement element) 
		{
		wait.until(ExpectedConditions.visibilityOf(element));
		System.out.println(element.toString()+"Element is Visible");
		}

	public void click(WebElement element)
	{
		wait.until(ExpectedConditions.elementToBeClickable(element));

		try {
            element.click();
    		System.out.println(element.toString()+"Element is clicked");

        } catch (ElementClickInterceptedException | NoSuchElementException | StaleElementReferenceException e) {
            System.out.println("ElementClickInterceptedException caught. Using JavaScriptExecutor to click.");
            js.executeScript("arguments[0].click();", element);
    		System.out.println(element.toString()+"Element is clicked");
            System.out.println("Clicked using JavaScriptExecutor.");
        }
		
	}

	public void sendkeys(WebElement element, String text) 
		{
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.sendKeys(text);
		System.out.println("Entered "+ text.toString() + "Text to"+ element.getTagName()+ "Input Box");
		}



}
