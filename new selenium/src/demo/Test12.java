package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 Thread.sleep(1000);
		 driver.manage().window().maximize();
}
}
