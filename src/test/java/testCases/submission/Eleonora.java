package testCases.submission;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.Base;
import utilities.Constants;
import utilities.PageInitialiser;

public class Eleonora extends PageInitialiser {

	@Test
	public void cl2_130() {
		String expected;
		String actual;
		Assert.assertEquals(hp.socialMediaIcons.size(), 6);
		for (int i = 0; i < hp.socialMediaIcons.size(); i++) {
			expected = hp.socialMediaIcons.get(i).getAttribute(Base.getProperty("aria-label"));
			hp.socialMediaIcons.get(i).click();
			actual = Base.getDriver().getCurrentUrl();
			Assert.assertTrue(actual.contains(expected));
			Assert.assertTrue(actual.toLowerCase().contains(Base.getProperty("starbucks")));
			Base.getDriver().navigate().back();
		}
	}

	@Test
	public void cl2_131() {
		hp.clickTab(Base.getProperty("giftCards"));
		gcp.featuredSeeAllButton.click();
		int size = gcp.featuredGiftCards.size();
		Assert.assertEquals(size, Constants.featuredGiftCardsSize);
		for (int i = 0; i < size; i++) {
			gcp.featuredGiftCards.get(i).click();
			String text = gcp.createGiftCard.getText();
			Assert.assertEquals(text, Base.getProperty("createGiftCard"));
			gcp.GiftCardsButton.click();
			gcp.featuredSeeAllButton.click();
		}
	}

}
