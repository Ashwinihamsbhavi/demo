package demo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frames {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MICROSECONDS);
		driver.get("file:///C:/Users/DELL/Desktop/mainpage.html");
		
			driver.findElement(By.id("un")).sendKeys("hi");
		 WebElement str= driver.findElement(By.xpath("//iframe[@id='f1']"));
		driver.switchTo().frame(str);
		
		driver.findElement(By.id("pwd")).sendKeys("queen");
}
}