package stepdefs;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class CRMStepDef extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	@Given("User is already on Login page")
	public void user_is_already_on_login_page() {
		initialize();
	}
	//Fetching as Maps
	@When("User enters login credential")
	public void user_enters_login_credentials(DataTable usrData) { 
		
		loginPage = new LoginPage();
		List<Map<String, String>> userdata = usrData.asMaps();
		loginPage.login(userdata.get(0).get("uname"),userdata.get(0).get("pwd"));
		
	}

	
	@Then("User is on homepage")
	public void user_is_on_homepage() {
		homePage = new HomePage();
		boolean isDisp = homePage.isuserDisplayed();
		Assert.assertTrue(isDisp);
	}
	
	@Then("Close browser")
	public void close_browser() {
		driver.close();
	}
	

}
