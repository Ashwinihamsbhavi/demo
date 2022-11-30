package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://demo.guru99.com/test/delete_customer.php");
		 Thread.sleep(1000);
		 
		driver.findElement(By.name("admin")).sendKeys("admin");
		 Thread.sleep(1000);

		 driver.findElement(By.name("submit")).click();
		 Thread.sleep(1000);
		 Alert a = driver.switchTo().alert();
		 a.accept();
}
}
