package StepDefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;
import utilities.BaseClass;

public class AccountTest extends BaseClass {
	

private static final Select New = null;

@Then("^I click Accounts field$")
public void i_click_Accounts_field()  {
	Driver.findElement(By.linkText("Accounts")).click();
			
  ;
}

@Then("^I click new button$")
public void i_click_new_button() {
	Driver.findElement(By.name("new")).click();
}

@Then("^I should see all the type options$")
public void i_should_see_all_the_type_options()  {
	String expectedType[] = {"--None--","--Prospect--","Customer -Direct","Customer - Channel","Channel Partner / Reseller","Installation Partner", "Technology Partner", "Other"};
	
	WebElement Type =Driver.findElement(By.id("acc6"));
	Select typeSel= new Select (Type);
	List <WebElement> typeOptions =typeSel.getOptions();
	for (int i = 0; i < typeOptions.size(); i++ ) {
		Assert.assertEquals(expectedType[i], typeOptions.get(i).getText());
		
	}
	
	
   
}
	
	
	
	
	

}
