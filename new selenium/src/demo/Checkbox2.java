package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("file:///C:/Users/DELL/Desktop/checkbox.html");
		 Thread.sleep(2000);
		 List<WebElement> eles=driver.findElements(By.xpath("//input"));
		 
		
		for(WebElement value:eles)
		 {
			 value.sendKeys("queen");
			 Thread.sleep(2000);
			 value.clear();

		 }
		 int size=eles.size();
		 for(int i=size-1;i>=0;i--)
		 {
			 eles.get(i).click();
			 Thread.sleep(2000);

			 
		 }
		
	}
}

