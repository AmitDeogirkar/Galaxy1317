package KeywordPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TimeoutsKeywordPractice {
	
	@BeforeClass
	public void LaunchBrowser() {
		System.out.println("Browser is Launched");
	}
	
	@AfterClass
	public void CloseBrowser() {
		System.out.println("Browser is Closed");
	}
	
	@BeforeMethod
	public void Login() {
		System.out.println("Logged in into Application");
	}

	@AfterMethod
	public void Logout() {
		System.out.println("Logged Out from Application");
	}
	
	@Test(priority=1,timeOut=5000)
	public void HomepageTest() throws InterruptedException {
		System.out.println("CHECKED THE HOMEPAGE OF APPLICATION");
		Thread.sleep(3000);
	}
	
	@Test(priority=2)
	public void NotificationPageTest() {
		System.out.println("CHECKED THE NOTIFICATION ON APPLICATION");
	}

}
