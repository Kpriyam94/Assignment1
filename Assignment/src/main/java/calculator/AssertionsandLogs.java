package calculator;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertionsandLogs {
	
	public class DemoTest extends Calci {

		Calci ob = new Calci();
		
		@Test(groups = {"value1","value2"})
		public void AssertAllmethods() {
			Assert.assertEquals(20,ob.add(10, 10));
			Reporter.log("AssertEqualsPassed", true);
		
			Assert.assertTrue(ob.mul(10, 2)==ob.sub(30, 10));
			Reporter.log("AssertTruePassed", true);
			
			Assert.assertFalse(ob.divInt(10, 2)<ob.exp(2, 2));
			Reporter.log("AssertFalsePassed", true);
			
			Assert.assertNotEquals(ob.mod(20, 2), ob.inverse(11));
			Reporter.log("AssertNotequalsPassed", true);
			
			Assert.assertEquals(-10, ob.negate(10));
			Reporter.log("AssertEqualsPassed on a negative comaprison", false);
			System.out.println("assert-threadid"+Thread.currentThread().getId());
			
			}
}}