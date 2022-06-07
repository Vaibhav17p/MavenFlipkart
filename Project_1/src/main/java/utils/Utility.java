package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static File captureScreenShot(WebDriver driver,int a) throws IOException
	{
		
		TakesScreenshot t=(TakesScreenshot)driver;
	    File source =t.getScreenshotAs(OutputType.FILE);
	    File dest = new File("test-output//SnapShot//FailedTC_FK"+a+".jpeg");
	   // Thread.sleep(3000);
	    FileHandler.copy(source, dest);
		return dest;
		
	}
	
	//public static String getdataeXcelSHeet(String sheetName,int a, int b) throws EncryptedDocumentException, IOException {
		
		//String data;
		String path= "C:\\Users\\ADMIN\\Desktop\\Data.xlsx";
		//FileInputStream file= new FileInputStream(path);
		Workbook book = WorkbookFactory.create(file);
		try {
			data=book.getSheet("Sheet1").getRow(a).getCell(b).getStringCellValue();
		}
	    catch(IllegalStateException e){
		//	double value=book.getSheet(sheetName).getRow(a).getCell(b).getStringCellValue();
			//data=Double.toString(num);
		}
	//	return data;
		return path;
	}
//
	}

	

