package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsNWindow {

	public static void main(String[] args) throws InterruptedException {
//		1. Load https://www.irctc.co.in/
//			2. Click on OK button in the dialog  
//			3. Click on FLIGHTS link            
//			4. Go to the Flights tab
//			5. Print the customer care email id
//			6. Take a screenshot if this web page.
//			6. Close the First tab(Train ticket booking) alone 
		
		
		 WebDriverManager.chromedriver().setup();
		 //ChromeDriver driver=new ChromeDriver();
		 ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			ChromeDriver driver = new ChromeDriver(options);
		 driver.get("https://www.irctc.co.in/");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		
		List<String> windowHandlesList = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(windowHandlesList.get(1));
		String mail = driver.findElement(By.xpath("//a[text()=' flights@irctc.co.in']")).getText();
		System.out.println("Mail id is : "+mail);
		
		driver.switchTo().window(windowHandlesList.get(0));
		driver.close();
		
		
		
		
		
		 
		 

	}

}
