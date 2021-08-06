package week4.day1;

import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

			public static void main(String[] args) {
				
				/*
				 * //Pseudo Code
				 * 
				 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
				 * 
				 * 2. Enter UserName and Password Using Id Locator
				 * 
				 * 3. Click on Login Button using Class Locator
				 * 
				 * 4. Click on CRM/SFA Link
				 * 
				 * 5. Click on contacts Button
				 * 	
				 * 6. Click on Merge Contacts using Xpath Locator
				 * 
				 * 7. Click on Widget of From Contact
				 * 
				 * 8. Click on First Resulting Contact
				 * 
				 * 9. Click on Widget of To Contact
				 * 
				 * 10. Click on Second Resulting Contact
				 * 
				 * 11. Click on Merge button using Xpath Locator
				 * 
				 * 12. Accept the Alert
				 * 
				 * 13. Verify the title of the page
				 */
				
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
			    driver.get("http://leaftaps.com/opentaps/control/login");
			    
			    
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElementByClassName("decorativeSubmit").click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.xpath("//a[text()='Contacts']")).click();
				driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
				
				driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdFrom']//following-sibling::a")).click();
				
				Set<String> windowHandle = driver.getWindowHandles();
				System.out.println("Size of the Window is "+windowHandle.size());
				
				List<String> windowHandle1 = new ArrayList<String>(windowHandle);
				driver.switchTo().window(windowHandle1.get(1));
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]")).click();
				driver.switchTo().window(windowHandle1.get(0));
				driver.findElement(By.xpath("//a[text()='Merge']")).click();
				
				Alert alert = driver.switchTo().alert();
				alert.accept();
				
				String title = "Merge Contacts | opentaps CRM";
				String title1 = driver.getTitle();
				if (title.equals(title1)) {
					System.out.println("Verified title is" +title);
				}
				
				
				
				
				
				
				
				
				
				
				
				
			}

		

	}


