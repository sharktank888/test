package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Base;

public class InvestorRelationsPage {
	
	public InvestorRelationsPage() {
		PageFactory.initElements(Base.getDriver(),this);
	}

	@FindBy(xpath = "//*[@id='_ctrl0_ctl21_txtEmail']")
	public WebElement emailTextBox;
	
	@FindBy(xpath = "//*[@id='_ctrl0_ctl21_divModuleContainer']/div/div/div[3]/div/input")
	public WebElement signUpButton;
	
	@FindBy(xpath = "//*[@id='_ctrl0_ctl21_validationsummary']")
	public WebElement errorMessage;
	
	@FindBy(xpath = "//*[@id='_ctrl0_ctl21_chkLists']/tbody/tr/td/label")
	public List<WebElement> checkboxList;
	
	@FindBy(xpath = "//*[@id='_ctrl0_ctl21_chkLists']/tbody/tr/td/input")
	public List<WebElement> checkboxs;
	
}
