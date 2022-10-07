package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Base;

public class FindStorePage {

	public FindStorePage() {
		PageFactory.initElements(Base.getDriver(), this);
	}

	// Banu's
	@FindBy(name = "place")
	public WebElement locationInput;

    @FindBy(xpath = "//*[@id= 'js-content']/div/div[3]/main/div[2]")
    public WebElement locationText;
    // Aiming's added codes for Banu
    @FindBy(xpath = "//*[contains(@data-e2e,'address')]")
    public List<WebElement> addresses;

}