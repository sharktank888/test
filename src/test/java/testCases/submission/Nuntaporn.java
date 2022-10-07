package testCases.submission;

import java.util.Locale;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import utilities.Base;
import utilities.PageInitialiser;

public class Nuntaporn extends PageInitialiser {

	FakeValuesService fakerValue = new FakeValuesService(new Locale("en-GB"), new RandomService());
	String randomEmail = fakerValue.bothify("????@gmail.com");
	
	@Test
	public void cl2_96() {
		hp.clickRightMenuTab("Join now");
		rp.firstName.sendKeys(Base.getProperty("firstName"));
		rp.lastName.sendKeys(Base.getProperty("lastName"));
		rp.email.sendKeys(randomEmail);
		rp.password.sendKeys(Base.getProperty("password"));
		rp.createAccountButton.click();
		Assert.assertTrue(rp.errorMessage.isDisplayed());
	}

	@Test
	public void cl2_165() throws InterruptedException {
		hp.clickTab("MENU");
		mp.clickSideNavMenu(Base.getProperty("subHeading"));
		String actual = mp.subHeading.getText();
		String expected = Base.getProperty("subHeading");
		Assert.assertEquals(actual, expected);
	}

}
