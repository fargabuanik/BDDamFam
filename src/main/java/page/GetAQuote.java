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
	WebElement zipCodElement;
	@FindBy(className ="SelectionTiles__tile-icon icon-auto")
	WebElement carElement;
	@FindBy(className ="LoadingButton__content")
	WebElement letsGoElement;

	public void zipCode(String zipCode) {
		input(zipCodElement, zipCode);
	}
	public void clickCar() {
		click(carElement);
	}
	public void ClickletsGo() {
		click(letsGoElement); 
	}
}

