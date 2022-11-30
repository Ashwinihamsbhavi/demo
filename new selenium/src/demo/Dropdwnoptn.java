package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdwnoptn {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("file:///C:/Users/DELL/Desktop/multidropdown.html");
		 WebElement ele=driver.findElement(By.xpath("//select[@id='hotel']"));
		Select s =new Select(ele);
		boolean b=s.isMultiple();
		if(b)
		{System.out.println("it is multi select dropdown");
		}
		else
		{
			System.out.println("it is not a multi select dropdown");
		}
		 
}

}