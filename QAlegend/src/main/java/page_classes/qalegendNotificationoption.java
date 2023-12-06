package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.page_utility;

public class qalegendNotificationoption {
	WebDriver driver;
	@FindBy (xpath = "//div[@class='panel-footer text-sm text-center']")
	WebElement see_all_opt;
	
	
	public qalegendNotificationoption(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
		// TODO Auto-generated constructor stub
	}	
	public void seeAllOption() {
		page_utility.clickOnElement(see_all_opt); 
	}
	}
