package testCases.submission;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.Base;
import utilities.PageInitialiser;

public class Stas extends PageInitialiser {

	@Test
	public void cl2_49() {
		hp.clickTab("MENU");
		mp.clickSideNavMenu("Hot Coffees");
		Assert.assertEquals(mp.subHeading.getText(), "Hot Coffees");
	}

	@Test
	public void cl2_52() {
		hp.clickTab("MENU");
		mp.clickSideNavMenu("Hot Coffees");
		mp.americano.click();
		Assert.assertEquals(mp.sizeOptions.size(), 4);
		WebElement cupSize;
		JavascriptExecutor js = (JavascriptExecutor)Base.getDriver();
		for (int i = 0; i < mp.sizeOptions.size(); i++) {
			cupSize = mp.sizeOptions.get(i);
			js.executeScript("arguments[0].click()", cupSize);
			Assert.assertTrue(mp.sizeOptions.get(i).isSelected());
		}
	}

}