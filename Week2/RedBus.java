package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
//		1.Go to https://www.redbus.in/ in chrome
//			2.Type Chennai in From textBox and ENTER
//			3.Type Bengaluru in Destination textBox and ENTER 
//			4.Choose any date in JULY
//			5.Click Search Buses
//			6.Close the popup using the X button at the right corner
//			7.Print the number of search results
//			8.Choose only Sleeper Bus
//			9.Print the number of search results
//			10.Deselect the sleeper Bus and select the AC bus alone
//			11.Print the number of search results
//			12.Choose also Non AC buses
//			13.Print the number of search results
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.redbus.in");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("src")).sendKeys("Chennai");
		driver.findElement(By.id("src")).sendKeys(Keys.TAB);
		
		driver.findElement(By.id("dest")).sendKeys("Bangalore");
		driver.findElement(By.id("dest")).sendKeys(Keys.TAB);
				
		driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[6]/td[last()-1]")).click();
		driver.findElement(By.id("Search Buses"));
		driver.findElement(By.xpath("//div[@class='close']")).click();
		
		driver.findElement(By.xpath("//label[@title='SLEEPER']")).click();
		String filterResult = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("SLEEPER Filter result is "+filterResult);
		
		driver.findElement(By.xpath("//label[@title='SLEEPER']")).click();
		driver.findElement(By.xpath("//label[@title='AC']")).click();
		
		String filterResult2 = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("AC Filter result is "+filterResult2);
		
		driver.findElement(By.xpath("//label[@title='NONAC']")).click();
		
		String filterResult3 = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("AC and NONAC Filter result is "+filterResult3);
		
		
		
		
		
	}

}
