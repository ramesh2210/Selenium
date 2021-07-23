package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		* 1. Launch URL "http://leaftaps.com/opentaps/control/login"
//		 * 
//		 * 2. Enter UserName and Password Using Id Locator
//		 * 
//		 * 3. Click on Login Button using Class Locator
//		 * 
//		 * 4. Click on CRM/SFA Link
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
//		 Click on contacts Button
//		 * 
//		 * 6. Click on Create Contact
//		 * 
//		 * 7. Enter FirstName Field Using id Locator
//		 * 
//		 * 8. Enter LastName Field Using id Locator
//		 * 
//		 * 9. Enter FirstName(Local) Field Using id Locator
//		 * 
//		 * 10. Enter LastName(Local) Field Using id Locator
//		 * 
//		 * 11. Enter Department Field Using any Locator of Your Choice
//		 * 
//		 * 12. Enter Description Field Using any Locator of your choice
//		 * 
//		 * 13. Enter your email in the E-mail address Field using the locator of your
//		 * choice
//		 * 
//		 * 14. Select State/Province as NewYork Using Visible Text
//		 * 
//		 * 15. Click on Create Contact
//		 * 
		
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Ramesh");
		driver.findElement(By.id("lastNameField")).sendKeys("M");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Ramesh");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("M");
		driver.findElement(By.name("departmentName")).sendKeys("Information Technology");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Sample Description");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Testmail@gmail.com");
		
		WebElement findElement = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select drpDwn1 = new Select(findElement);
		drpDwn1.selectByVisibleText("New Jersey");
		
		driver.findElement(By.name("submitButton")).click();
		
		
		 
//		 * 16. Click on edit button
//		 * 
//		 * 17. Clear the Description Field using .clear
//		 * 
//		 * 18. Fill ImportantNote Field with Any text
//		 * 
//		 * 19. Click on update button using Xpath locator
//		 * 
//		 * 20. Get the Title of Resulting Page
//		
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Important Notice Text");
		
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println("Current URL is "+driver.getCurrentUrl());
		System.out.println("Current Page Title is" +driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
