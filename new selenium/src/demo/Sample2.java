package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample2 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
			 WebDriver driver=new FirefoxDriver();
			 driver.get("https://www.google.com/maps/@12.9728512,77.6142848,12z");
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("hArJGc")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("input[id='searchboxinput']")).sendKeys("banglore,karnataka");
			 Thread.sleep(2000);
			 
		}

	}


	


