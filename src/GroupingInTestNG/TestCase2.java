package GroupingInTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase2 {
	
	@BeforeClass(alwaysRun=true)
	public void OpenBrowser() {
		System.out.println("Browser is opened");
	}

	@AfterClass(alwaysRun=true)
	public void CloseBrowser() {
		System.out.println("Browser is closed");
	}
	
	@Test(groups="Smoke")
	public void Test4() {
		System.out.println("Executing test4");
	}
	
	@Test(groups="Functional")
	public void Test5() {
		System.out.println("Executing test5");
	}
	
	@Test(groups= {"Functional","Regression"})
	public void Test6() {
		System.out.println("Executing test6");
	}
}


