package utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void takeScreenShot(WebDriver driver) throws IOException
	{
		
		Date date=new Date();
		String dateTime=date.toString().replace(" ","_").replace(":","_");
		
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\anike\\Desktop\\ScreenShot\\captured"+dateTime+".jpeg");
		
		FileHandler.copy(source, dest);
			
	}
	
}
