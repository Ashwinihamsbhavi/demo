package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo18 {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
			 WebDriver driver=new FirefoxDriver();
			 driver.get("http://localhost/login.do");
			 Thread.sleep(2000);
			 driver.findElement(By.name("username")).sendKeys("queen");
			 Thread.sleep(2000);
			 driver.findElement(By.name("pwd")).sendKeys("1234");
			 Thread.sleep(2000);
			 driver.findElement(By.id("loginButton")).click();
		}

	}


