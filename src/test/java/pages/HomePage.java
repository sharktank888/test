package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Base;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(Base.getDriver(), this);
	}

	// Aiming's
	@FindBy(xpath = "//*[contains(@class,'sm-mr1')]/a")
	public List<WebElement> socialMediaIcons;

	@FindBy(xpath = "//*[contains(@class,'sb-globalNav__desktopListItem')]/a")
	public List<WebElement> menuTab;

	public void clickTab(String tabName) {
		for (WebElement eachTab : menuTab) {
			if (eachTab.getText().contains(tabName)) {
				eachTab.click();
				break;
			}
		}
	}

	@FindBy(xpath = "//*[@id='__next']/div[2]/div/div/footer/nav/div/div[2]")
	public WebElement aboutUsSection;

	@FindBy(xpath = "//*[contains(@class,'lg-inline-block')]")
	public List<WebElement> footerSections;

	@FindBy(xpath = "//*[contains(@class,'lg-inline-block')]/ul/li/a")
	public List<WebElement> footerSectionLinks;

	@FindBy(xpath = "//*[contains(@class,'text-sm mb4')]")
	public List<WebElement> footerSectionHeadings;

	public void clickFooterSectionLinks(String link) {
		for (WebElement eachLink : footerSectionLinks) {
			if (eachLink.getText().contains(link)) {
				eachLink.click();
				break;
			}
		}
	}

	public List<String> footerSectionList() {
		List<String> list = new ArrayList<>();
		list.add(Base.getProperty("about"));
		list.add(Base.getProperty("careers"));
		list.add(Base.getProperty("social"));
		list.add(Base.getProperty("business"));
		list.add(Base.getProperty("order"));
		return list;
	}

	
	// Nuntaporn's
	@FindBy(xpath = "//*[@id='__next']/header/nav/div[1]/div/div[2]/div[2]/div/a")
	public List<WebElement> rightMenuTab;

	public void clickRightMenuTab(String name) {
		for (WebElement tab : rightMenuTab) {
			if (tab.getText().contains(name)) {
				tab.click();
				break;
			}
		}
	}

    
	// Banu's
    @FindBy(xpath= "//*[text()= 'Find a store']")
    public WebElement findAStoreButton;

}
