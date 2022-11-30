package demo;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		
		 String key="webdriver.gecko.driver";
			String value="./software/geckodriver.exe";
			System.setProperty(key, value);
			FirefoxDriver fx=new FirefoxDriver();
			Thread.sleep(5000);
			fx.quit();

	}

}
