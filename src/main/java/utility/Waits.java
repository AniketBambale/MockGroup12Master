package utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Waits {
	
	public static void implicitWait(WebDriver driver)
	{
//		 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	public static void explicitWait(String s,WebDriver driver,int a)
	{   
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(a));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(s)));
	}
	

}
