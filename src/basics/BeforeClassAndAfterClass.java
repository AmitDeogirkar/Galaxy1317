
package basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeClassAndAfterClass {
	@BeforeClass
	public void Login()
	{
		System.out.println("****^^LOGIN^^****");
	}
	
	@AfterClass
	public void Logout() 
	{
	System.out.println("****^^LOGOUT^^****");
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
