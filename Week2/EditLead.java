package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
//		//* 1	Launch the browser
//		* 2	Enter the username
//		* 3	Enter the password
//		* 4	Click Login
//		* 5	Click crm/sfa link
//		* 6	Click Leads link
//		* 7	Click Find leads
//		* 8	Enter first name
//		* 9	Click Find leads butto//		* 10 Click on first resulting lead
//		* 11 Verify title of the page
//		* 12 Click Edit
//		* 13 Change the company name
//		* 14 Click Update
//		* 15 Confirm the changed name appears
//		* 16 Close the browser (Do not log out)
//		//
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
        driver.findElement(By.xpath("//span[text()='Name and ID']//following::input[@name='firstName']")).sendKeys("akshaya");
    	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
    	Thread.sleep(2000);
       	
    	String title= driver.getTitle();
    	String title1= "Find Leads | opentaps CRM";
    	
    	if (title.equals(title1))
    			System.out.println("Title Verified");
    	
    	Thread.sleep(2000);
        String firstLead = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-companyName'])[1]//a")).getText();
 	    System.out.println("Company name of the first Lead "+firstLead);
       	driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]//a")).click();
       	
       	driver.findElementByLinkText("Edit").click();
       	
       	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TestLeafONE");
       	String changedCName = driver.findElement(By.id("updateLeadForm_companyName")).getText();
       	
       	driver.findElement(By.xpath("//input[@value='Update']")).click();
       	
       	String UpdCName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
       	
       	if(UpdCName.contains(changedCName))
       		System.out.println("Changed name is verified");
       	
       	driver.close();
       	
    	
    	
    	
    			
    			
    	
       	
       	
		
		
		
	}

}
