package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Base;

public class RewardPage{
	
	public RewardPage() {
		PageFactory.initElements(Base.getDriver(), this);
	}
	
	// kaned's
	@FindBy(xpath="//*[@id='content']/div[4]/div/div[2]/div[1]/button")
	public List<WebElement> valueTab;

	@FindBy(xpath= "//*[@id='content']/div[4]/div/div[2]/div[2]")
	public WebElement description;
	
	public List<String> headings() {
		List<String> list = new ArrayList<>();
		list.add("Customize your drink");
		list.add("Brewed hot coffee, bakery item or hot tea");
		list.add("Handcrafted drink, hot breakfast or parfait");
		list.add("Salad, sandwich or protein box");
		list.add("Select merchandise or at-home coffee");
		return list;
	}

}
	
