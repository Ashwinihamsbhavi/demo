package demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("file:///C:/Users/DELL/Desktop/Qsp.html");  
		 driver.findElement(By.tagName("a")).click();
	}

		 

	}


