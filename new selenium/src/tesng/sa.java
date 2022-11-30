package tesng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class sa {
	@Test
	public void test1()
	{

		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("facebook");
		 SoftAssert as = new SoftAssert();
		String title = driver.getTitle();
		as.assertEquals(title, "facebook-log in");
		 System.out.println("1");
		 as.assertAll();
		 
	}
	

}
