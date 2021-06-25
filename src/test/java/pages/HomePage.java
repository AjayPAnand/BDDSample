package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy(xpath="//span[@class='user-display']")
	WebElement userName;

	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contact;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean isuserDisplayed() {
		return userName.isDisplayed();
	}
	
	public void navigatecontactPage() {
	contact.click();
	}
}
