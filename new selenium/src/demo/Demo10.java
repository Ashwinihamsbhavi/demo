package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo10 {
	 public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	    WebDriver driver= new FirefoxDriver();
	    driver.get("file:///C:/Users/DELL/Desktop/text.html");
	    Thread.sleep(3000);
	    driver.findElement(By.id("a1")).click();
	 }
		
	}


