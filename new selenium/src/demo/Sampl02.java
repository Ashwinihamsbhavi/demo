package demo;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sampl02 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.google.com");
		 Thread.sleep(2000);
		 Point p=new Point(400,500);
		 driver.manage().window().setPosition(p);
	}
}
