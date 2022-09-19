package TestPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomPackage.HomePage;
import PomPackage.LoginPage;

public class TestClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		LoginPage login=new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		login.sendUserName("Admin");
		login.sendPassword("admin123");
		login.clickLogin();
		
		HomePage homepage=new HomePage(driver);
		homepage.verifyAdminButton();
		homepage.verifyPIMTab();
		homepage.verifyleaveTab();
		
		
		
		
		
	}

}
