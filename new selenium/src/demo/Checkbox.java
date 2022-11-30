package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Checkbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/DELL/Desktop/for.html");
		 List<WebElement> eles=driver.findElements(By.xpath("//input"));
		for(WebElement value1:eles)

			value1.click();
			Thread.sleep(2000);
		}
}
