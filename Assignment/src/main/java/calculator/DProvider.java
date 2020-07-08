package calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DProvider {
	
	
	Calci ob = new Calci();
	
	@DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod() {
	 return new Object[][] {{3 ,3},{10,2}};
 }
 
    @Test(dataProvider = "data-provider",groups = {"value2"})
    public void DataProviderMethod(int a, int b) {
    	if(a==3){
       Assert.assertEquals(6, ob.add(a, b));
    	}
    	else {
    		Assert.assertEquals(12, ob.add(a, b));
    	}
       Assert.assertTrue(ob.mul(a, b)>ob.sub(a, b));
       Assert.assertNotEquals(ob.divReal(a, b), ob.exp(a, b));
       Assert.assertFalse(ob.divInt(a, b)==ob.mod(a, b));
       ob.divReal(a, b);
       ob.negate(a);
      ob.inverse(a);
    }


}
