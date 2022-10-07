package utilities;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	
	private static Properties configObjects;
	
	static {
		
		try {
			String filePath = Constants.config_filePath;
			FileInputStream input = new FileInputStream(filePath);
			configObjects = new Properties();
			configObjects.load(input);
			input.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static String getProperty(String keyName) {
		return configObjects.getProperty(keyName);
	}

	
	@BeforeMethod
	public static WebDriver getDriver() {

		if (driver == null) {
			
			switch (Base.getProperty("browser")) {

			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
			case "safari":
				WebDriverManager.safaridriver().setup();
				driver = new SafariDriver();
				break;
			case "headless":
				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--headless");
				driver = new ChromeDriver(options);
				break;

			}
			
			driver.manage().window().maximize();
			driver.get(Base.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(Constants.implicitWaitSec, TimeUnit.SECONDS);
			PageInitialiser.initialise();
			
		}
		
		return driver;
		
	}
	
	@AfterMethod
	public static void tearDown() {
		if (driver != null) {
			driver.close();
			driver.quit();
			driver = null;
		}
	}
	
}
