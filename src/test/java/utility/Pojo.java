package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Pojo {
	
	public static WebDriver chromeDriver()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		return driver;
	}
   
	
	public static WebDriver microsoftEdge()
	{
		System.setProperty("webdriver.edge.driver","D:\\Selenium\\Drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		return driver;
	}
}
