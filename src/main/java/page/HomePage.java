package page;
 
import static common.CommonActions.click; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonWaits;

public class HomePage {

	WebDriver driver;
	CommonWaits waits;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		waits = new CommonWaits(driver);
		PageFactory.initElements(driver, this); 
	}
	@FindBy(xpath ="//button[normalize-space(text())='Start a New Quote']")
	WebElement startNewQuoteElement; 

		public void clickStartNewQuote() { 
		click(startNewQuoteElement); 
	}
}



