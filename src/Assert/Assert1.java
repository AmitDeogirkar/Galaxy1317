package Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert1 {

//	String s1="He";
//	String s2="Hello";
//	@Test
//	public void sample() {
//	Assert.assertNotEquals(s1, s2);
//	}
//	
	
//	String s3="Surbhi";
//	String s4=null;
//	@Test
//	public void sample1() {
//		Assert.assertNotNull(s4);
//	}
	
	
	String s3="Surbhi";
	String s4=null;
	@Test
	public void sample1() {
		System.out.println(s3);
		Assert.fail();
	}
	
	
			}
