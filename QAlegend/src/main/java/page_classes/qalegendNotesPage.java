package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.page_utility;

public class qalegendNotesPage {
	WebDriver driver;	
	@FindBy(xpath = "//div[@class='title-button-group']")
	WebElement addnotes_opt;
	@FindBy(name = "title")
	WebElement title_field;
	@FindBy(xpath = "//textarea[@name='description']")
	WebElement description_field;
	@FindBy (xpath = "//button[text()=' Save']")
	WebElement savee_btn;
	
	
	public qalegendNotesPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	public void addNotesOption() {
		page_utility.clickOnElement(addnotes_opt); 
	}
	public void titleField(String Title ) {
		page_utility.enterTExt(title_field, Title);
	}
	public void descriptionField(String Description) {
		page_utility.enterTExt(description_field, Description); 
	}
	public void saveButton() {
		page_utility.clickOnElement(savee_btn);
	}
	}
