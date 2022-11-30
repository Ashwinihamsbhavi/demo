package demo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class sync {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/?tag=admpdesktopin-21&ref=pd_sl_c65193592a4fe97d17b367c141d0dd9fac15ff48acf2de90c3f3a85c&mfadid=adm");
		
		driver.findElement(By.xpath("//input[@ type='text'] ")).sendKeys("shoes");
		
		
		
	}
}

