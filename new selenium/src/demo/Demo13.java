package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo13 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("file:///C:/Users/DELL/Desktop/Qsp.html");
		 Thread.sleep(3000);
		 driver.findElement(By.name("n1")).click();
	}

	}


