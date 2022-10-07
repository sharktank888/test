package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Base;

public class MenuPage {
	
	public MenuPage() {
		PageFactory.initElements(Base.getDriver(), this);
	}

	// Nuntaporn's
	@FindBy(xpath = "//*[@id='content']/div[2]/div/div/h1")
	public WebElement subHeading;
	
	
	// Banu's
	@FindBy(xpath = "//*[text() = 'Cold Drinks']")
	public WebElement coldDrinksButton;
	// Aiming's added codes for Banu
	@FindBy(xpath = "//li[contains(@class,'my3')]/a")
	public List<WebElement> sideNav;
	
	public void clickSideNavMenu(String product) {
		JavascriptExecutor js = (JavascriptExecutor)Base.getDriver();
		for (WebElement each : sideNav) {
			if (each.getText().contains(product)) {
				js.executeScript("arguments[0].click()", each);
				break;
			}
		}
	}
	
	@FindBy(xpath = "//*[contains(@data-e2e,'Mango Dragonfruit Starbucks Refreshers® Beverage')]")
	public WebElement mangoDragonfruitDrink;
	
	@FindBy(xpath = "//*[@id='Trenta']")
	public WebElement cupSizeTrenta;
	
	
	// Stas's
	@FindBy(xpath = "//*[@id=\"americanos\"]/div/div/div/a")
	public WebElement americano;
	
	@FindBy(xpath = "//*[contains(@class,'radioButton___1xrBQ')]")
	public List<WebElement> sizeOptions;
	
}
