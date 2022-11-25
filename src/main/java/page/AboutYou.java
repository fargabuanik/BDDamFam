package page;

import static common.CommonActions.assertGetText;
import static common.CommonActions.click;
import static common.CommonActions.input;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutYou {

	public  AboutYou(WebDriver driver) {
		PageFactory.initElements(driver, this); 
	}

	@FindBy(xpath = "//div[@class='layout3-jss6']")
	WebElement addressPageTitleeElement;
	@FindBy(xpath = "//input[@id='pni-residence-address-line-1-id']")
	WebElement addressElement;
	@FindBy(xpath = "//span[@class='customer4-MuiButton-label']")
	WebElement startNewQuoteElement; 

	public void aboutYourAddress(String exppected) { 
		assertGetText(addressPageTitleeElement, exppected); 
	}

	public void address(String address ) { 
		input(addressElement, address);
	}
	public void startNewQuote() {
		click(startNewQuoteElement);
	}
}
