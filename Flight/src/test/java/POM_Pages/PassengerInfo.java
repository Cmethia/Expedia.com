package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PassengerInfo {
	public WebDriver driver ;

	
@FindBy (name= "tripPreferencesRequest.airTripPreferencesRequest.travelerPreferences[0].firstName")WebElement Fname;
@FindBy (name = "tripPreferencesRequest.airTripPreferencesRequest.travelerPreferences[0].lastName")WebElement Lname;
@FindBy (name= "tripPreferencesRequest.airTripPreferencesRequest.travelerPreferences[0].phoneCountryCode")WebElement CountryCode;
@FindBy (name = "tripPreferencesRequest.airTripPreferencesRequest.travelerPreferences[0].phoneNumber")WebElement PhoneN;
@FindBy (xpath = "//span[text()='Female']")WebElement Gender;
@FindBy (name= "tripPreferencesRequest.airTripPreferencesRequest.travelerPreferences[0].dateOfBirth.month")WebElement MonthSelect;
@FindBy (name = "tripPreferencesRequest.airTripPreferencesRequest.travelerPreferences[0].dateOfBirth.day")WebElement DySelect;
@FindBy (name = "tripPreferencesRequest.airTripPreferencesRequest.travelerPreferences[0].dateOfBirth.year")WebElement YeSelect;
@FindBy (xpath = "//input[@aria-label='No thanks']")WebElement OptionSelect;
@FindBy (id="creditCards[0].cardholder_name")WebElement NameOfCard;
@FindBy (id = "creditCardInput")WebElement CardNum;
@FindBy (name = "creditCards[0].expiration_month")WebElement MonthExpDate;
@FindBy (name= "creditCards[0].expiration_year")WebElement YearExpDate;
@FindBy (id = "new_cc_security_code")WebElement SecCode;
@FindBy (name = "name=\"creditCards[0].country\"")WebElement Country;
@FindBy (name = "creditCards[0].street")WebElement BilAddress1;
@FindBy (name = "creditCards[0].city")WebElement city;
@FindBy (name = "creditCards[0].state")WebElement state;
@FindBy (name = "creditCards[0].zipcode")WebElement zipC;
@FindBy (xpath = "//input[@data-validation-message='Please enter a valid email address.']")WebElement emailField;
@FindBy (id = "complete-booking")WebElement BookingSubmit;


	public void FirstNameClick() {
		Fname.sendKeys("hala");
	}
	public void LastNameClick() {
		Lname.sendKeys("met");
	}
	public void CountryCodeClick() {
		Select selectCountry= new Select(CountryCode);
		selectCountry.selectByVisibleText("United States of America +1");
	}
	public void phoneNumClick() {
		PhoneN.sendKeys("6124457788");
	}
	public void genderClick() {
		Gender.click();
	}
	public void MonthClick() {
		Select Mo= new Select(MonthSelect);
		Mo.selectByVisibleText("09");
	}
	public void dayClick() {
		Select dy= new Select(DySelect);
		dy.selectByVisibleText("09");
	}
	public void YearClick() {
		Select Ye= new Select(YeSelect);
		Ye.selectByVisibleText("1995");
	}
	public void OptionClick() {
		OptionSelect.click();
	}
	public void CardClick() {
		CardNum.sendKeys("11111118990");
	}
	public void MoExpClick() {
		Select MoEx= new Select(MonthExpDate);
		MoEx.selectByVisibleText("11");
	}
	
	public void YeExpClick() {
		Select YeEx= new Select(YeSelect);
		YeEx.selectByVisibleText("2027");
	}
	public void SecCodeClick() {
		SecCode.sendKeys("6789");
	}
	public void countryClick() {
		Select selectCo= new Select(Country);
		selectCo.selectByVisibleText("United States of America");
	}
	public void BillingClick() {
		BilAddress1.sendKeys("40west apt 6");
	}
	public void CityClick() {
		city.sendKeys("dublin");
	}
	public void StateClick() {
		Select selectCity= new Select(state);
		selectCity.selectByVisibleText("OH");
		
	}
	public void ZipClick() {
		zipC.sendKeys("43210");
	}
	public void emailConfClick() {
		emailField.sendKeys("ab@gmail.com");
	}
	public void BookingClick() {
		BookingSubmit.click();
	}
		
		
		
		public PassengerInfo (WebDriver driver) {
			this.driver =driver;
			PageFactory.initElements(driver, this);
	
	
	
	
	
	
}
}		


