package KeywordPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCountWithThreadPoolSizePractice {

	@Test(invocationCount=5,threadPoolSize=5)
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Selenium jar file\\chromedriver_win32 105\\chromedriver.exe");		
		
			
		WebDriver driver=new ChromeDriver() ;	
		driver.get("https://www.facebook.com/");	//hit the url	
	    driver.manage().window().maximize(); //Maximization of desktop screen
	    System.out.println(driver.getTitle());
		driver.close();
	}
}
