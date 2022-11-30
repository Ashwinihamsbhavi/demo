package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("file:///C:/Users/DELL/Desktop/multidropdown.html");
		WebElement ele=driver.findElement(By.xpath("//select[@id='hotel']"));
		Thread.sleep(2000);
		Select s= new Select(ele);
		Thread.sleep(2000);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByVisibleText("vada");
		Thread.sleep(2000);
		s.deselectAll();
		
		
}
}      
