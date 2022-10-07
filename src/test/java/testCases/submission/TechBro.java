package testCases.submission;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.Base;
import utilities.Common;
import utilities.PageInitialiser;

public class TechBro extends PageInitialiser {
    
	@Test
	public void cl2_117() {
		hp.clickRightMenuTab("Sign in");
		sip.email.sendKeys(Base.getProperty("EMAIL"));
		sip.password.sendKeys("PASSWORD");
		sip.signInButton.click();
		String expectedErrorMsg = "Sign in unsuccessful.";
		Common.waitForVisibility(sip.errorMessage);
		String actualErrorMsg = sip.errorMessage.getText();
		Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
	}
    
    @Test
    public void cos_120() {
        hp.clickFooterSectionLinks("Order and Pickup Options");
        String expectedTitle = "Ordering & Delivery";
        String actualTitle = Base.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
   
}
