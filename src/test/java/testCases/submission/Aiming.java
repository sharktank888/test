package testCases.submission;

import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.Base;
import utilities.Constants;
import utilities.PageInitialiser;

public class Aiming extends PageInitialiser {

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

	@Test
	public void cl2_102() {
		Assert.assertEquals(hp.footerSections.size(), Constants.footerSections);
		String expected;
		String actual;
		for (int i = 0; i < hp.footerSectionList().size(); i++) {
			expected = hp.footerSectionList().get(i);
			actual = hp.footerSectionHeadings.get(i).getText();
			Assert.assertEquals(expected, actual);
		}
		Assert.assertEquals(hp.footerSectionLinks.size(), Constants.footerSectionLinks);
		String currUrl;
		String newUrl;
		Set<String> windows;
		Iterator<String> it;
		String main;
		String child;
		for (int i = 0; i < hp.footerSectionLinks.size(); i++) {
			currUrl = Base.getDriver().getCurrentUrl();
			hp.footerSectionLinks.get(i).click();
			windows = Base.getDriver().getWindowHandles();
			it = windows.iterator();
			if (windows.size() >= 2) {
				main = it.next();
				child = it.next();
				Base.getDriver().switchTo().window(child);
				newUrl = Base.getDriver().getCurrentUrl();
				Assert.assertFalse(newUrl.equals(currUrl));
				Base.getDriver().close();
				Base.getDriver().switchTo().window(main);
			}
			else {
				newUrl = Base.getDriver().getCurrentUrl();
				Assert.assertFalse(newUrl.equals(currUrl));
				if (newUrl.equals(Base.getProperty("OfficeAndFoodserviceCoffee"))) {
					Base.getDriver().navigate().back();
				}
				Base.getDriver().navigate().back();
			}
			Assert.assertTrue(currUrl.equals(Base.getProperty("url")));
		}
	}
	
	@Test
	public void cl2_101() {
		Assert.assertTrue(hp.aboutUsSection.isDisplayed());
		hp.clickFooterSectionLinks(Base.getProperty("stories"));
		Assert.assertEquals(Base.getDriver().getCurrentUrl(), Base.getProperty("storiesURL"));
		Assert.assertEquals(sp.LatestNews.getText(), Base.getProperty("latestNews"));
	}

}
