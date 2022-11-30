package demo;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo 
{
    public static void main(String[] args) 
    {
    	String key="webdriver.gecko.driver";
    	String value="./software/geckodriver.exe";
    	System.setProperty(key, value);
    	FirefoxDriver fx=new FirefoxDriver();
    
    }
}
