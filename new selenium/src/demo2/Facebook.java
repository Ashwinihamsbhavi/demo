package demo2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table.Cell;

public class Facebook {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		FileInputStream file=new FileInputStream("/Excel./fb.xlsx");
		
		Workbook book = WorkbookFactory.create(file);
		
		Sheet sh =    book.getSheet("Sheet1");
		
		Row r =  sh.getRow(0);
		
		
		Cell c =    r.getCell(0);
		
		String value = c.toString();
		Row r1 =   ((org.apache.poi.ss.usermodel.Sheet) sh).getRow(1);
		Cell c1 =   (Cell) r1.getCell(0);
		String value2 = c1.toString();
		
		
		System.out.println(value);
		System.out.println(value2);
		System.setProperty("webdriver.chrome.driver", "./automationtester/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(value);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(value2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	
	}

}
