package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonLeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
		 ChromeDriver driver=new ChromeDriver();
		 
		 driver.get("http://leafground.com/pages/Button.html");
		 
		 driver.findElement(By.xpath("//button[@id='home']")).click();
		 
		 driver.findElement(By.xpath("//a[@href ='pages/Button.html']")).click();
		 
		 WebElement loc = driver.findElement(By.xpath("//button[@id='position']"));
		 System.out.println(loc.getLocation());
		 
		 System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
		
		 
	   WebElement size1 = driver.findElement(By.xpath("//button[@id='size']"));
		System.out.println(size1.getSize());
		
	}

}

