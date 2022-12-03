package page;

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;
import common.CommonWaits;

public class VerifyYourcity {
	WebDriver driver;
	CommonWaits waits;

	public VerifyYourcity(WebDriver driver) {
		this.driver = driver;
		waits = new CommonWaits(driver);
		PageFactory.initElements(driver, this); 
	}
	@FindBy(xpath ="//input[@id='selected-city-id-queen-creek']")
	WebElement checkBoxElement;	
	@FindBy(xpath ="(//span[@class='customer4-MuiButton-label'])[2]")
	WebElement continuButtonElement;

	public void clickcheckBox() {
		click(checkBoxElement);

	}
	public void continuButton() {
		click(continuButtonElement); 
	}
	public void verifyYourCitySteps() {
		click(checkBoxElement);
		click(continuButtonElement);
	}
}


