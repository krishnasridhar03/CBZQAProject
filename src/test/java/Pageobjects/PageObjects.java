package Pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjects {
	WebDriver driver;
		public PageObjects(WebDriver driver) {
			this.driver = driver;
		}
		By userid = By.xpath("//*[@id=\'UserName\']");
		By useremail = By.xpath("//*[@id=\'userDetails\']/ul/li[2]/a");
		By userinput = By.xpath("//*[@id=\'withOutOTP\']/input[1]");
		By withpassword = By.xpath("//*[@id=\'withOutOTP\']/p[6]");
		By password = By.id("passWord");
		By login = By.xpath("//*[@id=\'continue_Login\']");
        By logout = By.id("userLogOut");
        By banner = By.xpath("//*[@id=\'navMenu\']/li[1]/span/a");
        By listingpdp = By.xpath("//*[@id=\'ImgChange\']/div[1]/div[1]/a/img[1]");
        By selectstitch= By.id("GHC002");
		
		public void logcb(String searchid ,String passkey) {
			try {
				driver.findElement(userid).click();
				driver.findElement(useremail).click();
				Thread.sleep(2000);
				driver.findElement(userinput).sendKeys(searchid);
				driver.findElement(withpassword).click();
				driver.findElement(password).sendKeys(passkey);
				driver.findElement(login).click();	
				driver.findElement(userid).click();
				Thread.sleep(10000);
			}catch(Exception e) {
				System.out.println("Exception caught in login: "+ e.getMessage());
			}
		}
		public void clickbanner() {
			try {
				driver.findElement(banner).click();
				Thread.sleep(10000);
			} catch (Exception e) {
				System.out.println("Exception caught in clicking banner: "+ e.getMessage());
			}
		}
		public void clickpdp() {
			try {
				driver.findElement(listingpdp).click();
			} catch (Exception e) {
				System.out.println("Exception caught in clicking product: "+ e.getMessage());
			}
		}
		public void clickstitch() {
			try {
				driver.findElement(selectstitch).click();
			} catch (Exception e) {
				System.out.println("Exception caught in selecting size: "+ e.getMessage());
			}
		}

	}


