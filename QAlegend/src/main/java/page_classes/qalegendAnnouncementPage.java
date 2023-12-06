package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.page_utility;

public class qalegendAnnouncementPage {
	
	WebDriver driver;
	@FindBy(xpath = "//a[@title='Add announcement']")
	WebElement addannouncement_opt;
	@FindBy(name= "title")
	WebElement title_field;
	@FindBy(name = "start_date")
	WebElement start_date_field;
	@FindBy(name = "end_date")
	WebElement end_date_field;
	@FindBy(name = "share_with[]")
	WebElement share_with;
	@FindBy(xpath = "//span[@class='fa fa-check-circle']")
	WebElement save_btn;
	@FindBy (xpath = "//div[@class='p20 clearfix']")
	WebElement announcement_list_view;
	@FindBy(xpath = "//a[text()='ABCD']")
	WebElement title_view;
	@FindBy(xpath = "//i[@class='fa fa-eye-slash']")
	WebElement All_opt;
	@FindBy(xpath = "//li[text()='Title']")
	WebElement Title_btn;
	@FindBy(xpath = "//li[text()='Created by']")
	WebElement Created_by_btn;
	@FindBy(xpath = "//li[text()='Start date']")
	WebElement Start_date_btn;
	@FindBy(xpath = "//li[text()='End date']")
	WebElement End_date_btn;
	
	public qalegendAnnouncementPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}

public void addAnnouncementoption() {
	page_utility.clickOnElement(addannouncement_opt); 
}
public void titleField(String Title) {
	page_utility.enterTExt(title_field, Title); 
}
public void startDateField(String Startdate) {
	page_utility.enterTExt(start_date_field, Startdate); 
}
public void endDateField(String Enddate) {
    page_utility.enterTExt(end_date_field, Enddate);
}
public void shareWith(String Sharewith) {
	page_utility.enterTExt(share_with, Sharewith);
}
public void saveButton() {
	page_utility.clickOnElement(save_btn); 
}
public boolean announcementListView() {
	return(page_utility.isElementDisplayed(announcement_list_view) );
}
public boolean titleView() {
	return(page_utility.isElementDisplayed(title_view));
}
public void allOption() {
	page_utility.clickOnElement(All_opt);
}
public void titleButton() {
	page_utility.clickOnElement(Title_btn);
}
public void createdbyButton() {
	page_utility.clickOnElement(Created_by_btn);
}
public void startdateButton() {
	page_utility.clickOnElement(Start_date_btn);
}
public void enddateButton() {
	page_utility.clickOnElement(End_date_btn);
}
}
