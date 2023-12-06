package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.page_utility;

public class qalegendHomePage {
	WebDriver driver;
	@FindBy(xpath = "//span[text()='Dashboard']")
	WebElement dashBoardBtn;
	@FindBy(xpath ="//i[@class='fa fa-sign-out font-16']")
	WebElement Leavepage_btn;
	@FindBy(xpath = "//i[@class='fa fa-envelope']")
	WebElement Messagepage_btn;
	@FindBy(xpath = "//i[@class='fa fa-bullhorn']")
	WebElement Announcementpage_btn;
	@FindBy(xpath = "//i[@class='fa fa-book font-16']")
	WebElement Notespage_btn;
	@FindBy(id =  "web-notification-icon")
	WebElement notification_opt;
	
	
	public qalegendHomePage (WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	
	}
	
	
	public boolean dashBoardButton()
	{
		return (page_utility.isElementDisplayed(dashBoardBtn));
	}
	public void leavePageButton() {
		page_utility.clickOnElement(Leavepage_btn);  
	}
	public void messagePageButton() {
		page_utility.clickOnElement(Messagepage_btn);
	}
	public void announcementPageButton() {
		page_utility.clickOnElement(Announcementpage_btn);
	}
	public  void notesPageButton() {
		page_utility.clickOnElement(Notespage_btn); 
	}
	public void notificationOption() {
		page_utility.clickOnElement(notification_opt); 
	}
	
}
		    
	   
	    
	
