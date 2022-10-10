package basics;

import org.testng.annotations.Test;

public class Introduction {

	@Test(priority =1)
	public void OpenUrl(){
		System.out.println("Open current Url");
	}
	
	@Test(priority=2)
	public void login(){
		System.out.println("Open account");
	}
	
	@Test(priority=3)
	public void logout(){
		System.out.println("closed account");
	}
	

}
