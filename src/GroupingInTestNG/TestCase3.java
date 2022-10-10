package GroupingInTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

    public class TestCase3
 {
	
	@BeforeClass(alwaysRun=true)
	public void OpenBrowser() {
		System.out.println("Browser is opened");
	}

	@AfterClass(alwaysRun=true)
	public void CloseBrowser() {
		System.out.println("Browser is closed");
	}
	
	@Test(groups="Smoke")
	public void Test7() {
		System.out.println("Executing test7");
	}
	
	@Test(groups="Functional")
	public void Test8() {
		System.out.println("Executing test8");
	}
	
	@Test(groups= {"Functional","Regression"})
	public void Test9() {
		System.out.println("Executing test9");
	}

 }
