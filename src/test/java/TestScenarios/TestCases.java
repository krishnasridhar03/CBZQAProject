package TestScenarios;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobjects.PageObjects;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCases {
	WebDriver driver;

	PageObjects objectrepo;

	@BeforeTest

	public void beforetest() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

	    driver.get("https://www.cbazaar.com/in/");

	    driver.manage().window().maximize();

	    Thread.sleep(2000);

	}
	@Test(priority=1)

	public void userlogin() {

		PageObjects page =new PageObjects(driver);
		page.logcb("krishna@diy.in","654321");		
	}
	
	@Test(priority =2)	
	public void menu() {		
		PageObjects clickhomebanner = new PageObjects(driver);		
		clickhomebanner.clickbanner();	
	}
	 @Test(priority =3)
	 public void productpage() {
	 	PageObjects clickpdpimg = new PageObjects(driver);
	 	clickpdpimg.clickpdp();
	 	 	
	 }
	 	 @Test(priority =4)
	 public void selectsize() {
		 PageObjects selectingsize = new PageObjects(driver);
		 selectingsize.clickstitch();
		 
	 }
	  

}
