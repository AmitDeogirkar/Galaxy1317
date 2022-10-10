package Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertClass {

	//1.assertEquals();-it is used to verify expected and actual results.if both are same then output is pass otherwise fail
	
//	     String str1="Hello";
//	     String str2="Hello"; // hell
//	
//	     @Test
//	     public void sample1() {
//		 Assert.assertEquals(str1,str2); // 1.pass // 2.fail
//	     }
//	
	
	
	//2.assertNotEquals();-it is used to verify expected and actual results.if both are same then output is fail otherwise pass
	
//		  String str3="Hello";
//		  String str4="Hello";// hell
//		
//		  @Test
//		  public void sample2() {
//		  Assert.assertNotEquals(str3, str4); // 1.fail // 2pass
//		  }
		
 // 3. assertTrue():- This method is used to verify condition are True OR False.If condition is true then output is pass otherwise fail
		
//	      String str3="Hello";
//        String str4="Hello";// hell
//		  @Test
//		  public void sample3() {
//		  str3.equals(str4);
//		  Assert.assertTrue(true);
//	    }
		
   // 4.assertFalse():- This method is used to verify condition are True OR False.If condition is false then output is pass otherwise fail
		
//	      String str3="Hello";
//     	  String str4="Hello";// hell
//		  @Test
//		  public void sample3() {
//		  str3.equals(str4);
//		  Assert.assertFalse(false, str3);;
//		  }
	
 // 5.AssertNull():- this method is used to verify the component or textField is empty or not. if is found empty then output is pass otherwise failed
	
	      
//	      String str5=null;
// 	      String str6="Hello";// hell
//        @Test
//	      public void sample4() {
//        Assert.assertNull(str5); 
//        }
          
  //6. AssertNotNull():- this method is used to verify the component or textField is empty or not. if  is  not found empty then output is pass otherwise failed
	
	      
//	      String str5=null;
// 	      String str6="Hello";// hell
//        @Test
//	      public void sample4() {
//        Assert.assertNotNull(str6); 
//        }
	
	// 7.Fail():- This Method is used to intensionally fail the test method.
          
          String str7="Hello";
 	      String str8="Hello";// hell
          @Test
	      public void sample4() {
          Assert.fail(str7);
          }
          
}
