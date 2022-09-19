package TestPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utility.Pojo;

public class TestClassB_TestNG extends Pojo{
	
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass()
	{
		WebDriver driver=chromeDriver();
		this.driver=driver;
		
	}
	
	@Test
	public void testA()
	{
		
	}
	
	@BeforeMethod
	public void beforeMethodA()
	{
		System.out.println("BeforeMethod_classB");
	}
	
	
	
	@Test(timeOut=2000)
	public void testb() throws InterruptedException
	{
		System.out.println("TestB_ClassB");
	//Thread.sleep(3000);	
	}
	
	
	
	
	
	@Test
	public void testC()
	{
		System.out.println("TestA_ClassB");
	}
	
	
	@AfterMethod
	public void afterMethodA()
	{
		System.out.println("afterMethoda_ClassB");
	}
	
	
  @AfterClass
	public void afterClassB()
	{
		driver.close();
	}
	
	
}
