package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test3 
{
	public static void main(String[] args)throws InterruptedException { 
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("file:///C:/Users/DELL/Desktop/selected.html");
		Thread.sleep(2000);
		 WebElement ele=driver.findElement(By.id("c1"));
		 boolean b=ele.isSelected();
		 if(b)
		 {
			 System.out.println("checkbox is selected");
		 }
		 else 
		 {
			System.out.println("checkbox is not selected");
		}
	
	}
}
	


