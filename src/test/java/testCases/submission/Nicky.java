package testCases.submission;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.Base;
import utilities.PageInitialiser;

public class Nicky extends PageInitialiser{
  
	@Test
	public void cl2_77() {
		hp.clickFooterSectionLinks("Customer Service");
		csp.starbucksRewards.click();
		Base.getDriver().navigate().back();
		String expected = "Answers | Starbucks Coffee Company";
		String actual;
		for (int i = 0; i < csp.links.size(); i++) {
			csp.links.get(i).click();
			actual = Base.getDriver().getTitle();
			Assert.assertEquals(expected, actual);
			Base.getDriver().navigate().back();
		}
	}
	
	@Test
	public void cl2_80() {
		hp.clickFooterSectionLinks("Investor Relations");
	    irp.emailTextBox.click();
	    Assert.assertEquals(irp.checkboxList.size(), 6);
	    for (int i = 0; i < irp.checkboxList.size(); i++) {
	    	irp.checkboxList.get(i).click();
	    	Assert.assertTrue(irp.checkboxs.get(i).isSelected());
	    }
	    irp.emailTextBox.sendKeys(Base.getProperty("invalidEmail"));  
	    irp.signUpButton.click();
	    String expected = "Email Address is invalid";
	    String actual = irp.errorMessage.getText();
		Assert.assertTrue(actual.contains(expected));
	}
	
}
