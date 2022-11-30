package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample0 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 Thread.sleep(2000);
		 driver.navigate().to("https://www.google.com");
		 Thread.sleep(2000);
		 driver.navigate().to("https://www.facebook.com");
		 Thread.sleep(2000);
		 driver.navigate().back();
		 Thread.sleep(2000);
         driver.navigate().refresh();
		 Thread.sleep(2000);
         driver.navigate().forward();
	}



}
