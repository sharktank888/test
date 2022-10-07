package testCases.submission;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.Base;
import utilities.Common;
import utilities.PageInitialiser;

public class Nelson extends PageInitialiser {

	@Test
	public void cl2_109() throws InterruptedException {
		hp.clickFooterSectionLinks("International Careers");
		cp.careersInUSA.click();
		String mainTab = Base.getDriver().getWindowHandle();
		Common.switchToChildWindow();
		cp.searchJobs.sendKeys("Barista", Keys.ENTER);
		Base.getDriver().close();
		Base.getDriver().switchTo().window(mainTab);
		Common.switchToChildWindow();
		Common.waitForClickability(cp.jobs.get(0));
		String job_a = "barista";
		String job_b = "shift supervisor";
		String actual;
		for (int i = 0; i < cp.jobs.size(); i++) {
			actual = cp.jobs.get(i).getText();
			Assert.assertTrue(actual.contains(job_a) || actual.contains(job_b));
		}
	}

	@Test
	public void cl2_104() {
		hp.clickFooterSectionLinks("Customer Service");
		csp.search.sendKeys("eGift", Keys.ENTER);
		csp.firstLink.click();
		String actual = csp.response.getText();
		String expected = "outside of the U.S or Canada";
		Assert.assertTrue(actual.contains(expected));
	}

}
