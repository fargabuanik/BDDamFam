package base;

import org.openqa.selenium.WebDriver;            
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import page.AboutYou;
import page.GetAQuote;
import page.HomePage;
import page.VerifyYourcity;
import utils.Configuration;
import static utils.IConstant.*;
import java.time.Duration;

public class BaseClass {


	public Configuration config = new Configuration();
	public static WebDriver driver;
	public static HomePage homePage;
	public static AboutYou aboutYou;
	public static GetAQuote getAQuote;
	public static VerifyYourcity verifyYourcity;
	
	public void setUpDriver() {	
		initDriver(config.getProperty(BROWSER));
		driver.manage().window().maximize();
		driver.get(config.getProperty((URL))); 
		long pageLoadTime = Long.parseLong(config.getProperty(PAGELOAD_WAIT));
		long implicitWait = Long.parseLong(config.getProperty(IMPLICIT_WAIT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTime));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
		initObjectClasses();
	}
	
	private void initDriver(String browser) { 
		switch (browser) {
		
		case CHROME:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
	
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case EDGE :
			WebDriverManager. edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case 	SAFARI:
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			break;

		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		}
	}
	
    public static void initObjectClasses() {
		homePage = new HomePage(driver);
		aboutYou = new AboutYou(driver);
		getAQuote = new GetAQuote(driver);
		verifyYourcity = new VerifyYourcity (driver);
	
	}

	public WebDriver getDriver() {
		return driver;
	}
	
	public void closingDriverSession() {
		getDriver().quit();
	}  
}
