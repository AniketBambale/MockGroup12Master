package PomPackage;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class WebTable {
	
	

	
	public void verifywebtable(WebDriver driver)
	{
		for(int i=1;i<=6;i++)	
		{
			for(int j=1;j<=3;j++)
			{
				
		ArrayList<WebElement>elements= new ArrayList<WebElement>(driver.findElements(By.xpath("//table[@id='customers']//tr[2]//td[1]")));
		for(int k=0;k<elements.size();k++)
		{
		System.out.println(elements.get(j).getText());
		}
			}
		
	}
	}

}
