package Pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrationTest {
	WebDriver driver;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Selenium jar file\\chromedriver_win32 105\\chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.get("http://www.facebook.com/");
	}
    @AfterClass
    public void  teardown() {
    	//driver.close
    }
    @Test
    public void FacebookRegistrationPageTest_Positive() 
    {
    	Registrationpage rp =new Registrationpage(driver);
    	
    	rp.ClickFacebookSignupLink();
    	rp.VerifyFacebookRegistrationPageLogo();
    	rp.VerifyFacebookRegistrationPageAlreadyAccount();
    	rp.SetFacebookRegistrationPageFirstname();
    	rp.SetFacebookRegistrationPageLastname();
    	rp.SetFacebookRegistrationPageMobileEmail();
    	rp.SetFacebookRegistrationPagePassword();
    	rp.SetFacebookRegistrationPageBirthDay();
    	rp.SetFacebookRegistrationPageBirthMonth();
    	rp.SetFacebookRegistrationPageBirthYear();
    	rp.SetFacebookRegistrationPageGender("male");
    	rp.ClickFacebookRegistrationPageSubmitBtn();	
    	
    }
}
