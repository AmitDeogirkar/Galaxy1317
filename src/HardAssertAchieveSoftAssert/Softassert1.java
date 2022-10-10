package HardAssertAchieveSoftAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert1 {
	
	// To overcome the hard assert we need to use soft Assert.
	// It is a class which contain non static method to do verification
	// Soft Assert will do verification, if any verification is failed,-----
    // notifies and executes the rest of the verification  in the test method.

	
	@Test
	public void sample() {
		SoftAssert soft=new SoftAssert();
		
		
		
		String str1="Hello";
		soft.assertEquals(str1, "Hi");
		System.out.println(str1);
		
		
		
		String str2="Hi";
		soft.assertEquals(str2, "Hi");
		System.out.println(str2);
	}
	
	
	@Test
	public void sample1() {
		String str3="Bye";
		System.out.println(str3);
	}
	
}
