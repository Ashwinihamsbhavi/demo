package demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo5 {
public static void main(String[] args) {
	String key1="webdriver.chrome.driver";
	String value1="./software/chromedriver.exe";
	System.setProperty(key1, value1);
	ChromeDriver ch = new ChromeDriver();
	String key2="webdriver.gecko.driver";
	String value2="./software/geckodriver.exe";
	System.setProperty(key2, value2);
	ch=new ChromeDriver();
	FirefoxDriver Fx = new FirefoxDriver();
	Thread.sleep(5000);
	fx.close();
	fx.quit();
}
}
}
