package testCases.submission;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.Base;
import utilities.Common;
import utilities.PageInitialiser;

public class Kaned extends PageInitialiser {

	@Test
	public void cl2_51() {
		hp.clickTab("REWARDS");
		((JavascriptExecutor) Base.getDriver()).executeScript("scroll(0,1200)");
		Assert.assertEquals(RP.valueTab.size(), 5);
		for (int i = 0; i < RP.valueTab.size(); i++) {
			RP.valueTab.get(i).click();
			Common.waitForVisibility(RP.description);
			String txt = RP.description.getText();
			Assert.assertTrue(txt.contains(RP.headings().get(i)));
		}
	}
	
	@Test
	public void cl2_63() {
		hp.clickFooterSectionLinks("Delivery");
		String mainTab = Base.getDriver().getWindowHandle();
		Common.switchToChildWindow();
		dp.orderNow.click();
		Base.getDriver().close();
		Base.getDriver().switchTo().window(mainTab);
		Common.switchToChildWindow();
		String url = Base.getDriver().getCurrentUrl();
		Assert.assertTrue(url.contains("www.ubereats.com"));
	}

}
