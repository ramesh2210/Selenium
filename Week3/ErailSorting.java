package week3.day2;




import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSorting {

	public static void main(String[] args)  throws InterruptedException {


//		Assignment 2: ErailSorting
//		1.Launch the browser
//		2.Launch the URL - https://erail.in/
//				

		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 
		 driver.get("https://erail.in/");
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 

//		3.Uncheck the check box - sort on date
		 
			 driver.findElement(By.xpath("//label[text()='Sort on Date']")).click();	 
		  
				
//		4.clear and type in the source station 
		 
		 driver.findElement(By.id("txtStationFrom")).clear();
		 driver.findElement(By.id("txtStationFrom")).sendKeys("MS");
		 driver.findElement(By.id("txtStationFrom")).sendKeys(Keys.TAB);
		 
//				
//		5.clear and type in the destination station
     	driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("MDU");
		driver.findElement(By.id("txtStationTo")).sendKeys(Keys.TAB);
		 
//		6.Find all the train names using xpath and store it in a list
		 
		 System.out.println(driver.findElement(By.xpath("//input[@value='Get Trains']")).getText());
		 driver.findElement(By.xpath("//input[@value='Get Trains']")).click();
		 Thread.sleep(2000);
		 
		 List<WebElement> trainName = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//td[2]/a");
		 int totalTrains = trainName.size();
		 System.out.println("totalTrains" +totalTrains);
		
         List<String> addTrainName = new ArrayList<String>();
			 
        		
			for (WebElement webElement : trainName) {
				String result = webElement.getText();
				System.out.println(result);
			}
			
			Collections.sort(addTrainName);
		
		}

	
}
		

	


