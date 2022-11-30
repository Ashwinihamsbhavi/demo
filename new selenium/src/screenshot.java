import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screenshot {
	  

	public static void main(String[] args) throws InterruptedException, IOException 
	   	 {
		
			System.setProperty("webdriver.gecko.driver", "./automationtester/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			Thread.sleep(2000);
			driver.get("https://www.javatpoint.com/selenium-grid");
			TakesScreenshot tss = (TakesScreenshot)driver;
			File src = tss.getScreenshotAs(OutputType.FILE);
			File dst = new File("./screenshot1/a.png");
			FileUtils.copyFile(src, dst);
	
	   	 }
}