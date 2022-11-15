package TestNg;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_Pages.ExpHm_page;
import POM_Pages.Flight_page;
import POM_Pages.PassengerInfo;

public class TC_001_BookingFlight  {
	
	public WebDriver driver ;
  @BeforeMethod
public void BrowserLaunch() {
	  
	Browser("Chrome","https://www.expedia.com/");  
  }


	@Test
  public void f() throws InterruptedException {
		ExpHm_page hm=new ExpHm_page(driver);
		hm.FlightClick();
		hm.LeavingClick();
		hm.leavingFromClick();
		hm.goingClick();
		hm.goingToClick();
		hm.DepartingClick();
		Thread.sleep(3000);
		hm.DepartureDateClick();
		Thread.sleep(3000);
		hm.ReturnDateClick();
		hm.DoneClick();
		hm.SearchClick();
		//Create objects for Flight page
		Flight_page fp=new Flight_page(driver);
		fp.flight1Click();
		fp.Ticket1Click();
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		fp.Flight2Click();
		fp.Ticket2Click();
		
		Thread.sleep(3000);
		Set<String> WindowHandles= driver.getWindowHandles();
		Iterator<String> it=WindowHandles.iterator();
		String window1=it.next();
		String window2=it.next();
		driver.switchTo().window(window2);
		
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(5000);
		fp.CheckoClick();
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
//		fp.GoChoutClick();
//		driver.manage().deleteAllCookies();
//		driver.navigate().refresh();
		//Create objects for passengers page
		Thread.sleep(3000);
		PassengerInfo pi=new PassengerInfo(driver);
		pi.FirstNameClick();
		pi.LastNameClick();
		pi.CountryCodeClick();
		pi.phoneNumClick();
		pi.genderClick();
		pi.MonthClick();
		pi.dayClick();
		pi.YearClick();
		pi.OptionClick();
		pi.CardClick();
		pi.MoExpClick();
		pi.YeExpClick();
		pi.SecCodeClick();
		pi.countryClick();
		pi.BillingClick();
		pi.CityClick();
		pi.StateClick();
		pi.ZipClick();
		pi.emailConfClick();
		pi.BookingClick();
		
		
		
		
		driver.close();
		
		
		
	  
	  
	  
  
  }
	
	public void Browser (String NameOfBrowser, String URL  ) {
		if(NameOfBrowser.equalsIgnoreCase("Chrome")) {
			String jk=System.getProperty("user.dir");
			System.out.println(jk);
		System.setProperty("webdriver.chrome.driver",jk+"\\Drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get(URL);
	  driver.manage().window().maximize();	
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
      }else if(NameOfBrowser.equalsIgnoreCase("Edge")) {
    	  String jk=System.getProperty("user.dir");
			
      	System.setProperty("webdriver.edge.driver",jk+"\\Drivers\\msedgedriver.exe" );
      	driver=new EdgeDriver();
      	driver.get(URL);	    	
      	driver.manage().window().maximize();
      	}
}
}
