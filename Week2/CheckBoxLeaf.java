package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxLeaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		 ChromeDriver driver=new ChromeDriver();
		 
		 driver.get("http://leafground.com/pages/checkbox.html");
		 
		driver.findElement(By.xpath("//label[text()='Select the languages that you know?']//following::input")).click();
		
		Boolean result = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']//following::input")).isSelected();
		 
		System.out.println(result);
		
		driver.findElement(By.xpath("//label[text()='DeSelect only checked']//following::input[2]")).sendKeys(Keys.SPACE);
		
		
		
		
		
	}

}
