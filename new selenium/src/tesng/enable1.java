package tesng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enable1 {
	@Test
	
	public void test1()
	{
		Reporter.log("logout",true);
		
	}
	@Test(enabled=false)
	public void test2()
	{
		Reporter.log("login",true);
	}

}
