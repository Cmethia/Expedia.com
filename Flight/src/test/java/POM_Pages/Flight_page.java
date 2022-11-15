package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flight_page {
	public WebDriver driver ;
	
	@FindBy(xpath="//span[contains(text(), 'departing at 6:00am from Columbus, arriving at 7:54am in New York')]/..") WebElement FlightPrice1;
	@FindBy (xpath = "(//button[@stid='select-button'])[1]")WebElement TicketPrice1;
	
	@FindBy (xpath = "//span[contains(text(),'departing at 2:59pm from New York, arriving at 5:04pm in Columbus')]/..")WebElement Flight2;
	@FindBy (xpath = "//button[text()= 'Select']")WebElement TicketPrice2;
	@FindBy (xpath = "//button[@data-test-id='goto-checkout-button']")WebElement Check_out;
	@FindBy (xpath = "//button[text()= 'Go to checkout']")WebElement chOut;
	
	
	
	
	public void flight1Click() {
		FlightPrice1.click();
		
	}
	public void Ticket1Click() throws InterruptedException {
		TicketPrice1.click();
		
	}
	public void Flight2Click() {
		
		Flight2.click();
	}

	public void Ticket2Click() {
		TicketPrice2.click();
	}
	public void CheckoClick() {
		Check_out.click();
	}
	public void GoChoutClick() {
		chOut.click();
	}
				
		
	

		public Flight_page(WebDriver driver) {
			this.driver =driver;
			PageFactory.initElements(driver, this);
	
	
	
	
	
	
}
}
