package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNowFrames {

	public static void main(String[] args) {
//		Instance URL: https://dev113545.service-now.com/
//			Username: c
//			Password: m3GkKEKU8atr
//
//			Step1: Load ServiceNow application URL given above
//			Step2: Enter username as admin
//			Step3: Enter password as m3GkKEKU8atr
//			Step4: Click Login
//			Step5: Search “incident “ Filter Navigator
//			Step6: Click “All”
//			Step7: Click New button
//			Step8: Select a value for Caller and Enter value for short_description
//			Step9: Read the incident number and save it a variable
//			Step10: Click on Submit button
//			Step 11: Search the same incident number in the next search screen as below
//			Step12: Verify the incident is created successful

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://dev113546.service-now.com/");
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@title='Main Content']"));
		
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("m3GkKEKU8atr");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("incident",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='b55b4ab0c0a80009007a9c0f03fb4da9']/div/div")).click();
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@title='Incidents | ServiceNow']"));
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.xpath("//button[text()='New']")).click();
		
		WebElement frame3 = driver.findElement(By.xpath("//iframe[@title='Create INC0010336 | Incident | ServiceNow']"));
		driver.switchTo().frame(frame3);
		
		 driver.findElement(By.xpath("//button[text()='New']")).click();
		 
		 WebElement caller = driver.findElement(By.xpath("//input[@id='sys_display.incident.caller_id']"));
		 
	     Select caller1 = new Select(caller);
		 int size = caller1.getOptions().size();
		 caller1.selectByVisibleText("Fred Luddy");
		 
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
