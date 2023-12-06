package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.page_utility;

public class qalegendMessagePage {
	WebDriver driver;
	@FindBy(xpath = "//a[@class='list-group-item']")
	WebElement Compose_btn;
	@FindBy(xpath = "//a[text()='Inbox']")
	WebElement Inbox_btn;
	@FindBy(xpath = "//a[text()='Sent items']")
	WebElement Sent_items_btn;
	
	public qalegendMessagePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	public boolean composeFieldVerification() {
		return(page_utility.isElementDisplayed(Compose_btn));
		}
	public boolean inboxFieldVerification() {
		return(page_utility.isElementDisplayed(Inbox_btn));
	}
	public boolean sentitemsFieldVerification() {
		return(page_utility.isElementDisplayed(Sent_items_btn));
	}
	
	
	

}
