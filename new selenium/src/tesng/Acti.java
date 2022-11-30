package tesng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Acti {
	@Test
	public void test1() throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("http://localhost/login.do");
		 Thread.sleep(2000);
		 driver.navigate().refresh();
		 driver.close();
	}

}
