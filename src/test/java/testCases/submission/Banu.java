package testCases.submission;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.Base;
import utilities.PageInitialiser;

public class Banu extends PageInitialiser {

	@Test
	public void cl2_27() {
		hp.findAStoreButton.click();
		fsp.locationInput.sendKeys(Base.getProperty("location"), Keys.ENTER);
		// Aiming's added codes for Banu
		String expected_a = Base.getProperty("suburb_a");
		String expected_b = Base.getProperty("suburb_b");
		String expected_c = Base.getProperty("suburb_c");
		String actual;
		for (int i = 0; i < fsp.addresses.size(); i++) {
			actual = fsp.addresses.get(i).getText();
			Assert.assertTrue(actual.contains(expected_a) 
						   || actual.contains(expected_b) 
						   || actual.contains(expected_c));
		}
	}

	@Test
	public void cl2_32() {
		hp.clickTab(Base.getProperty("menu"));
		mp.clickSideNavMenu(Base.getProperty("coldDrinks"));
		mp.mangoDragonfruitDrink.click();
		JavascriptExecutor js = (JavascriptExecutor)Base.getDriver();
		WebElement cupSize = mp.cupSizeTrenta;
		js.executeScript("arguments[0].click()", cupSize);
		Assert.assertTrue(cupSize.isSelected());
	}

}