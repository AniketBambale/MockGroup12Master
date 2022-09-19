package PomPackage;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	
	
	static WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath="//span[text()='Admin']")
	private WebElement admin;
	
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement PIM;
	
	@FindBy(xpath="//span[text()='Leave']")
	private WebElement leavetab;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		PageFactory.initElements(driver,this);
	}
	
	public boolean verifyAdminButton()
	{
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Admin']")));
	boolean result=	admin.isDisplayed();
		return result;
	}
	
	public boolean verifyPIMTab()
	{
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='PIM']")));
	boolean result=	PIM.isDisplayed();
	return result;
	}
	
	public boolean verifyleaveTab()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Leave']")));
	
		boolean result=leavetab.isDisplayed();
		return result;
	}

}
