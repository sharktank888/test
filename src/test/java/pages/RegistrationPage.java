package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Base;

public class RegistrationPage {

	public RegistrationPage() {
		PageFactory.initElements(Base.getDriver(), this);
	}

	// Nuntaporn's
	@FindBy(id = "firstName")
	public WebElement firstName;

	@FindBy(id = "lastName")
	public WebElement lastName;

	@FindBy(id = "emailAddress")
	public WebElement email;

	@FindBy(id = "password")
	public WebElement password;

	@FindBy(xpath = "//*[contains(@data-e2e,'createButton')]")
	public WebElement createAccountButton;

	@FindBy(xpath = "//*[@id='termsAndConditions-validationHint']/span/span")
	public WebElement errorMessage;

}
