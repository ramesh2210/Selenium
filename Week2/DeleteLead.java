package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		Delete Lead:
//			1	Launch the browser
//			2	Enter the username
//			3	Enter the password
//			4	Click Login
//			5	Click crm/sfa link
//			6	Click Leads link
//			7	Click Find leads
//			8	Click on Phone
//			9	Enter phone number
//			10	Click find leads button
//			11	Capture lead ID of First Resulting lead
//			12	Click First Resulting lead
//			13	Click Delete
//			14	Click Find leads
//			15	Enter captured lead ID
//			16	Click find leads button
//			17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
//			18	Close the browser (Do not log out)	
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
       	driver.findElement(By.linkText("Find Leads")).click();
       	
       	System.out.println("Step1");
       	
       
       	driver.findElement(By.xpath("//span[text()='Phone']")).click();
       	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9500702882");
       	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
       	
       	System.out.println("Step2");
   
       	Thread.sleep(2000);
       String firstLead = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]//a")).getText();
  
	   System.out.println("ID of the first Lead "+firstLead);
      	
       	driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]//a")).click();
      	
      	driver.findElementByLinkText("Delete").click();
       	
      	driver.findElement(By.linkText("Find Leads")).click();
       	
       	driver.findElement(By.xpath("//label[contains(text(),'Lead ID')]//following::input")).sendKeys(firstLead);
      	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
     	
     	System.out.println("Step3");
       	
   driver.close();
	
       	
       	
       
       	
       	
       	
       	
		
		
		
		
	}

}
