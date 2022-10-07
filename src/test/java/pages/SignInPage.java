package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Base;

public class SignInPage {
	
    public SignInPage() {
        PageFactory.initElements(Base.getDriver(),this);
    }
    
    // dolkun's
    @FindBy(xpath="//input[@id='username']")
    public WebElement email;

    @FindBy(xpath="//input[@id='password']")
    public WebElement password;

    @FindBy(xpath="//button[@class='sb-frap sb-frap--centerSVG']")
    public WebElement signInButton;

    @FindBy(xpath = "//h2[contains(@class,'text-md')]")
    public WebElement errorMessage;

}
