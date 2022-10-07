package pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;

public class CustomerServicePage {
	
	public CustomerServicePage() {
		PageFactory.initElements(Base.getDriver(), this);
	}
	
	// Nicky's
	@FindBy(xpath = "//*[@id=\"firstProductColumn\"]/ul/li[2]/div/h3/a")
	public WebElement starbucksRewards;

    @FindBy(xpath = "//*[@id='firstProductColumn']/ul/li[2]/div/ul/li/a")
    public List<WebElement> links;
    
    
	// Nelson's
	@FindBy(xpath = "//*[@id='rn_KeywordText_3_Text']")
	public WebElement search;
	
	@FindBy(xpath = "//*[@class='rn_Element1']/h3/a")
	public WebElement firstLink;
	
	@FindBy(xpath = "//*[@style='list-style-type:none']")
	public WebElement response;
	
}
