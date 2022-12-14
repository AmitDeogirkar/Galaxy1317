package KeywordPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodKeywordPractice {

	
	@Test(priority=1)
	public void OpenUrl()
	{
    System.out.println("Url is Open");
    Assert.fail();
	}
	
	@Test(priority=2,dependsOnMethods="OpenUrl")
	public void Login()
	{
	System.out.println("Logged into the Application");
	}
	
	@Test(priority=3,dependsOnMethods={"OpenUrl","Login"})
	public void logout()
	{
	System.out.println("logged out from Application");
	}
	
}
