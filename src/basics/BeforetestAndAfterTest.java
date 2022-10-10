package basics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforetestAndAfterTest  extends BeforeTestAndAfterTest1  {
	
	
	@BeforeTest
	public void Login()
	{
		System.out.println("****LOGIN****");
	}
	
	@AfterTest
	public void Logout() 
	{
		System.out.println("****LOGOUT****");
	}

	
	@Test(priority=3)
	public void homepage()
	{
	   System.out.println("CHECKING THE HOME PAGE");	
	}
	
	@Test(priority=2)
	public void profilepage() 
	{
	   System.out.println("CHECKING THE PROFILE PAGE");	
	}
	
	@Test(priority=1)
	public void notificationpage() 
	{
	   System.out.println("CHECKING THE NOTIFICATION PAGE");	
	}

}
