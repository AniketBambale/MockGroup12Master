package PomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Waits;

public class LoginPage  {
	
	static WebDriver driver;//input[@name='username']
	WebDriverWait wait;//wait
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy (xpath="//button[text()=' Login ']")
	private WebElement login;
	
	public LoginPage(WebDriver driver)
	{
	 this.driver=driver;
	 wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	 PageFactory.initElements(driver,this);
	 
	}
	
	
	public void sendUserName(String s)
	{
		//Waits.implicitWait(driver);
		Waits.explicitWait("//input[@name='username']", driver,10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
	    username.sendKeys(s);
	   
	}
	
	public void sendPassword(String s)
	{
		
		//Waits.explicitWait("//input[@name='password']", driver);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
		password.sendKeys(s);
	}
	
	
	public void clickLogin()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Login ']")));
		login.click();
	}
}
