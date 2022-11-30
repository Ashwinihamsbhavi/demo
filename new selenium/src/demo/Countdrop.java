package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Countdrop
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	 WebDriver driver=new FirefoxDriver();
	 driver.get("file:///C:/Users/DELL/Desktop/multidropdown.html");
		WebElement ele = driver.findElement(By.xpath("//select"));
		Select s = new Select(ele);
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println(size);
	}

}
