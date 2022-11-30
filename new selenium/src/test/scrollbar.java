package test;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scrollbar {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
	for(int i=1;i<=4;i++)
	{
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,1000)");
	}
	for(int i=1;i<=4;i++)
	{
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-1000)");
	}
	
	
	}
}
