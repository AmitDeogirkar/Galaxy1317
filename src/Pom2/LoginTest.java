package Pom2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	
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
    public void FacebookLoginPageTest() {
    	
    LoginPage lp=new LoginPage(driver);	
    
    lp.VerifyLoginPageLogo();
    lp.VerifyLoginPageTagline();
    lp.VerifyFacebookLoginPageCreateNewAccountBtn();
    lp.VerifyLoginPageForgotPasswordLink();
    lp.VerifyFacebookLoginPageFooterlinksSize();
    lp.SetFacebookLoginPageUsername();
    lp.SetFacebookLoginPagePassword();
    lp.ClickFacebookLoginPageBtn();
    
    
    }
    	
    	
    	
	

}
