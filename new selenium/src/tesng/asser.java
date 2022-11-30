package tesng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class asser {
	@Test
	public void test1() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https:www.facebook.com");
		 Thread.sleep(2000);
		 String title = driver.getTitle();
		 Assert.assertEquals(title, "facebook login or signup");
		 
	}

}
