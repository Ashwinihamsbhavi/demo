import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel1
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	FileInputStream fis = new FileInputStream("./Excel/OS.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh = book.getSheet("Sheet2");
	Row r = sh.getRow(0);
	Cell c = r.getCell(0);
    String value = c.getStringCellValue();
    System.out.println(value);
	
	}

}
