package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.amazon.in");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shoes");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();


}
}