package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Base;

public class CareersPage {
	
	public CareersPage() {
		PageFactory.initElements(Base.getDriver(), this);
	}
	
	// Nelson's
	@FindBy(xpath = "//*[@class='size12of12 sm-size6of12 section-grid_gridGutterItem__ZrrKt'][13]/a/span")
	public WebElement careersInUSA;
	
	@FindBy(xpath = "//*[@id='search-jobs']")
	public WebElement searchJobs;
	
	// Aiming's added codes for Nelson
    @FindBy(xpath = "//*[@id='requisitionListInterface.ID6407.row']/td[2]/div/div/div/div/h3/span/a")
    public List <WebElement> jobs;
	

}
