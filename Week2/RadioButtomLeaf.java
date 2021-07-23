package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtomLeaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		 ChromeDriver driver=new ChromeDriver();
		 
		 driver.get("http://leafground.com/pages/radio.html");		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//label[@for='yes']")).click();
		 
		System.out.println(driver.findElement(By.xpath("//label[@for='Checked']")).getText());
		
		Boolean result = driver.findElement(By.xpath("//input[contains(@type,'radio')]//following::input[last()-1]")).isSelected();
		
		System.out.println(result);
		
		
		 	
		
	}

}
