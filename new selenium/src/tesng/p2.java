package tesng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class p2 {
	@Test
	public void test1()
	{
		Reporter.log("logout",true);
	}
	@Test(priority=1)
	public void test2()
	{
		Reporter.log("login",true);
	}

}
