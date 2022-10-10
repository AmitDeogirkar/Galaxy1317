package CrossBrowser;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AllBrowser {
	WebDriver driver;
	@Parameters("browser")
	@Test(priority=1)
	public void CrossbrowserTesting(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Selenium jar file\\chromedriver_win32 105\\chromedriver.exe");
			  driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\Desktop\\Selenium jar file\\geckodriver-v0.31.0-win32\\geckodriver.exe");
			  driver=new FirefoxDriver();
			
		}else{
			System.out.println("Wrong browser name selected");
		}
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority=2)
	public void VerifyCurrentUrl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
		
	}
	@Test(priority=3)
	public void getTitle() {
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
	}
	
	@Test(priority=4)
	public void UsernameField() {
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		Assert.assertTrue(username.isDisplayed());
		username.sendKeys("amit.deogirkar13@gmail.com");
	}
	
	@Test(priority=5)
	public void passwordField() {
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		Assert.assertTrue(password.isDisplayed());
		password.sendKeys("Amit@1317");
	}
	
	@Test(priority=6)
	public void ButtonField() {
		WebElement Button= driver.findElement(By.xpath("//button[@type='submit']"));
    	Assert.assertTrue(Button.isEnabled());
    	Button.click();
	}
	


}