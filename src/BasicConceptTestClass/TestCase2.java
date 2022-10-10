package BasicConceptTestClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase2 {
	
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
	public void m4()
	{
	   System.out.println("METHOD M4");	
	}
	
	@Test
	public void m5()
	{
		System.out.println("METHOD M5");
	}
	
	@Test
	public void m6()
	{
		System.out.println("METHOD M6");
	}
}
