package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Base;

public class StoriesPage {
	
	public StoriesPage() {
		PageFactory.initElements(Base.getDriver(), this);
	}
	
	@FindBy(xpath = "//*[contains(@class,'cl-block__title')]")
	public WebElement LatestNews;
	
}
