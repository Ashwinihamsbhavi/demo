package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			 driver.get("http://localhost/login.do");
			 Thread.sleep(2000);
			 driver.findElement(By.name("search_query")).sendKeys("gumma banda gumma");
			 Thread.sleep(2000);
			 driver.findElement(By.id("search-icon-legacy")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.linkText("The Devil's Fury - Gumma Banda Gumma | Theme Song Hindi | Vikrant Rona | Kichcha Sudeep | Anup\r\n"
			 		+ "")).click();
		}



	}

}
