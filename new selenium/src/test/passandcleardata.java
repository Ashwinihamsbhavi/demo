package test;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class passandcleardata {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		driver.get("file:///C:/Users/DELL/Desktop/disabled.html");
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('a1').value='xyz'");
			
	}
}
