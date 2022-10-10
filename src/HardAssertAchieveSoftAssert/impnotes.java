package HardAssertAchieveSoftAssert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class impnotes {
	
//	1. In Test class if one of the test method is failed then testing will stop execution of failed test methods.
//     and it will continue from next methods.
	
//	@Test
//	public void Test1() {
//		Reporter.log("Test case 1"); // failed 
//		Assert.fail();
//	}
//
//	@Test
//	public void Test2() {
//		Reporter.log("Test Case 2"); // passed
//		
//	}
	
// 2. In a test class if one of the test method failed and test method required for other test methods 
//    then other test methods will be skipped.(because test 2  method depends on test1 method) 

//	@Test
//	public void Test1() {
//	Reporter.log("TestCase1");
//	Assert.fail();
//	}
//	
//	@Test(dependsOnMethods = "Test1")
//	public void Test2() {
//	Reporter.log("TestCase2");
//	}

// output:- Test1==> failed
//	        Test2==> Skipped

	//###############################Disadvantages of Assert Class #########################

	//==> If a test class containing multiple test methods and 
	//    one of the test contains multiple verification point and while executing
    //    if one of the execution is failed then
	//    rest of the verification will not be verified and testng will execute next method by failing verification  field method.

	@Test
	public void sample1() {
		String str1="Hello";
		Assert.assertEquals(str1, "Hi");
		System.out.println(str1);
		
		
		
		String str2="Hi";
		Assert.assertEquals(str2, "Hi");
		System.out.println(str2);
	}
	
	@Test
	public void sample2() {
		String str3="Byr";
		System.out.println(str3);
	}
	
	
	
}
