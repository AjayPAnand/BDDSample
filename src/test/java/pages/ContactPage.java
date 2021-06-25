package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ContactPage extends TestBase{

	@FindBy(xpath="//div[@class='ui header item mb5 light-black']")
	WebElement contHead;
	
	@FindBy(xpath="//button[contains(text(),'Create')]")
	WebElement createCont;
	
	@FindBy(name="first_name")
	WebElement firstName;
	
	@FindBy(name="last_name")
	WebElement lastName;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement saveBtn;
	
	@FindBy(xpath="//div[@class='table-wrapper']//tbody//td//a")
	WebElement savedName;
	
	
	public ContactPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String contDisplay() {
		return contHead.getText();
	}
	
	public void clickCreateContact() {
		createCont.click();
	}
	
	public void enterValues() {
		firstName.sendKeys("Tester");
		lastName.sendKeys("Aew");
		saveBtn.click();
	}
	
	public boolean isNameSaved() {
		return savedName.isDisplayed();
	}
	
}
