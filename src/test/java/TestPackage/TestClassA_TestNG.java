package TestPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PomPackage.HomePage;
import PomPackage.LoginPage;
import utility.Pojo;
import utility.ScreenShot;
import utility.Waits;
import utility.excelData;

public class TestClassA_TestNG extends Pojo{
	WebDriver driver;
	
	@BeforeClass
	public void Launch()
	{
	WebDriver driver=chromeDriver();
	//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	this.driver=driver;	
	}
	
	@Test(priority=0)
	public void verifyLogin() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		LoginPage login =new LoginPage(driver);
		
		Thread.sleep(2000);
			
		String data=excelData.exceldata(0, 1);
		
		
		login.sendUserName(data);
		
		
			
		
		login.sendPassword(excelData.exceldata(0,2));
		
		login.clickLogin();
		
		String expectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
		
	    String actualURl=driver.getCurrentUrl();
	
	    Assert.assertEquals(actualURl,expectedURL);
	    
	    ScreenShot.takeScreenShot(driver);
	
	}
	
	@Test(priority=1)
	public void verifyHomepage()
	{
		HomePage homepage=new HomePage(driver);
	boolean result=	homepage.verifyAdminButton();
		
	boolean result1=homepage.verifyleaveTab();
		
	boolean result2=homepage.verifyPIMTab();
	
	SoftAssert s=new SoftAssert();
	
	s.assertTrue(result);
	
	s.assertTrue(result1);
	
	s.assertTrue(result2);
	
	s.assertAll();
		
	}
	
	@AfterClass
	public void afterClass() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	

}
