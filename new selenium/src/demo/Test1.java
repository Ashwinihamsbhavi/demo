package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("file:///C:/Users/DELL/Desktop/displayed.html");
		 Thread.sleep(2000);
		 WebElement ele=driver.findElement(By.id("a1"));
		 boolean b=ele.isDisplayed();
		 if(b)
		 {
			 System.out.println("textfield is present");
		 }else {
			System.out.println("textfield is absent");
		}

	}

}
