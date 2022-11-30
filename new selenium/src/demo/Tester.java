package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tester {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
			 WebDriver driver=new FirefoxDriver();
			 driver.get("http://localhost/login.do");
			 Thread.sleep(2000);
			 driver.findElement(By.id("username")).sendKeys("admin");
			 Thread.sleep(2000);
			 driver.findElement(By.name("pwd")).sendKeys("manager");
			 Thread.sleep(2000);
			 driver.findElement( By.xpath("//div[.='Login ']")).click();
			 Thread.sleep(2000);
			 String title=driver.getTitle();
			 if(title.contains("actiTIME"))
			 {
				 System.out.println("title is present");
			 }
			 else
			 {
				 System.out.println("title is not present");
			 }

		}
}
