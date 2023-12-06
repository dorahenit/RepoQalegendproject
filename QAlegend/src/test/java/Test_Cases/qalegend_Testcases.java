package Test_Cases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Automation_Core.Base_Class;
import page_classes.qalegendAnnouncementPage;
import page_classes.qalegendHomePage;
import page_classes.qalegendLeavePage;
import page_classes.qalegendLoginPage;
import page_classes.qalegendMessagePage;
import page_classes.qalegendNotesPage;
import page_classes.qalegendNotificationoption;
import utilities.ExcelUtility;
import utilities.page_utility;

public class qalegend_Testcases extends Base_Class{
	public WebDriver driver;
	qalegendLoginPage login_page;
	qalegendHomePage homePage;
	qalegendLeavePage leave_page;
	qalegendMessagePage message_page;
	qalegendAnnouncementPage announcement_page;
	qalegendNotesPage  notes_page;
	qalegendNotificationoption notification_opt;
	public static Properties prop;
	String excelFilePath1="/src/main/resources/Test_Data/User_details.xlsx";
	String excelFilePath2="/src/main/resources/Test_Data/Leave_details.xlsx";
	FileInputStream fs;
	@BeforeMethod
	@Parameters({"browser"})
	public void initialization(String BrowserName) throws Exception
	{
		driver=browserInstialization(BrowserName);
		login_page= new qalegendLoginPage(driver);
		homePage = new qalegendHomePage(driver);
		leave_page=new qalegendLeavePage (driver);
		 message_page=new qalegendMessagePage (driver);
		announcement_page=new qalegendAnnouncementPage(driver);
		notes_page=new qalegendNotesPage (driver);
		notification_opt=new qalegendNotificationoption(driver);
		prop = new Properties();
		//fs =new FileInputStream("C:\\Users\\DORA HENIT\\eclipse-workspace\\QAlegend\\src\\main\\resources\\Test_Data\\TestData.properties");
		fs =new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\Test_Data\\TestData.properties");
		prop.load(fs);
		driver.get(prop.getProperty("URL"));
}
	
	
	@Test
	public void tc01() throws IOException { 
		//login_page.userLogin(ExcelUtility.getString(1,0,excelFilePath,"Users"),ExcelUtility.getString(1, 1, excelFilePath,"Users");	
		
		login_page.loginUsernameField(ExcelUtility.getString(1,0,excelFilePath1,"Users"));
		login_page.loginPasswordField(ExcelUtility.getNumeric(1,1,excelFilePath1,"Users"));	
		login_page.signinbutton();
		Assert.assertEquals(homePage.dashBoardButton(),true);
		
	}
	
	
	
	@Test
	public void tc02() throws IOException{
	login_page.loginUsernameField(ExcelUtility.getString(2,0,excelFilePath1,"Users"));
	login_page.loginPasswordField(ExcelUtility.getNumeric(2,1,excelFilePath1,"Users"));	
	login_page.signinbutton();
	Assert.assertEquals(login_page.loginErrorMessageVerification(),true);
}
	
	
	
	@Test
	public void tc03()throws IOException {
		
		login_page.loginUsernameField(ExcelUtility.getString(1,0,excelFilePath1,"Users"));
		login_page.loginPasswordField(ExcelUtility.getNumeric(1,1,excelFilePath1,"Users"));	
		login_page.signinbutton();
		Assert.assertEquals(homePage.dashBoardButton(),true);
		homePage.leavePageButton();
		Assert.assertEquals(leave_page.pendingApprovalFieldVerification(),true);
		Assert.assertEquals(leave_page.allApplicationFieldVerification(),true);
		Assert.assertEquals(leave_page.summaryField(),true);

	}
	
	
	
	@Test
	public void tc04()throws IOException {
		login_page.loginUsernameField(ExcelUtility.getString(1,0,excelFilePath1,"Users"));
		login_page.loginPasswordField(ExcelUtility.getNumeric(1,1,excelFilePath1,"Users"));	
		login_page.signinbutton();
		Assert.assertEquals(homePage.dashBoardButton(),true);
		homePage.leavePageButton();
		Assert.assertEquals(leave_page.pendingApprovalFieldVerification(),true);
		Assert.assertEquals(leave_page.allApplicationFieldVerification(),true);
		Assert.assertEquals(leave_page.summaryField(),true);
		leave_page.applyLeaveoption();
		leave_page.leaveTypeField();
		leave_page.casualLeave();
		leave_page.durationField1();
		leave_page.dateField();
		leave_page.dateSelect();
		leave_page.reasonField(ExcelUtility.getString(1, 2, excelFilePath2, "Leave_detail"));
		leave_page.applyLeavebutton();
		Assert.assertEquals(leave_page.pendingApprovalView(), true);   
	}
		
	
	
	@Test
		public void tc05() throws IOException {
		login_page.loginUsernameField(ExcelUtility.getString(1,0,excelFilePath1,"Users"));
	    login_page.loginPasswordField(ExcelUtility.getNumeric(1,1,excelFilePath1,"Users"));	
	    login_page.signinbutton();
		Assert.assertEquals(homePage.dashBoardButton(),true);
		homePage.leavePageButton();
		Assert.assertEquals(leave_page.pendingApprovalFieldVerification(),true);
		Assert.assertEquals(leave_page.allApplicationFieldVerification(),true);
		Assert.assertEquals(leave_page.summaryField(),true);
		leave_page.assignLeaveoption();
		Assert.assertEquals(leave_page.teamMemberField(),true);
		Assert.assertEquals(leave_page.leaveTypeoption(),true);
		Assert.assertEquals(leave_page.durationField2(),true);
		Assert.assertEquals(leave_page.dateFieldVerification(),true);
		Assert.assertEquals(leave_page.reasonFieldVerification(),true);
		
		   
	}
		
	
	
	@Test
		public void tc06() throws IOException {
		login_page.loginUsernameField(ExcelUtility.getString(1,0,excelFilePath1,"Users"));
	    login_page.loginPasswordField(ExcelUtility.getNumeric(1,1,excelFilePath1,"Users"));	
	    login_page.signinbutton();
		Assert.assertEquals(homePage.dashBoardButton(),true);
		homePage.messagePageButton();
		Assert.assertEquals(message_page.composeFieldVerification(), true);
		Assert.assertEquals(message_page.inboxFieldVerification(),true);
		Assert.assertEquals(message_page.sentitemsFieldVerification(),true);
		}
		
	
	
	@Test
		public void tc07() throws IOException {
		    login_page.loginUsernameField(ExcelUtility.getString(1,0,excelFilePath1,"Users"));
		    login_page.loginPasswordField(ExcelUtility.getNumeric(1,1,excelFilePath1,"Users"));	
		    login_page.signinbutton();
			Assert.assertEquals(homePage.dashBoardButton(),true);
			homePage.announcementPageButton();
			announcement_page.addAnnouncementoption();
			announcement_page.titleField(ExcelUtility.getString(1, 0, excelFilePath2,"Announcement_detail"));
			announcement_page.startDateField(ExcelUtility.getNumeric(1, 1, excelFilePath2,"Announcement_detail"));
			announcement_page.endDateField(ExcelUtility.getNumeric(1, 2, excelFilePath2,"Announcement_detail"));
		    announcement_page.shareWith(ExcelUtility.getString(1, 3, excelFilePath2,"Announcement_detail"));
		    announcement_page.saveButton();
		    Assert.assertEquals(announcement_page.announcementListView(),true);
			Assert.assertEquals(announcement_page.titleView(), true);
		}
		
		
		
		@Test
		public void tc08() throws IOException {
			login_page.loginUsernameField(ExcelUtility.getString(1,0,excelFilePath1,"Users"));
			login_page.loginPasswordField(ExcelUtility.getNumeric(1,1,excelFilePath1,"Users"));	
			login_page.signinbutton();
			Assert.assertEquals(homePage.dashBoardButton(),true);
			homePage.announcementPageButton();
			announcement_page.allOption();
			announcement_page.titleButton();
			announcement_page.createdbyButton();
			announcement_page.startdateButton();
		    announcement_page.enddateButton();
		}
		
		
		
		@Test
		public void tc09() throws IOException {
			login_page.loginUsernameField(ExcelUtility.getString(1,0,excelFilePath1,"Users"));
			login_page.loginPasswordField(ExcelUtility.getNumeric(1,1,excelFilePath1,"Users"));	
			login_page.signinbutton();
			Assert.assertEquals(homePage.dashBoardButton(),true);
			homePage.notesPageButton();
			notes_page.addNotesOption();
			notes_page.titleField(ExcelUtility.getString(1,0,excelFilePath2,"Notes_detail"));
		    notes_page.descriptionField(ExcelUtility.getString(1,1,excelFilePath2,"Notes_detail"));
		    notes_page.saveButton();
		}
		
		
		
		@Test
		public void tc10() throws IOException {
			login_page.loginUsernameField(ExcelUtility.getString(1,0,excelFilePath1,"Users"));
			login_page.loginPasswordField(ExcelUtility.getNumeric(1,1,excelFilePath1,"Users"));	
			login_page.signinbutton();
			Assert.assertEquals(homePage.dashBoardButton(),true);
			homePage.notificationOption();
			notification_opt.seeAllOption();
		}}
	
	
	
