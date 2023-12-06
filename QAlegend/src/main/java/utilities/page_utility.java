package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class page_utility {
public static void clickOnElement(WebElement element) {
	element.click();
}
public static void enterTExt(WebElement element,String value) {
	element.sendKeys(value);
}
public static String getElementText(WebElement element) {
	return(element.getText());
}
public static void clearText(WebElement element) {
	element.clear();
}
	public static void navigateToBack(WebDriver driver) {
		driver.navigate().back();
	}
	public static void navigateToNextPage(WebDriver driver) {
		driver.navigate().forward();
		
	}
	public static void navigateToRefresh(WebDriver driver) {
		driver.navigate().refresh();
	}
	public static String getAttributeValue(WebElement element, String attribute) {
		return element.getAttribute(attribute);
	}

	public static void moveToWebElement(WebElement element, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();

	}

	public void doubleClickOnElement(WebElement element, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).build().perform();
	}

	public void rightClickOnElement(WebElement element, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).build().perform();
	}

	public void clickAndHoldOnElement(WebElement element, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.clickAndHold(element).build().perform();
	}

	public void handleAlert(WebDriver driver) {
		driver.switchTo().alert();
	}

	public static void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	public void dismissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	public void enterTextAlert(WebDriver driver, String value) {
		driver.switchTo().alert().sendKeys(value);
	}

	public String getAlertText(WebDriver driver) {
		return driver.switchTo().alert().getText();
	}

	public static Boolean isElementDisplayed(WebElement element) {
		return element.isDisplayed();
	}

	public static Boolean isElementEnabled(WebElement element) {
		return element.isEnabled();
	}

	public static Boolean isElementSelected(WebElement element) {
		return element.isSelected();
	}

	public static String getPageTitle(WebDriver driver) {
		return driver.getTitle();
	}

	public static void HardWait() throws InterruptedException {
		Thread.sleep(2000);
	}

	public static void clickUsingJavaScriptExecutor(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

	public static void scrollToFindElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
	}

	public static void ScrollBy(WebDriver driver) {
		JavascriptExecutor Js1 = (JavascriptExecutor) driver;
		Js1.executeScript("window.scrollBy(0,1000)"); 
	}
	
	
	public static void selectDropdownbyText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	public static void selectDropdownbyValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	public static void selectDropdownbyIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
public static void EnterkeyPress(WebDriver driver,WebElement element){
		Actions actions=new Actions(driver);
		actions.sendKeys(element, Keys.ENTER).build().perform();
}
public static void CotrolKeyPress(WebDriver driver,WebElement element) {
	Actions actions=new Actions(driver);
	actions.sendKeys(element, Keys.CONTROL).build().perform();	
}
public static void EnterTextUsingJavaScript(WebElement element,WebDriver driver,String value) {
	JavascriptExecutor Js1 = (JavascriptExecutor) driver;
	Js1.executeScript("document.getElementBy(element).value=value");
	
	
	
}
}  
