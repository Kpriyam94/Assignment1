package calculator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_testng {
	
	Calci ob = new Calci();
	
	@DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod() {
	 return new Object[][] {{5 ,12},{7 ,14},{9,18}};
 }
	
	 @Test(dataProvider = "data-provider",groups = {"value1"})
	    @Parameters({"val1","val2"})
	    public void Parameter_method(int var1, int var2) {
	    	System.out.println("**Calculator Operations Using Parameters**");
	    	System.out.println("Addition of two numbers is :"+ob.add(var1, var2));
	    	System.out.println("Substitution of two numbers is:"+ob.sub(var1, var2));
	    	System.out.println("Multiplication of two numbers is:"+ob.mul(var1, var2));
	    	System.out.println("Divisionof two numbers is:"+ob.divInt(var1, var2));
	    	System.out.println("Inverse of a number is :"+ob.inverse(var1));
	    	System.out.println("Negate of a number is:"+ob.negate(var2));
	    	System.out.println("Exponential operation for given two numbers is:"+ob.exp(var1, var2));
	    	System.out.println("Modulus operation for given two numbers is:"+ob.mod(var1, var2));
	    	
	    	System.out.println("param-threadid"+Thread.currentThread().getId());
	    }
	    

}
