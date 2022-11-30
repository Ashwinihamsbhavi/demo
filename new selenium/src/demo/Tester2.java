package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tester2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
         driver.get("https://www.instagram.com/");
         driver.findElement( By.xpath("//input[@name='username']")).sendKeys("as.hwini4456");
         Thread.sleep(1000);
         driver.findElement(By.xpath("//input[@name='password']")).sendKeys("224401");
         Thread.sleep(1000);
         driver.findElement(By.xpath("//button[@type='submit']")).click();
     
	}

}
