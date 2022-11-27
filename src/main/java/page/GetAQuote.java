package page;

import static common.CommonActions.click;
import static common.CommonActions.input;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetAQuote {

	WebDriver driver;

	public GetAQuote(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); 
	}
	@FindBy(xpath ="//input[@name='zipCode']")
	WebElement zipCodeElement; 
	@FindBy(xpath ="//span[@class='SelectionTiles__tile-cta' and normalize-space(text())='Car']")  
	WebElement carElement; 
	@FindBy(xpath = "//span[@class='LoadingButton__content']")
	WebElement letsGoElement;
	
	public void zipCode(String zipCode) {
		input(zipCodeElement, zipCode);
	}
	public void clickCar() {
		click(carElement);
	}
	public void ClickletsGo() {
		click(letsGoElement); 
	}
	
	public void getQuoteSteps(String zip) {
		input(zipCodeElement, zip);
		click(carElement);
		click(letsGoElement);
	}
}

