package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathCreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
		 ChromeDriver driver=new ChromeDriver();
		 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
		    driver.findElement(By.linkText("CRM/SFA")).click();
	       	driver.findElement(By.linkText("Leads")).click();
	       	driver.findElement(By.linkText("Create Lead")).click();
	       	
	       	
	       	driver.findElements(By.xpath("//input[@id='createLeadForm_companyName']"));
	       	driver.findElements(By.xpath("//input[@name='firstNameLocal']"));
	       	driver.findElements(By.xpath("(//input[@class='inputBox'])[4]"));
	       	
	       	
	       	
	}

}
