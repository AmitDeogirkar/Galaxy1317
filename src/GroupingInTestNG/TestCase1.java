package GroupingInTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@BeforeTest(alwaysRun=true) // when we use always keyword with Annotation then this annotation will always execute. 
	public void OpenDB() {
		System.out.println("DataBase Open");
	}
	
	@AfterTest(alwaysRun=true)
	public void CloseDB() {
		System.out.println("DataBase Closed");
	}
	
	@BeforeClass(alwaysRun=true) // same for class...but it will happen while execution of suite
	public void OpenBrowser() {
		System.out.println("Browser is opened");
	}

	@AfterClass(alwaysRun=true)
	public void CloseBrowser() {
		System.out.println("Browser is closed");
	}
	
	@Test(groups="Smoke")
	public void Test1() {
		System.out.println("Executing test1");
	}
	
	@Test(groups="Functional")
	public void Test2() {
		System.out.println("Executing test2");
	}
	
	@Test(groups= {"Functional","Regression"})
	public void Test3() {
		System.out.println("Executing test3");
	}
}
