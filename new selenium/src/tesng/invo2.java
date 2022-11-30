package tesng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invo2 {
	@Test(invocationCount = 3)
	public void test1()
		{
			Reporter.log("logout",true);
		}
		@Test
		public void test2()
		{
			Reporter.log("login",true);
		}
	}

