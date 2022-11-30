package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Loginacti {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://in.bookmyshow.com");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[.='Bengaluru']")).click();
		 Thread.sleep(3000);

		 driver.findElement(By.xpath("//div[.='Guru Shishyaru']")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//div[@class='sc-1vaplep-2 cbdnYr']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//span[.='Facebook']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//label[.='Email address or phone number:']")).sendKeys("ashwinishikari1@gmail.com");
		 Thread.sleep(3000);
 
 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9353214436");
 Thread.sleep(3000);
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
	 
	
		

}
}