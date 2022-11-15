package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpHm_page {
	
	public WebDriver driver ;
	@FindBy(xpath="//span[text()='Flights']") WebElement MyFlight;
	@FindBy(xpath="//button[@aria-label='Leaving from']") WebElement leavingButton;
	
	@FindBy(xpath="//input[@id='location-field-leg1-origin']") WebElement leavingButton1;
	@FindBy(xpath="//strong[text() ='Columbus (CMH - John Glenn Columbus Intl.)']") WebElement selectAirportfrom;
	@FindBy(xpath="//button[@aria-label='Going to']") WebElement goingToButton;
	@FindBy(xpath="//input[@id='location-field-leg1-destination']") WebElement goingToButton1;
	@FindBy(xpath="//strong[text()='New York (JFK - John F. Kennedy Intl.)']") WebElement SelectAirportTo;
	@FindBy(id="d1-btn") WebElement Departing; 
    @FindBy(xpath="//button[@aria-label='Nov 23, 2022']") WebElement selectDepDate;	
    @FindBy(xpath="//button[@aria-label='Dec 22, 2022']") WebElement selectReturnDate;
	@FindBy(xpath="//button[@data-stid= 'apply-date-picker']") WebElement SelectDone;
	@FindBy(xpath="//button[@data-testid='submit-button']") WebElement searchButton;

	public void FlightClick() {
		
		MyFlight.click();
	}
	public void LeavingClick() throws InterruptedException {
		leavingButton.click();
		leavingButton1.click();
		Thread.sleep(5000);
		driver.manage().deleteAllCookies();
		leavingButton1.sendKeys("Columbus");
	}
	public void leavingFromClick() {
		selectAirportfrom.click();
	}
	public void goingClick() {
		 goingToButton.click();
		 goingToButton1.click();
		 driver.manage().deleteAllCookies();
		 goingToButton1.sendKeys("New York");		 
	}
public void goingToClick() {
	SelectAirportTo.click();
}
public void DepartingClick() {
	Departing.click();
}
public void DepartureDateClick() {
	selectDepDate.click();
}
public void ReturnDateClick() {
	selectReturnDate.click();
}
public void DoneClick() {
	SelectDone.click();
}
public void SearchClick() {
	searchButton.click();
}


	public ExpHm_page(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
		

}
}
