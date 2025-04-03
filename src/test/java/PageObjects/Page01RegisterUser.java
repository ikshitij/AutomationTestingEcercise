package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import base.Base;
import base.coreFunctionalities;

public class Page01RegisterUser extends Base {
	
	
	@FindBy(xpath="//a[text()=' Signup / Login']")
	@CacheLookup
	WebElement SignUpOrLoginButton;
	
	@FindBy(xpath="//h2[text()=\"New User Signup!\"]")
	@CacheLookup
	WebElement NewUserSignUPText;

	@FindBy(xpath="//input[@name=\"name\"]")
	@CacheLookup
	WebElement NameInput;

	@FindBy(xpath="//input[@name=\"email\" and  @data-qa=\"email\"]")
	@CacheLookup
	WebElement EmailInputSignup;
	
	@FindBy(xpath="//button[text()=\"Signup\"]")
	@CacheLookup
	WebElement SignUpButton;
	
	
	@FindBy(id="//b[text()='Enter Account Information']")
	@CacheLookup
	WebElement EnterAccountInformationText;
	
	@FindBy(xpath="//input[@id='id_gender1']")
	@CacheLookup
	WebElement MrTitleRadioButton;
	
	@FindBy(id="")
	@CacheLookup
	WebElement element;
	
	@FindBy(id="")
	@CacheLookup
	WebElement element;
	
	@FindBy(id="")
	@CacheLookup
	WebElement element;
	
	@FindBy(id="")
	@CacheLookup
	WebElement element;
	
	@FindBy(id="")
	@CacheLookup
	WebElement element;
	
	@FindBy(id="")
	@CacheLookup
	WebElement element;
	
	@FindBy(id="")
	@CacheLookup
	WebElement element;
	
	@FindBy(id="")
	@CacheLookup
	WebElement element;
	
	@FindBy(id="")
	@CacheLookup
	WebElement element;
	
	@FindBy(id="")
	@CacheLookup
	WebElement element;
	
	@FindBy(id="")
	@CacheLookup
	WebElement element;
	
	@FindBy(id="")
	@CacheLookup
	WebElement element;
	
	@FindBy(id="")
	@CacheLookup
	WebElement element;
	
	@FindBy(id="")
	@CacheLookup
	WebElement element;
	
	@FindBy(id="")
	@CacheLookup
	WebElement element;
	
	@FindBy(id="")
	@CacheLookup
	WebElement element;
	
	@FindBy(id="")
	@CacheLookup
	WebElement element;
	


//	3. Verify that home page is visible successfully--done in testcase

//	4. Click on 'Signup / Login' button
public void clickOnSignUpOrLoginButton() {
	click(SignUpOrLoginButton);
}
//	5. Verify 'New User Signup!' is visible
public void Check_VerifyNewUserSignupVisibility() {
	checkVisibility(NewUserSignUPText);
}

//	6. Enter name and email address
public void enterNameAndEmailAddress() {
	sendkeys(NameInput,"Tiger");
	sendkeys(EmailInputSignup,"Tiger@forest.com");	
}

//	7. Click 'Signup' button
public void clickOnSignupbutton() {
	click(SignUpButton);
}

//	8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
public void enterAccoutInformationTextVisibility() {
	checkVisibility(EnterAccountInformationText);
}

//	9. Fill details: Title, Name, Email, Password, Date of birth
public void fillUserDetails() {
	click(MrTitleRadioButton);
	
	

//	10. Select checkbox 'Sign up for our newsletter!'
//
//	11. Select checkbox 'Receive special offers from our partners!'
//
//	12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
//
//	13. Click 'Create Account button'
//
//	14. Verify that 'ACCOUNT CREATED!' is visible
//
//	15. Click 'Continue' button
//
//	16. Verify that 'Logged in as username' is visible
//
//	17. Click 'Delete Account' button
//
//	18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
	
	

}
