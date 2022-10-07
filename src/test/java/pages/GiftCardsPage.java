package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Base;

public class GiftCardsPage {
	
	public GiftCardsPage() {
		PageFactory.initElements(Base.getDriver(), this);
	}
	
	@FindBy(xpath = "//*[@id='content']/div[1]/div/div[1]/div[1]/a")
	public WebElement featuredSeeAllButton;
	
	@FindBy(xpath = "//*[contains(@class,'list___3wC4p')]/li/a")
	public List<WebElement> featuredGiftCards;
	
	@FindBy(xpath = "//*[contains(@class,'lg-mb5')]/a/span")
	public WebElement GiftCardsButton;
	
	@FindBy(xpath = "//*[@id='subnavPrimaryId']")
	public WebElement createGiftCard;
	
}
