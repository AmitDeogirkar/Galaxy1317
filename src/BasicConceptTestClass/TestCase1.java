package BasicConceptTestClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@BeforeTest
	public void OpenDB() 
	{
		System.out.println("Database is opened");
	}

	
	@AfterTest
	public void CloseDB() 
	{
		System.out.println("database is Closed");
	}
	
	@BeforeClass
	public void OpenBrowser()
	{
	   System.out.println("Browser is Opened");	
	}
	
	@AfterClass
	public void CloseBrowser() 
	{
	   System.out.println("Browser is Closed");	
	}
	
	@Test
	public void m1()
	{
	   System.out.println("METHOD M1");	
	}
	
	@Test
	public void m2()
	{
		System.out.println("METHOD M2");
	}
	
	@Test
	public void m3()
	{
		System.out.println("METHOD M3");
	}
}
