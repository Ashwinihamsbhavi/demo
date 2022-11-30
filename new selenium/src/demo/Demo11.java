package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	    WebDriver driver= new FirefoxDriver();
	    driver.get("file:///C:/Users/DELL/Desktop/text.html");
	    Thread.sleep(3000);
	    driver.findElement(By.tagName("a")).click();

	}

}
