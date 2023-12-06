package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.page_utility;

public class qalegendLoginPage {
	WebDriver driver ;
	@FindBy(name="email")
	WebElement username_field;
	@FindBy(name="password")
	WebElement password_field;
	@FindBy(xpath =" //button[text()='Sign in']")
	WebElement Sign_in_btn;
	@FindBy(xpath = "//span[text()='Authentication failed!']")
	WebElement login_error;
	
	
	
	
	
	public qalegendLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	
	public void loginUsernameField(String userName ) {
		page_utility.enterTExt(username_field, userName); 
	}
	public void loginPasswordField(String Password) {
		page_utility.enterTExt(password_field, Password); 
	}
	public void signinbutton() {
		page_utility.clickOnElement(Sign_in_btn); 
	}
	public Boolean loginErrorMessageVerification() {
		return (page_utility.isElementDisplayed(login_error));
	}
	
	
}


	
