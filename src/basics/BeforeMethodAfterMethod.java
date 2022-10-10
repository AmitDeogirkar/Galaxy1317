package basics;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodAfterMethod {
	
	@BeforeMethod
	public void Login()
	{
		System.out.println("****LOGIN****");
			Reporter.log("****LOGIN****"); // this statement provide message on  report about running class statement
	}
	
	@AfterMethod
	public void Logout() 
	{
		System.out.println("****LOGOUT****");
			Reporter.log("****LOGOUT****");
	}

	
	@Test(priority=3)
	public void homepage()
	{
	   System.out.println("CHECKING THE HOME PAGE");	
	   Reporter.log("Checking The Home Page");
	}
	
	@Test(priority=2)
	public void profilepage() 
	{
	  System.out.println("CHECKING THE PROFILE PAGE");	
	  Reporter.log("Checking The Profile Page");
	}
	
	@Test(priority=1)
	public void notificationpage() 
	{
	  System.out.println("CHECKING THE NOTIFICATION PAGE");	
	 Reporter.log("Checking The Notification Page");
	}
	
	
}
