package page_classes;

import org.checkerframework.checker.units.qual.radians;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.page_utility;

public class qalegendLeavePage {
	
	WebDriver driver;
	
	
	@FindBy(xpath = "//a[text()='Pending approval']")
	WebElement pending_approval_field;
	@FindBy(xpath = "//a[text()='All applications']")
	WebElement all_application_field;
	@FindBy(xpath = "//a[text()='Summary']")
	WebElement summary_field;
	@FindBy(xpath = "//a[@title='Apply leave']")
	WebElement Applyleave_opt;
	@FindBy(xpath = "//div[@class='select2-container select2 validate-hidden']")
	WebElement leavetype_field;
	@FindBy (xpath = "//li[@class='select2-results-dept-0 select2-result select2-result-selectable']")
	WebElement casual_leave;
	@FindBy(xpath = "//label[@class='mr15']")
	WebElement duration_field;
	@FindBy(xpath =  "//input[@name='single_date']")
	WebElement date_field;
	@FindBy(xpath = "//td[text()='30']")
	WebElement date_select;
	@FindBy (xpath = "//textarea[@class='form-control']")
	WebElement reason_field;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement Applyleave_btn; 
	@FindBy(xpath = "//li[@class='active']")
	WebElement Pending_approval_view;
	@FindBy (xpath = "//a[@title='Assign leave']")
	WebElement Assignleave_opt;
	@FindBy(xpath = "//label[text()='Team member']")
	WebElement Teammember_field;
	@FindBy(xpath = "//label[text()='Leave type']")
	WebElement Leavetype_opt; 
	@FindBy(xpath = "//label[text()='Duration']")
	WebElement Duration_field;
	@FindBy (xpath = "//label[text()='Date']")
	WebElement Date_field;
	@FindBy (xpath = "//label[text()='Reason']")
	WebElement Reason_field;
	
	public qalegendLeavePage( WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}

    public Boolean pendingApprovalFieldVerification() {
		return(page_utility.isElementDisplayed(pending_approval_field));
		}
	public Boolean allApplicationFieldVerification() {
		return(page_utility.isElementDisplayed(all_application_field));
	}
	public Boolean summaryField() {
		return (page_utility.isElementDisplayed(summary_field));
	}
	public void applyLeaveoption() {
		page_utility.clickOnElement(Applyleave_opt); 
	}
	public void leaveTypeField() {
		page_utility.clickOnElement(leavetype_field);
	}
	public void casualLeave() {
		page_utility.clickOnElement(casual_leave); 
	}
	public void durationField1() {
		page_utility.clickOnElement(duration_field); 
	}
	public void dateField() {
		page_utility.clickOnElement(date_field); 
	}
	public void dateSelect() {
		page_utility.clickOnElement(date_select); 
	}
	public void reasonField( String Reason) {
		page_utility.enterTExt(reason_field,Reason);
	}
	public void applyLeavebutton() {
		page_utility.clickOnElement(Applyleave_btn);
	}
	public Boolean pendingApprovalView() {
		return (page_utility.isElementDisplayed( Pending_approval_view));
	}
	public void assignLeaveoption() {
		page_utility.clickOnElement(Assignleave_opt);
	}
	public Boolean teamMemberField() {
	return 	(page_utility.isElementDisplayed(Teammember_field));
	}
	public Boolean leaveTypeoption() {
		return (page_utility.isElementDisplayed (Leavetype_opt));
	}
	public Boolean durationField2() {
		return (page_utility.isElementDisplayed(Duration_field));
	}
	public Boolean dateFieldVerification() {
		return (page_utility.isElementDisplayed(Date_field));
	} 
	public Boolean reasonFieldVerification() {
		return (page_utility.isElementDisplayed(Reason_field));
	}
	
	
	public void leaveDetails(String LeaveType,String Date) {
	
	
	}
}