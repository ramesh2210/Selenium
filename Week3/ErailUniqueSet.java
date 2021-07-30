package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailUniqueSet {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 
		 driver.get("https://erail.in/");
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
         driver.findElement(By.xpath("//label[text()='Sort on Date']")).click();	 

		 driver.findElement(By.id("txtStationFrom")).clear();
		 driver.findElement(By.id("txtStationFrom")).sendKeys("MS",Keys.ENTER);
         driver.findElement(By.id("txtStationTo")).clear();
		 driver.findElement(By.id("txtStationTo")).sendKeys("MDU",Keys.ENTER);
		

		 System.out.println(driver.findElement(By.xpath("//input[@value='Get Trains']")).getText());
		 driver.findElement(By.xpath("//input[@value='Get Trains']")).click();
		 Thread.sleep(2000);
		 
		 List<WebElement> trainName = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//td[2]/a");
		 int totalTrains = trainName.size();
		 System.out.println("totalTrains" +totalTrains);
		
         List<String> addTrainName = new ArrayList<String>();
         
         for (int i = 0; i < totalTrains; i++) {
         	String text = trainName.get(i).getText();
         	addTrainName.add(text);
         
 		}
         
		for (WebElement webElement : trainName) 
		{
			String result = webElement.getText();
				System.out.println(result);
			}
		
		Set<String> setTrain = new HashSet<String>(addTrainName);
						
		int size1 = setTrain.size();
		System.out.println("Set Size is :" +size1);
		}
		
		

	}


