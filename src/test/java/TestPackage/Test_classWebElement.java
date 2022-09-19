package TestPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PomPackage.WebTable;
import utility.Pojo;

public class Test_classWebElement extends Pojo{
	WebDriver driver;
	
	@BeforeClass
	public void driver()
	{
		 driver=chromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		
	}
	
	@Test
	public void verifywebtable()
	{
		WebTable table=new WebTable();
		
		table.verifywebtable(driver);
	}
	

}
