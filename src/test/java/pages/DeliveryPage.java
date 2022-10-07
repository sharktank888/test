package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Base;

public class DeliveryPage {

	public DeliveryPage() {
		PageFactory.initElements(Base.getDriver(), this);
	}
	
	@FindBy (xpath="//*[contains(@class,'sodosans-semibold ttu tc tracked-mega link br-pill ba mt1 mb2 pt4-m dt dib-l white b--white w-80 __track-click __ue-cta')]")
	public WebElement orderNow;
	
	@FindBy (xpath="//*[@id='main-content']/div/div/div/h1")
	public WebElement deliText;

}
