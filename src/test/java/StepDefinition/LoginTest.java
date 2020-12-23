package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.BaseClass;

public class LoginTest extends BaseClass {
	

@Given("^I am on the login page$")
public void i_am_on_the_login_page()  {
	openBrowser();
	Driver.get("https://login.salesforce.com");
   
}

	@Given("^I enter valid username as \"([^\"]*)\"$")
	public void i_enter_valid_username_as(String username)  {
		Driver.findElement(By.id("username")).sendKeys(username);
	  
	}

	@Given("^I enter valid password as \"([^\"]*)\"$")
	public void i_enter_valid_password_as(String password)  {
		Driver.findElement(By.id("password")).sendKeys(password);
	
}


@When("^I click the login button$")
public void i_click_the_login_button()  {
	Driver.findElement(By.id("Login")).click();
 
}

@Then("^I should see the dashboardtion$")
public void i_should_see_the_dashboardtion()  {
	Assert.assertTrue(Driver.findElement(By.linkText("Accounts")).isDisplayed());
 
}
	
	
	

}
