package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclk {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		 Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
		 Actions a = new Actions (driver);
		 a.doubleClick(ele).perform();

}
}
	