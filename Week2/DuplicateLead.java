package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		/*http://leaftaps.com/opentaps/control/main
		 
		1	Launch the browser
		2	Enter the username
		3	Enter the password
		4	Click Login
		5	Click crm/sfa link
		6	Click Leads link
		7	Click Find leads
		8	Click on Email
		9	Enter Email
		10	Click find leads button
		11	Capture name of First Resulting lead
		12	Click First Resulting lead
		13	Click Duplicate Lead
		14	Verify the title as 'Duplicate Lead'
		15	Click Create Lead
		16	Confirm the duplicated lead name is same as captured name
		17	Close the browser (Do not log out)
		
		*/
		
		
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
       	
       	driver.findElement(By.xpath("//span[text()='Email']")).click();
       	driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("akshaya123@gmail.com");
       	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
    	Thread.sleep(2000);
        String firstLead = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]//a")).getText();    	
 	    System.out.println("ID of the first Lead "+firstLead);
 	    driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]//a")).click();
 	    driver.findElement(By.xpath("(//a[@class='subMenuButton' and text()='Duplicate Lead'])")).click();
 	    
 	    driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
 	    String dupLead = driver.findElement(By.id("viewLead_firstName_sp")).getText();
 	    
 	    if (firstLead.contains(dupLead))
 	    	System.out.println("Duplicate lead name is same as captured");
 	    
 	    driver.close();
	}

}
