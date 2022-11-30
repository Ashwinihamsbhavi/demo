package tesng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Bm {
	WebDriver driver;
	@BeforeMethod
	public void OpenApp() throws InterruptedException {

	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	  driver=new FirefoxDriver();
	 Thread.sleep(2000);
}
@AfterMethod
public void CloseApp() throws InterruptedException
{
	Thread.sleep(2000);
	driver.close();

}
}
